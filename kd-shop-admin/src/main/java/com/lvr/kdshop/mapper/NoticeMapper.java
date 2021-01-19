package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Notice;

/**
 * 系统公告Mapper接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface NoticeMapper 
{
    /**
     * 查询系统公告
     * 
     * @param id 系统公告ID
     * @return 系统公告
     */
    public Notice selectNoticeById(Long id);

    /**
     * 查询系统公告列表
     * 
     * @param notice 系统公告
     * @return 系统公告集合
     */
    public List<Notice> selectNoticeList(Notice notice);

    /**
     * 新增系统公告
     * 
     * @param notice 系统公告
     * @return 结果
     */
    public int insertNotice(Notice notice);

    /**
     * 修改系统公告
     * 
     * @param notice 系统公告
     * @return 结果
     */
    public int updateNotice(Notice notice);

    /**
     * 删除系统公告
     * 
     * @param id 系统公告ID
     * @return 结果
     */
    public int deleteNoticeById(Long id);

    /**
     * 批量删除系统公告
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNoticeByIds(Long[] ids);
}
