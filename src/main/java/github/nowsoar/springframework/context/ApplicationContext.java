package github.nowsoar.springframework.context;

import github.nowsoar.springframework.beans.factory.HierarchicalBeanFactory;
import github.nowsoar.springframework.beans.factory.ListableBeanFactory;
import github.nowsoar.springframework.core.io.ResourceLoader;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
