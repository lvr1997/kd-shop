package com.lvr.kdshop.business.service;

import com.lvr.kdshop.pojo.Goods;

import java.util.List;

public interface GoodsService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    Goods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Goods record);

    List<Goods> selectAllGoods();

    List<Goods> searchGoods(String name, String describle, Byte status);

    List<Goods> selectByCatelogAndStatus(Integer catelog_id, Byte status);

    List<Goods> selectByCatelogOrderByPolishDate(Integer catelogId, Integer limit);

    List<Goods> selectGoodsOrderByDate(Integer limit);

    List<Goods> selectGoodsByCatelogStatus(Integer catelogId);

    List<Goods> getGoodsByUserId(String user_id);

    List<Goods> selectPrimaryKey();

    int updateViewCountByPrimaryKey(Integer id, Integer viewCount);

    List<Goods> selectGoodsByStatusOrderByViewcountLimit(Byte status, Integer limit);;

    int updatePolishTimeByPrimaryKey(Integer gid, String polishTime);

    List<Goods> selectGoodsByStatusOrderByPolishTime(Byte status);

    int updateStatusByPrimaryKey(Integer gid, Byte status);

    int updateEndTimeByPrimaryKey(Integer gid, String endTime);

    int updateCommentNumByPrimaryKey(Integer gid, Integer commentNum);

    List<Goods> searchGoodsByKeyWord(String name, String describle);

    Goods searchGoodsByKeyWordAndPrimary(Integer id, String name, String describle);
}
