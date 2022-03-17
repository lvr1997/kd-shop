package com.lvr.kdshop.business.service;


import com.lvr.kdshop.pojo.Carousel;

import java.util.List;

public interface CarouselService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbggenerated
     */
    int insert(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbggenerated
     */
    Carousel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbggenerated
     */
    List<Carousel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Carousel record);

    int updateStatusByPrimaryKey(Integer id, Byte status);

    List<Carousel> selectCarouselByStatus(Byte status);

    List<Carousel> searchCarouselByTitleOrDescript(String title, String descript);
}
