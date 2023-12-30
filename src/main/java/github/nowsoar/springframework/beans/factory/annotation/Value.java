package github.nowsoar.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/30
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    String value();
}
