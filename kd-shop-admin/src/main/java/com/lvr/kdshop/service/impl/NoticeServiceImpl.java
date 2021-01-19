package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.NoticeMapper;
import com.lvr.kdshop.domain.Notice;
import com.lvr.kdshop.service.INoticeService;

/**
 * 系统公告Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class NoticeServiceImpl implements INoticeService 
{
    @Autowired
    private NoticeMapper noticeMapper;

    /**
     * 查询系统公告
     * 
     * @param id 系统公告ID
     * @return 系统公告
     */
    @Override
    public Notice selectNoticeById(Long id)
    {
        return noticeMapper.selectNoticeById(id);
    }

    /**
     * 查询系统公告列表
     * 
     * @param notice 系统公告
     * @return 系统公告
     */
    @Override
    public List<Notice> selectNoticeList(Notice notice)
    {
        return noticeMapper.selectNoticeList(notice);
    }

    /**
     * 新增系统公告
     * 
     * @param notice 系统公告
     * @return 结果
     */
    @Override
    public int insertNotice(Notice notice)
    {
        return noticeMapper.insertNotice(notice);
    }

    /**
     * 修改系统公告
     * 
     * @param notice 系统公告
     * @return 结果
     */
    @Override
    public int updateNotice(Notice notice)
    {
        return noticeMapper.updateNotice(notice);
    }

    /**
     * 批量删除系统公告
     * 
     * @param ids 需要删除的系统公告ID
     * @return 结果
     */
    @Override
    public int deleteNoticeByIds(Long[] ids)
    {
        return noticeMapper.deleteNoticeByIds(ids);
    }

    /**
     * 删除系统公告信息
     * 
     * @param id 系统公告ID
     * @return 结果
     */
    @Override
    public int deleteNoticeById(Long id)
    {
        return noticeMapper.deleteNoticeById(id);
    }
}
