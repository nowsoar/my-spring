package github.nowsoar.springframework.aop;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/25
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
