package com.pieshop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBFPP implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        
        System.out.println("CustomBFPP running: modifying bean definitions...");

        if (beanFactory.containsBeanDefinition("myPie")) {
            BeanDefinition bd = beanFactory.getBeanDefinition("myPie");
            bd.getPropertyValues().add("name", "Modified by BFPP 🍰");
        }

    }
    
}
