package com.lvr.kdshop.business.service;

import com.github.pagehelper.PageInfo;
import com.lvr.kdshop.business.utils.PageRequest;
import com.lvr.kdshop.business.utils.PageResult;
import com.lvr.kdshop.pojo.Catelog;

import java.util.HashMap;
import java.util.List;

public interface CatelogService {

    int deleteByPrimaryKey(Integer id);

    int insert(Catelog record);

    Catelog selectByPrimaryKey(Integer id);

    List<Catelog> selectAll();

    public PageResult findPage(String keyword, PageRequest pageRequest);

    int updateByPrimaryKey(Catelog record);

    List<Catelog> getAllCatelogByStatus(Byte status);

    HashMap<Integer,String> getAllCatelogWithOptions();

//    int getCount(Catelog catelog);

//    int updateCatelogNum(Integer id, Integer number);

    List<Catelog> searchCatelogByName(String name);
}
