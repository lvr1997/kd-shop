package com.lvr.kdshop.business.mapper;

import com.lvr.kdshop.pojo.Carousel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarouselMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int insert(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    Carousel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    List<Carousel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Carousel record);

    int updateStatusByPrimaryKey(@Param("id") Integer id, @Param("status") Byte status);

    List<Carousel> selectCarouselByStatus(@Param("status") Byte status);

    List<Carousel> searchCarouselByTitleOrDescript(@Param("title") String title, @Param("descript") String descript);
}