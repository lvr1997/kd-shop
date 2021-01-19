package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.WantedMapper;
import com.lvr.kdshop.domain.Wanted;
import com.lvr.kdshop.service.IWantedService;

/**
 * 闲置收藏Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class WantedServiceImpl implements IWantedService 
{
    @Autowired
    private WantedMapper wantedMapper;

    /**
     * 查询闲置收藏
     * 
     * @param id 闲置收藏ID
     * @return 闲置收藏
     */
    @Override
    public Wanted selectWantedById(Long id)
    {
        return wantedMapper.selectWantedById(id);
    }

    /**
     * 查询闲置收藏列表
     * 
     * @param wanted 闲置收藏
     * @return 闲置收藏
     */
    @Override
    public List<Wanted> selectWantedList(Wanted wanted)
    {
        return wantedMapper.selectWantedList(wanted);
    }

    /**
     * 新增闲置收藏
     * 
     * @param wanted 闲置收藏
     * @return 结果
     */
    @Override
    public int insertWanted(Wanted wanted)
    {
        return wantedMapper.insertWanted(wanted);
    }

    /**
     * 修改闲置收藏
     * 
     * @param wanted 闲置收藏
     * @return 结果
     */
    @Override
    public int updateWanted(Wanted wanted)
    {
        return wantedMapper.updateWanted(wanted);
    }

    /**
     * 批量删除闲置收藏
     * 
     * @param ids 需要删除的闲置收藏ID
     * @return 结果
     */
    @Override
    public int deleteWantedByIds(Long[] ids)
    {
        return wantedMapper.deleteWantedByIds(ids);
    }

    /**
     * 删除闲置收藏信息
     * 
     * @param id 闲置收藏ID
     * @return 结果
     */
    @Override
    public int deleteWantedById(Long id)
    {
        return wantedMapper.deleteWantedById(id);
    }
}
