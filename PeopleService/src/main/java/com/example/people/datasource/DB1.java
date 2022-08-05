// package com.example.people.datasource;
//
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.mybatis.spring.SqlSessionFactoryBean;
// import org.mybatis.spring.SqlSessionTemplate;
// import org.mybatis.spring.annotation.MapperScan;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
// import javax.sql.DataSource;
//
// /**
//  * @classDesc: 功能描述：order datasource defination
//  * @author: all
//  * @date: 2022/8/1 9:41
//  * @copyright: 北京众阳
//  */
// @Configuration
// @MapperScan(value = "com.example.people.mapper.OrderMapper", sqlSessionFactoryRef="db1SqlSessionFactory")
// public class DB1 {
//     @Primary
//     @Bean(name = "db1DataSource")
//     @ConfigurationProperties(prefix = "spring.datasource.db1")
//     public DataSource getDateSource1() {
//         return DataSourceBuilder.create().build();
//     }
//
//     @Primary
//     @Bean(name = "db1SqlSessionFactory")
//     public SqlSessionFactory test1SqlSessionFactory(@Qualifier("db1DataSource") DataSource datasource)
//             throws Exception {
//         SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//         bean.setDataSource(datasource);
//         bean.setMapperLocations(
//                 new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
//         return bean.getObject();
//     }
//
//     @Primary
//     @Bean("db1SqlSessionTemplate")
//     public SqlSessionTemplate test1SqlSessionTemplate(
//             @Qualifier("db1SqlSessionFactory") SqlSessionFactory sessionFactory) {
//         return new SqlSessionTemplate(sessionFactory);
//     }
// }
