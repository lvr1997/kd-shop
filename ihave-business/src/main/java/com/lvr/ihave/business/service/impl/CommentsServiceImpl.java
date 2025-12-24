package com.lvr.ihave.business.service.impl;

import com.lvr.ihave.business.mapper.CommentsMapper;
import com.lvr.ihave.business.service.CommentsService;
import com.lvr.ihave.pojo.Comments;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.List;

@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {

    @Resource
    private CommentsMapper commentsMapper;

    public int deleteByPrimaryKey(Integer id) {
        return commentsMapper.deleteByPrimaryKey(id);
    }

    public int insert(Comments record) {
        return commentsMapper.insert(record);
    }

    public Comments selectByPrimaryKey(Integer id) {
        return commentsMapper.selectByPrimaryKey(id);
    }

    public List<Comments> selectAll() {
        return commentsMapper.selectAll();
    }

    public int updateByPrimaryKey(Comments record) {
        return commentsMapper.updateByPrimaryKey(record);
    }

    public List<Comments> selectByUserKeyWithContent(String uid) {
        return commentsMapper.selectByUserKeyWithContent(uid);
    }

    public List<Comments> selectByGoodsId(Integer goodsId) {
        return commentsMapper.selectByGoodsId(goodsId);
    }

    @Override
    public List<Comments> searchCommentsByContent(String content) {
        return commentsMapper.searchCommentsByContent(content);
    }
}
