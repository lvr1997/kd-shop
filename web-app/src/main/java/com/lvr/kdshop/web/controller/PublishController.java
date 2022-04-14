package com.lvr.kdshop.web.controller;

import cn.hutool.core.util.IdUtil;
import com.lvr.kdshop.annotation.UserLoginToken;
import com.lvr.kdshop.business.service.*;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.constant.StatusEnum;
import com.lvr.kdshop.pojo.*;
import com.lvr.kdshop.util.JSONResult;
import com.lvr.kdshop.web.utils.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/publish")
public class PublishController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private UserService userService;

    @Resource
    private CatelogService catelogService;

    @Resource
    private GoodsService goodsService;

    @Resource
    private ImageService imageService;

    @Resource
    private ReportService reportService;

    @Value("${imagesPath}")
    private String imgPath;


    /**
     * 上传商品图片
     *
     * @param fileName 图片文件名
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @UserLoginToken
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public JSONResult uploadFile(@RequestParam("userId") String userId, @RequestParam("fileName") MultipartFile fileName, HttpServletRequest request) throws IllegalStateException, IOException {
        //获取上传文件的原名
        String oldName = fileName.getOriginalFilename();

        //存储图片的物理路径
        String realPath = imgPath + "/goods";
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        //上传图片
        if(fileName!=null && oldName!=null && oldName.length()>0){
            //校验文件名后缀
            String suffix = oldName.substring(fileName.getOriginalFilename().lastIndexOf("."));
            suffix = suffix.toLowerCase();
            if (suffix.equals(".jpg") || suffix.equals(".jpeg") || suffix.equals(".png")) {
                //根据UUID生成新的文件名
                String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));

                try {
                    fileName.transferTo(new File(folder, newName));
                } catch (IOException e) {
                    return JSONResult.fail(StatusEnum.FAIL.getCode(), Constant.UPLOAD_ERROR);
                }
                //得到新的上传路径
                String url = request.getScheme() + "://" + request.getServerName() + ":" + request
                        .getServerPort() + "/upload" + "/goods" + newName;

                logger.info("获取到最新的上传路径=====》", url);

                return JSONResult.success(Constant.UPLOAD_SUCCESS, url);
            } else {
                //上传文件类型错误
                return JSONResult.fail(StatusEnum.FAIL.getCode(), Constant.UPLOAD_FILE_TYPE_ERROR);
            }

        }else{

            return JSONResult.fail(StatusEnum.FAIL.getCode(), Constant.UPLOAD_ERROR);
        }

    }

    /**
     * 删除上传的缓存商品图片
     *
     * @param fileName 图片名称
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/delete_image",method = RequestMethod.POST)
    public JSONResult delectUploadFile(@RequestParam("fileName") String fileName){
        //获得物理路径
        String true_path = imgPath;
        //设置文件的存储路径
        String file_name = true_path+"\\goods\\"+fileName;
        File file1 = new File(file_name);
        //判断文件是否存在
        if (file1.exists()) {
            //删除文件
            file1.delete();
            return JSONResult.success(Constant.SUCCESS_OPERATION);
        }
        //返回信息

        return JSONResult.fail(StatusEnum.FAIL.getCode(), StatusEnum.FAIL.getMsg());
    }

    /**
     * 处理发布闲置
     * @param goods 闲置物品信息
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "/complete",method = RequestMethod.POST)
    public JSONResult handlePublishComplete(@RequestParam("userId") String userId,
                                            @RequestParam("goods") Goods goods,
                                            @RequestParam("goodImages") MultipartFile good_images){

        System.out.println("publish->CatelogId:"+goods.getCatelogId());

        //设置闲置初始信息
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        goods.setStartTime(sdf.format(new Date()));
        goods.setPolishTime(sdf.format(new Date()));
        //goods.setCommetNum(0);

        //获取用户信息
        SysUser user = userService.selectByPrimaryKey(userId);
        goods.setUserId(user.getUserId());
        goodsService.insert(goods);
        //更新对应的闲置分类数量
        Catelog catelog = catelogService.selectByPrimaryKey(goods.getCatelogId());
        catelogService.updateCatelogNum(goods.getCatelogId(),catelog.getNumber()+1);

        //插入闲置对应的图片信息  自动生成uuid的图片名称
        String imageName = IdUtil.randomUUID();
        new ImageUtil().imageupload(good_images,imageName);
        Image image = new Image(1,goods.getId(),imageName);
        imageService.insert(image);

        //更新用户闲置物品数量
        //userService.updateGoodsNum(user.getId(),user.getGoodsNum()+1);

        //返回响应json数据
        return JSONResult.success(Constant.SUCCESS_OPERATION);
    }

    @UserLoginToken
    @RequestMapping(value = "/delete_good",method = RequestMethod.POST)
    public JSONResult delete_good(@RequestParam("gid") Integer gid){

        System.out.println("gid:"+gid);

        //根据闲置id更新闲置状态
        Goods goods = goodsService.selectByPrimaryKey(gid);
        Catelog catelog = catelogService.selectByPrimaryKey(goods.getCatelogId());
        catelogService.updateCatelogNum(goods.getCatelogId(),catelog.getNumber()-1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        goodsService.updateStatusByPrimaryKey(gid,(byte)2);
        goodsService.updateEndTimeByPrimaryKey(gid,sdf.format(new Date()));

        return JSONResult.success(Constant.SUCCESS_OPERATION);
    }

    @UserLoginToken
    @RequestMapping(value = "/reflash",method = RequestMethod.POST)
    public JSONResult reflash_good(@RequestParam("gid") Integer gid){

        //根据闲置id擦亮闲置信息
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        goodsService.updatePolishTimeByPrimaryKey(gid,sdf.format(new Date()));

        return JSONResult.success(Constant.SUCCESS_OPERATION);
    }

    /**
     *
     * @param gid 闲置物品id
     * @param good_title 闲置物品名称
     * @param description 举报描述
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/report")
    public JSONResult report(@RequestParam("userId")String userId,
                             @RequestParam("gid") Integer gid,
                             @RequestParam("good_title") String good_title,
                             @RequestParam("description") String description){
        System.out.println("gid:"+gid+", good_title:"+good_title+", description:"+description);

        Report report = new Report();
        report.setType(Constant.REPORT_TYPE);
        report.setGoodId(gid);
        report.setUserId(userId);
        report.setContent(description);
        reportService.insert(report);

        return JSONResult.success(Constant.SUCCESS_OPERATION);
    }

}
