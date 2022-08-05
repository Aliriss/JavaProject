package com.example.people.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author all
 */
@Retention(RetentionPolicy.RUNTIME)
// @Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD,ElementType.TYPE})
// @Target(ElementType.TYPE)
public @interface RoutingWith {
    String value() default "db1";
}
