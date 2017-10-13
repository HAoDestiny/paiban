package com.paiban.annotations;

import java.lang.annotation.*;

/**
 * Created by Destiny_hao on 2017/10/13.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authority {

    String[] value() default {};

    String[] authorities() default {};

    String[] roles() default {};
}
