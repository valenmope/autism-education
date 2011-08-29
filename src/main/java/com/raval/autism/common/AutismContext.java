package com.raval.autism.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutismContext {

    private static Map<String, ClassPathXmlApplicationContext> factories = new HashMap<String, ClassPathXmlApplicationContext>();

    public static Object getBean(String beanName, String contextName) {
	ClassPathXmlApplicationContext context = getContext(contextName);
	return context.getBean(beanName);
    }

    @SuppressWarnings("unchecked")
    public static <O> O getBean(final String beanName, final Class<O> clazz,
	    String contextName) {
	ClassPathXmlApplicationContext context = getContext(contextName);
	final O o = (O) context.getBean(beanName);
	return o;
    }

    public static <O> Map<String, O> getBeansOfType(final Class<O> clazz,
	    String contextName) {
	ClassPathXmlApplicationContext context = getContext(contextName);
	Map<String, O> beansOfType = context.getBeansOfType(clazz);
	return beansOfType;
    }

    private static synchronized ClassPathXmlApplicationContext getContext(
	    String contextName) {
	ClassPathXmlApplicationContext factory = factories.get(contextName);
	if (factory == null) {
	    try {
		factory = new ClassPathXmlApplicationContext(contextName);
		factories.put(contextName, factory);
	    } catch (Exception e) {
		throw new RuntimeException(e);
	    }
	}
	return factory;
    }
}