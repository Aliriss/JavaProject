package com.example.people.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @classDesc: 功能描述：data source configuration
 * @author: all
 * @date: 2022/8/3 16:04
 * @copyright: 北京众阳
 */
@Configuration
@Slf4j
public class DataSourceConf {
    /**
     * db1 datasource
     * master
     * @return
     */
    @Bean("db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    DataSource db1Datasource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * db2 datasource
     * slaver
     * @return
     */
    @Bean("db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    DataSource db2Datasource() {
        return DataSourceBuilder.create().build();
    }
    @Resource
    @Qualifier("db1")
    private DataSource dataSource1;
    @Resource
    @Qualifier("db2")
    private DataSource dataSource2;
    @Bean
    @Primary
    DataSource primaryDataSource() {
        Map<Object, Object> targetDataSource = new HashMap<>(16);
        // targetDataSource.put("db1", db1Datasource());
        // targetDataSource.put("db2", db2Datasource());
        targetDataSource.put("db1", dataSource1);
        targetDataSource.put("db2", dataSource2);
        log.info("Target Data Source: {}", targetDataSource);
        DynamicDataSource dds = new DynamicDataSource();
        dds.setTargetDataSources(targetDataSource);
        dds.setDefaultTargetDataSource(targetDataSource.get(DynamicDataSourceContext.defaultDataSource));
        log.info("default target data source: {}",dds.determineCurrentLookupKey());
        return dds;
    }


}
