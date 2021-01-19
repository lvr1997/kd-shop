package com.lvr.kdshop.service;

import java.util.List;
import com.lvr.kdshop.domain.Report;

/**
 * 闲置举报Service接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface IReportService 
{
    /**
     * 查询闲置举报
     * 
     * @param id 闲置举报ID
     * @return 闲置举报
     */
    public Report selectReportById(Long id);

    /**
     * 查询闲置举报列表
     * 
     * @param report 闲置举报
     * @return 闲置举报集合
     */
    public List<Report> selectReportList(Report report);

    /**
     * 新增闲置举报
     * 
     * @param report 闲置举报
     * @return 结果
     */
    public int insertReport(Report report);

    /**
     * 修改闲置举报
     * 
     * @param report 闲置举报
     * @return 结果
     */
    public int updateReport(Report report);

    /**
     * 批量删除闲置举报
     * 
     * @param ids 需要删除的闲置举报ID
     * @return 结果
     */
    public int deleteReportByIds(Long[] ids);

    /**
     * 删除闲置举报信息
     * 
     * @param id 闲置举报ID
     * @return 结果
     */
    public int deleteReportById(Long id);
}
