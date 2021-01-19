package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Goods;

/**
 * 闲置物品Mapper接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface GoodsMapper 
{
    /**
     * 查询闲置物品
     * 
     * @param id 闲置物品ID
     * @return 闲置物品
     */
    public Goods selectGoodsById(Long id);

    /**
     * 查询闲置物品列表
     * 
     * @param goods 闲置物品
     * @return 闲置物品集合
     */
    public List<Goods> selectGoodsList(Goods goods);

    /**
     * 新增闲置物品
     * 
     * @param goods 闲置物品
     * @return 结果
     */
    public int insertGoods(Goods goods);

    /**
     * 修改闲置物品
     * 
     * @param goods 闲置物品
     * @return 结果
     */
    public int updateGoods(Goods goods);

    /**
     * 删除闲置物品
     * 
     * @param id 闲置物品ID
     * @return 结果
     */
    public int deleteGoodsById(Long id);

    /**
     * 批量删除闲置物品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGoodsByIds(Long[] ids);
}
