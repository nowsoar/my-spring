package github.nowsoar.springframework.aop;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/25
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public Class<?>[] getTargetClass() {
        return target.getClass().getInterfaces();
    }
}
