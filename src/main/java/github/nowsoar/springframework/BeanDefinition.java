package github.nowsoar.springframework;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
