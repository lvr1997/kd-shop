package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Wanted;

/**
 * 闲置收藏Mapper接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface WantedMapper 
{
    /**
     * 查询闲置收藏
     * 
     * @param id 闲置收藏ID
     * @return 闲置收藏
     */
    public Wanted selectWantedById(Long id);

    /**
     * 查询闲置收藏列表
     * 
     * @param wanted 闲置收藏
     * @return 闲置收藏集合
     */
    public List<Wanted> selectWantedList(Wanted wanted);

    /**
     * 新增闲置收藏
     * 
     * @param wanted 闲置收藏
     * @return 结果
     */
    public int insertWanted(Wanted wanted);

    /**
     * 修改闲置收藏
     * 
     * @param wanted 闲置收藏
     * @return 结果
     */
    public int updateWanted(Wanted wanted);

    /**
     * 删除闲置收藏
     * 
     * @param id 闲置收藏ID
     * @return 结果
     */
    public int deleteWantedById(Long id);

    /**
     * 批量删除闲置收藏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWantedByIds(Long[] ids);
}
