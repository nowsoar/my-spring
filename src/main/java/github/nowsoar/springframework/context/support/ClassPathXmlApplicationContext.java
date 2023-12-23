package github.nowsoar.springframework.context.support;

import github.nowsoar.springframework.beans.BeansException;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    public ClassPathXmlApplicationContext(){}

    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    public String[] getConfigLocations() {
        return configLocations;
    }
}
