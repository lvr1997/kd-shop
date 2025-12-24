package com.lvr.ihave.pojo;

import java.util.List;

public class ReportExtend {
    private Report report;
    private Goods goods;
    private List<Image> images;
    private SysUser user;

    public ReportExtend() {
    }

    public ReportExtend(Report report, Goods goods, List<Image> images, SysUser user) {
        this.report = report;
        this.goods = goods;
        this.images = images;
        this.user = user;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }
}
