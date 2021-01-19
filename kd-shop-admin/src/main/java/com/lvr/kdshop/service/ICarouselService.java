package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Carousel;

/**
 * 轮播图Service接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface ICarouselService 
{
    /**
     * 查询轮播图
     * 
     * @param id 轮播图ID
     * @return 轮播图
     */
    public Carousel selectCarouselById(Long id);

    /**
     * 查询轮播图列表
     * 
     * @param carousel 轮播图
     * @return 轮播图集合
     */
    public List<Carousel> selectCarouselList(Carousel carousel);

    /**
     * 新增轮播图
     * 
     * @param carousel 轮播图
     * @return 结果
     */
    public int insertCarousel(Carousel carousel);

    /**
     * 修改轮播图
     * 
     * @param carousel 轮播图
     * @return 结果
     */
    public int updateCarousel(Carousel carousel);

    /**
     * 批量删除轮播图
     * 
     * @param ids 需要删除的轮播图ID
     * @return 结果
     */
    public int deleteCarouselByIds(Long[] ids);

    /**
     * 删除轮播图信息
     * 
     * @param id 轮播图ID
     * @return 结果
     */
    public int deleteCarouselById(Long id);
}
