package github.nowsoar.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/30
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
