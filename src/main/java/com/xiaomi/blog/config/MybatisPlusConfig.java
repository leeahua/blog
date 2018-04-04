package com.xiaomi.blog.config;

 /* *   @Description : MybatisPlus配置
        * ---------------------------------
        * @Author : Liang.Guangqing
        * @Date : Create in 2017/9/19 13:54
        */

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
  *  MybatisPlus配置
  *
  *  @author  liyaohua
  *
  *  create on  2018-04-04 03:46
  *
  * */
 @Configuration
public class MybatisPlusConfig {

     /***
      * plus 的性能优化
      * @return
      */
     @Bean
     public PerformanceInterceptor performanceInterceptor() {
         PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
         /*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
         performanceInterceptor.setMaxTime(1000);
         /*<!--SQL是否格式化 默认false-->*/
         performanceInterceptor.setFormat(true);
         return performanceInterceptor;
     }

    /**
     * mybatis-plus分页插件
     *
     * @author : lyh
     * create on 2018-04-04 03：58
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


    /**
     * @Description : druid注入
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2018/1/3 17:38
     */
    /*@Bean
    @ConfigurationProperties("spring.datasource.druid." )
    public DataSource dataSource() {
        return DruidDataSourceBuilder
                .create()
                .build();
    }*/
}
