package com.lvr.ihave.web.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 图片工具类
 * @ClassName ImageUtil
 * @Author lan
 * @Date 2021/4/18 20:10
 **/
@Component
public class ImageUtil {
    /**上传地址*/
    public  static String imagesPath;
    @Value("${imagesPath}")
    public void setImagesPath(String imagesPath) {
        ImageUtil.imagesPath = imagesPath;
    }

    /**
     * 上传图片
     * @param image   图片资源
     * @param fileName 图片名称
     * @return
     */
    public boolean imageupload(MultipartFile image,String fileName) {
        //图片
        if (image == null) {
            return false;
        } else if (image.isEmpty()) {
            return false;
        } else {
            // 定义上传文件保存路径
            String path = imagesPath;
            // 新建文件
            File filepath = new File(path,fileName);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            try {
                // 写入文件
                image.transferTo(new File(path + File.separator + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
    }
}
