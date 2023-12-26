package github.nowsoar.springframework.aop;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/25
 */
public interface PointCut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
