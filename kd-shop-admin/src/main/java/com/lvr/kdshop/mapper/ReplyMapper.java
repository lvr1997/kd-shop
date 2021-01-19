package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Reply;

/**
 * 评论回复Mapper接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface ReplyMapper 
{
    /**
     * 查询评论回复
     * 
     * @param id 评论回复ID
     * @return 评论回复
     */
    public Reply selectReplyById(Long id);

    /**
     * 查询评论回复列表
     * 
     * @param reply 评论回复
     * @return 评论回复集合
     */
    public List<Reply> selectReplyList(Reply reply);

    /**
     * 新增评论回复
     * 
     * @param reply 评论回复
     * @return 结果
     */
    public int insertReply(Reply reply);

    /**
     * 修改评论回复
     * 
     * @param reply 评论回复
     * @return 结果
     */
    public int updateReply(Reply reply);

    /**
     * 删除评论回复
     * 
     * @param id 评论回复ID
     * @return 结果
     */
    public int deleteReplyById(Long id);

    /**
     * 批量删除评论回复
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteReplyByIds(Long[] ids);
}
