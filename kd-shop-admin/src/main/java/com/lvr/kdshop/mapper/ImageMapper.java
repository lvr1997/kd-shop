package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Image;

/**
 * 闲置图片Mapper接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface ImageMapper 
{
    /**
     * 查询闲置图片
     * 
     * @param id 闲置图片ID
     * @return 闲置图片
     */
    public Image selectImageById(Long id);

    /**
     * 查询闲置图片列表
     * 
     * @param image 闲置图片
     * @return 闲置图片集合
     */
    public List<Image> selectImageList(Image image);

    /**
     * 新增闲置图片
     * 
     * @param image 闲置图片
     * @return 结果
     */
    public int insertImage(Image image);

    /**
     * 修改闲置图片
     * 
     * @param image 闲置图片
     * @return 结果
     */
    public int updateImage(Image image);

    /**
     * 删除闲置图片
     * 
     * @param id 闲置图片ID
     * @return 结果
     */
    public int deleteImageById(Long id);

    /**
     * 批量删除闲置图片
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteImageByIds(Long[] ids);

    /**
     * 根据闲置物品查询对应闲置图片
     *
     * @param id 闲置物品id
     * @return 图片集合
     */
    List<Image> selectImagesByGoodId(Long id);
}
