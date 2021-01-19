package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.ImageMapper;
import com.lvr.kdshop.domain.Image;
import com.lvr.kdshop.service.IImageService;

/**
 * 闲置图片Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class ImageServiceImpl implements IImageService 
{
    @Autowired
    private ImageMapper imageMapper;

    /**
     * 查询闲置图片
     * 
     * @param id 闲置图片ID
     * @return 闲置图片
     */
    @Override
    public Image selectImageById(Long id)
    {
        return imageMapper.selectImageById(id);
    }

    /**
     * 查询闲置图片列表
     * 
     * @param image 闲置图片
     * @return 闲置图片
     */
    @Override
    public List<Image> selectImageList(Image image)
    {
        return imageMapper.selectImageList(image);
    }

    /**
     * 新增闲置图片
     * 
     * @param image 闲置图片
     * @return 结果
     */
    @Override
    public int insertImage(Image image)
    {
        return imageMapper.insertImage(image);
    }

    /**
     * 修改闲置图片
     * 
     * @param image 闲置图片
     * @return 结果
     */
    @Override
    public int updateImage(Image image)
    {
        return imageMapper.updateImage(image);
    }

    /**
     * 批量删除闲置图片
     * 
     * @param ids 需要删除的闲置图片ID
     * @return 结果
     */
    @Override
    public int deleteImageByIds(Long[] ids)
    {
        return imageMapper.deleteImageByIds(ids);
    }

    /**
     * 删除闲置图片信息
     * 
     * @param id 闲置图片ID
     * @return 结果
     */
    @Override
    public int deleteImageById(Long id)
    {
        return imageMapper.deleteImageById(id);
    }

    @Override
    public List<Image> selectImagesByGoodId(Long id) {
        return imageMapper.selectImagesByGoodId(id);
    }
}
