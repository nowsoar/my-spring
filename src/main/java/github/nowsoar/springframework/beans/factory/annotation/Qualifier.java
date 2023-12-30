package github.nowsoar.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/30
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";
}
