package com.lvr.kdshop.business.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvr.kdshop.business.mapper.CategoryMapper;
import com.lvr.kdshop.business.service.CategoryService;
import com.lvr.kdshop.business.utils.PageRequest;
import com.lvr.kdshop.business.utils.PageResult;
import com.lvr.kdshop.business.utils.PageUtils;
import com.lvr.kdshop.pojo.Catelog;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper catelogMapper;

    public int deleteByPrimaryKey(Integer id) {
        return catelogMapper.deleteByPrimaryKey(id);
    }

    public int insert(Catelog record) {
        return catelogMapper.insert(record);
    }

    public Catelog selectByPrimaryKey(Integer id) {
        return catelogMapper.selectByPrimaryKey(id);
    }

    public List<Catelog> selectAll() {
        return catelogMapper.selectAll();
    }

    @Override
    public PageResult findPage(String keyword, PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(keyword, pageRequest));
    }

    private PageInfo<Catelog> getPageInfo(String keyword, PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Catelog> categoryList = catelogMapper.searchCatelogByName(keyword);
        return new PageInfo<Catelog>(categoryList);
    }

    public int updateByPrimaryKey(Catelog record) {
        return catelogMapper.updateByPrimaryKey(record);
    }

    public List<Catelog> getAllCatelogByStatus(Byte status) {
        return catelogMapper.getAllCatelogByStatus(status);
    }

    @Override
    public HashMap<Integer, String> getAllCatelogWithOptions() {
        List<Catelog> catelogs = catelogMapper.getAllCatelogByStatus((byte)1);
        HashMap<Integer,String> categoryOptions = new HashMap<>();
        for (int i=0;i<catelogs.size();i++) {
            categoryOptions.put(catelogs.get(i).getId(),catelogs.get(i).getName());
        }
        return categoryOptions;
    }

    //    public int getCount(Catelog catelog) {
//        return catelogMapper.getCount(catelog);
//    }

//    public int updateCatelogNum(Integer id, Integer number) {
//        return catelogMapper.updateCatelogNum(id,number);
//    }

    @Override
    public List<Catelog> searchCatelogByName(String name) {
        return catelogMapper.searchCatelogByName(name);
    }
}
