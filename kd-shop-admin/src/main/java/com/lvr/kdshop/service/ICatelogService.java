package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Catelog;

/**
 * 闲置分类Service接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface ICatelogService 
{
    /**
     * 查询闲置分类
     * 
     * @param id 闲置分类ID
     * @return 闲置分类
     */
    public Catelog selectCatelogById(Long id);

    /**
     * 查询闲置分类列表
     * 
     * @param catelog 闲置分类
     * @return 闲置分类集合
     */
    public List<Catelog> selectCatelogList(Catelog catelog);

    /**
     * 新增闲置分类
     * 
     * @param catelog 闲置分类
     * @return 结果
     */
    public int insertCatelog(Catelog catelog);

    /**
     * 修改闲置分类
     * 
     * @param catelog 闲置分类
     * @return 结果
     */
    public int updateCatelog(Catelog catelog);

    /**
     * 批量删除闲置分类
     * 
     * @param ids 需要删除的闲置分类ID
     * @return 结果
     */
    public int deleteCatelogByIds(Long[] ids);

    /**
     * 删除闲置分类信息
     * 
     * @param id 闲置分类ID
     * @return 结果
     */
    public int deleteCatelogById(Long id);
}
