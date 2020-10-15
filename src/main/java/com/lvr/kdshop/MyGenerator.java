package com.lvr.kdshop;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * @author lvr
 * @version 1.0 2020/5/13
 */
public class MyGenerator {

    public static void main(String[] args) {
        //代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "E://Code/kd-shop";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("lvr");
        gc.setFileOverride(false);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/kd-shop?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC");
        // dsc.setSchemaName("public");

        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        //策略配置
//        StrategyConfig sc = new StrategyConfig();


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("kdshop");
        pc.setParent("com.lvr");
        mpg.setPackageInfo(pc);

        //执行生成
        mpg.execute();
    }

}
