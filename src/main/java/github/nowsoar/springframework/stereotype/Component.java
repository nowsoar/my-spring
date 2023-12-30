package github.nowsoar.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}
