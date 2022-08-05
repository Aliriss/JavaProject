package com.example.people.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author all
 */
@Configuration
@Slf4j
@PropertySource("classpath:application.yml")
public class DynamicDataSourceContext implements AutoCloseable {
    static final ThreadLocal<String> threadLocalDataSourceKey = new ThreadLocal<>();

    @Value("${spring.datasource.default-datasource}")
    static String defaultDataSource;

    public DynamicDataSourceContext(String key) {
        threadLocalDataSourceKey.set(key);
    }

    public DynamicDataSourceContext() {
    }

    public static String getDataSourceRoutingKey() {
        String key = threadLocalDataSourceKey.get();
        System.out.println("default data source: "+defaultDataSource);
        log.info("default data source: {}", defaultDataSource);
        return key == null ? defaultDataSource : key;
    }

    public static void setDataSourceRoutingKey(String key) {
        threadLocalDataSourceKey.set(key);
    }

    @Override
    public void close() throws Exception {
        threadLocalDataSourceKey.remove();
    }
}
