package github.nowsoar.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;
import github.nowsoar.springframework.stereotype.Component;
import github.nowsoar.springframework.utils.ClassUtils;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/30
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        LinkedHashSet<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
