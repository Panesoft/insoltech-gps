package com.hcsinergia.delver.web.rest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext appContext;

	private SpringApplicationContext() {
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		appContext = applicationContext;
	}

	public static Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}
}
