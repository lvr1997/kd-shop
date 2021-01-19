package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.ReplyMapper;
import com.lvr.kdshop.domain.Reply;
import com.lvr.kdshop.service.IReplyService;

/**
 * 评论回复Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class ReplyServiceImpl implements IReplyService 
{
    @Autowired
    private ReplyMapper replyMapper;

    /**
     * 查询评论回复
     * 
     * @param id 评论回复ID
     * @return 评论回复
     */
    @Override
    public Reply selectReplyById(Long id)
    {
        return replyMapper.selectReplyById(id);
    }

    /**
     * 查询评论回复列表
     * 
     * @param reply 评论回复
     * @return 评论回复
     */
    @Override
    public List<Reply> selectReplyList(Reply reply)
    {
        return replyMapper.selectReplyList(reply);
    }

    /**
     * 新增评论回复
     * 
     * @param reply 评论回复
     * @return 结果
     */
    @Override
    public int insertReply(Reply reply)
    {
        return replyMapper.insertReply(reply);
    }

    /**
     * 修改评论回复
     * 
     * @param reply 评论回复
     * @return 结果
     */
    @Override
    public int updateReply(Reply reply)
    {
        return replyMapper.updateReply(reply);
    }

    /**
     * 批量删除评论回复
     * 
     * @param ids 需要删除的评论回复ID
     * @return 结果
     */
    @Override
    public int deleteReplyByIds(Long[] ids)
    {
        return replyMapper.deleteReplyByIds(ids);
    }

    /**
     * 删除评论回复信息
     * 
     * @param id 评论回复ID
     * @return 结果
     */
    @Override
    public int deleteReplyById(Long id)
    {
        return replyMapper.deleteReplyById(id);
    }
}
