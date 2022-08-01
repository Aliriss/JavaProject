package com.example.peopleservice.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @classDesc: 功能描述：order datasource defination
 * @author: all
 * @date: 2022/8/1 9:41
 * @copyright: 北京众阳
 */
@Configuration
@MapperScan(value = "com.example.peopleservice.mapper.OrderMapper", sqlSessionFactoryRef="db2SqlSessionFactory")
public class DB1 {
    // 表示这个数据源是默认数据源
    @Primary
    @Bean(name = "db1DataSource")
    // 读取application.properties中的配置参数映射成为一个对象
    // prefix表示yml配置文件中参数的前缀
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource getDateSource1() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "db1SqlSessionFactory")
    // @Qualifier表示查找Spring容器中名字为test1DataSource的对象
    public SqlSessionFactory test1SqlSessionFactory(@Qualifier("db1DataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                // 设置mybatis的.xml所在位置
                new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
        return bean.getObject();
    }

    @Primary
    @Bean("db1SqlSessionTemplate")
    public SqlSessionTemplate test1SqlSessionTemplate(
            @Qualifier("db1SqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }
}
