package com.example.people.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @classDesc: 功能描述：routing data source
 * @author: all
 * @date: 2022/8/3 16:07
 * @copyright: 北京众阳
 */
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        log.info("currentLookupKey getDS = {}", DynamicDataSourceContext.getDataSourceRoutingKey());
        return DynamicDataSourceContext.getDataSourceRoutingKey();
    }

}
