package com.lvr.kdshop.web.config;

import com.lvr.kdshop.web.config.locale.MyLocaleResolver;
import com.lvr.kdshop.web.interceptor.AdminInterceptor;
import com.lvr.kdshop.web.interceptor.AuthenticationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.apache.ibatis.session.SqlSessionFactory;
import javax.sql.DataSource;


@Configuration
public class KdShopWebConfig implements WebMvcConfigurer {

    /**图片地址*/
    @Value("${imagesPath}")
    private String mImagesPath;
    /**显示相对地址*/
    @Value("${fileUploadPathRelative}")
    private String fileRelativePath;

    @Value("${mybatis.config-location}")
    private String mybatisConfigLocation;

    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;

    @Autowired
    AuthenticationInterceptor authenticationInterceptor;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 配置路径映射（无逻辑跳转）
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("login");
      registry.addViewController("/login.html").setViewName("login");
      registry.addViewController("/main.html").setViewName("dashboard");
    }

    /**
     * 静态资源映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String os = System.getProperty("os.name");
        //如果是Windows系统
        if (os.toLowerCase().startsWith("win")) {
            //表示在磁盘mImagesPath目录下的所有资源会被解析为fileRelativePath的路径
            registry.addResourceHandler(fileRelativePath).addResourceLocations("file:"+mImagesPath);
            //和页面有关的静态目录都放在项目的static目录下
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
            logger.info("=========================Windows Picture Resource Mapping============================");
        }else {  //linux 和mac //媒体资源
            registry.addResourceHandler("/OTA/**")
                    .addResourceLocations("file:/www/wwwroot/www.bolglan.cn/dist/resource/OTA/");
        }
    }

    /**
     * 配置国际化地区解析器
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/index.html","/admin/login","/css/*","/img/*","/js/*");
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        Resource config = new PathMatchingResourcePatternResolver().getResource(mybatisConfigLocation);
        factoryBean.setConfigLocation(config);
        Resource[] mappers = new PathMatchingResourcePatternResolver().getResources(mapperLocations);
        factoryBean.setMapperLocations(mappers);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
