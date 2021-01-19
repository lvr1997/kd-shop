package com.lvr.kdshop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvr.kdshop.mapper.ReportMapper;
import com.lvr.kdshop.domain.Report;
import com.lvr.kdshop.service.IReportService;

/**
 * 闲置举报Service业务层处理
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@Service
public class ReportServiceImpl implements IReportService 
{
    @Autowired
    private ReportMapper reportMapper;

    /**
     * 查询闲置举报
     * 
     * @param id 闲置举报ID
     * @return 闲置举报
     */
    @Override
    public Report selectReportById(Long id)
    {
        return reportMapper.selectReportById(id);
    }

    /**
     * 查询闲置举报列表
     * 
     * @param report 闲置举报
     * @return 闲置举报
     */
    @Override
    public List<Report> selectReportList(Report report)
    {
        return reportMapper.selectReportList(report);
    }

    /**
     * 新增闲置举报
     * 
     * @param report 闲置举报
     * @return 结果
     */
    @Override
    public int insertReport(Report report)
    {
        return reportMapper.insertReport(report);
    }

    /**
     * 修改闲置举报
     * 
     * @param report 闲置举报
     * @return 结果
     */
    @Override
    public int updateReport(Report report)
    {
        return reportMapper.updateReport(report);
    }

    /**
     * 批量删除闲置举报
     * 
     * @param ids 需要删除的闲置举报ID
     * @return 结果
     */
    @Override
    public int deleteReportByIds(Long[] ids)
    {
        return reportMapper.deleteReportByIds(ids);
    }

    /**
     * 删除闲置举报信息
     * 
     * @param id 闲置举报ID
     * @return 结果
     */
    @Override
    public int deleteReportById(Long id)
    {
        return reportMapper.deleteReportById(id);
    }
}
