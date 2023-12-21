package github.nowsoar.springframework.beans.factory.config;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/21
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
