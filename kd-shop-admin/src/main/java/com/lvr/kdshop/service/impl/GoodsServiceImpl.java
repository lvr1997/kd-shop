package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.GoodsMapper;
import com.lvr.kdshop.domain.Goods;
import com.lvr.kdshop.service.IGoodsService;

/**
 * 闲置物品Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class GoodsServiceImpl implements IGoodsService 
{
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 查询闲置物品
     * 
     * @param id 闲置物品ID
     * @return 闲置物品
     */
    @Override
    public Goods selectGoodsById(Long id)
    {
        return goodsMapper.selectGoodsById(id);
    }

    /**
     * 查询闲置物品列表
     * 
     * @param goods 闲置物品
     * @return 闲置物品
     */
    @Override
    public List<Goods> selectGoodsList(Goods goods)
    {
        return goodsMapper.selectGoodsList(goods);
    }

    /**
     * 新增闲置物品
     * 
     * @param goods 闲置物品
     * @return 结果
     */
    @Override
    public int insertGoods(Goods goods)
    {
        return goodsMapper.insertGoods(goods);
    }

    /**
     * 修改闲置物品
     * 
     * @param goods 闲置物品
     * @return 结果
     */
    @Override
    public int updateGoods(Goods goods)
    {
        return goodsMapper.updateGoods(goods);
    }

    /**
     * 批量删除闲置物品
     * 
     * @param ids 需要删除的闲置物品ID
     * @return 结果
     */
    @Override
    public int deleteGoodsByIds(Long[] ids)
    {
        return goodsMapper.deleteGoodsByIds(ids);
    }

    /**
     * 删除闲置物品信息
     * 
     * @param id 闲置物品ID
     * @return 结果
     */
    @Override
    public int deleteGoodsById(Long id)
    {
        return goodsMapper.deleteGoodsById(id);
    }
}
