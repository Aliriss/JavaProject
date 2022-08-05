package com.example.people.aspect;

import com.example.people.annotion.RoutingWith;
import com.example.people.config.DynamicDataSourceContext;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 * @author all
 */
@Aspect
@Component
@Slf4j
public class DataSourceAspect {

    @Around("@annotation(routingWith)")
    public Object routingWithDataSource(ProceedingJoinPoint joinPoint, RoutingWith routingWith) throws Throwable {
        String key = routingWith.value();
        DynamicDataSourceContext.setDataSourceRoutingKey(key);
        return joinPoint.proceed();
    }


}

