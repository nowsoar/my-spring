package github.nowsoar.springframework.aop;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public interface PointcutAdvisor extends Advisor{

    PointCut getPointcut();
}
