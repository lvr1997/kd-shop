package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.CatelogMapper;
import com.lvr.kdshop.domain.Catelog;
import com.lvr.kdshop.service.ICatelogService;

/**
 * 闲置分类Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class CatelogServiceImpl implements ICatelogService 
{
    @Autowired
    private CatelogMapper catelogMapper;

    /**
     * 查询闲置分类
     * 
     * @param id 闲置分类ID
     * @return 闲置分类
     */
    @Override
    public Catelog selectCatelogById(Long id)
    {
        return catelogMapper.selectCatelogById(id);
    }

    /**
     * 查询闲置分类列表
     * 
     * @param catelog 闲置分类
     * @return 闲置分类
     */
    @Override
    public List<Catelog> selectCatelogList(Catelog catelog)
    {
        return catelogMapper.selectCatelogList(catelog);
    }

    /**
     * 新增闲置分类
     * 
     * @param catelog 闲置分类
     * @return 结果
     */
    @Override
    public int insertCatelog(Catelog catelog)
    {
        return catelogMapper.insertCatelog(catelog);
    }

    /**
     * 修改闲置分类
     * 
     * @param catelog 闲置分类
     * @return 结果
     */
    @Override
    public int updateCatelog(Catelog catelog)
    {
        return catelogMapper.updateCatelog(catelog);
    }

    /**
     * 批量删除闲置分类
     * 
     * @param ids 需要删除的闲置分类ID
     * @return 结果
     */
    @Override
    public int deleteCatelogByIds(Long[] ids)
    {
        return catelogMapper.deleteCatelogByIds(ids);
    }

    /**
     * 删除闲置分类信息
     * 
     * @param id 闲置分类ID
     * @return 结果
     */
    @Override
    public int deleteCatelogById(Long id)
    {
        return catelogMapper.deleteCatelogById(id);
    }
}
