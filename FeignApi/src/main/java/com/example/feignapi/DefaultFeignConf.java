package com.example.feignapi;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @classDesc: 功能描述：
 * @author: all
 * @date: 2022/8/5 15:06
 * @copyright: 北京众阳
 */

public class DefaultFeignConf {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
