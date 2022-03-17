package com.lvr.kdshop.business.service.impl;

import com.lvr.kdshop.business.mapper.WantedMapper;
import com.lvr.kdshop.business.service.WantedService;
import com.lvr.kdshop.pojo.Wanted;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("wantedService")
public class WantedServiceImpl implements WantedService {

    @Resource
    private WantedMapper wantedMapper;

    public int deleteByPrimaryKey(Integer id) {
        return wantedMapper.deleteByPrimaryKey(id);
    }

    public int insert(Wanted record) {
        return wantedMapper.insert(record);
    }

    public Wanted selectByPrimaryKey(Integer id) {
        return wantedMapper.selectByPrimaryKey(id);
    }

    public List<Wanted> selectAll() {
        return wantedMapper.selectAll();
    }

    public int updateByPrimaryKey(Wanted record) {
        return wantedMapper.updateByPrimaryKey(record);
    }

    public Wanted selectWant(String uid, Integer gid) {
        return wantedMapper.selectWant(uid,gid);
    }

    public List<Wanted> selectWantByUserId(String uid) {
        return wantedMapper.selectWantByUserId(uid);
    }

    public int deleteWantedByGoodsId(Integer gid) {
        return wantedMapper.deleteWantedByGoodsId(gid);
    }


}
