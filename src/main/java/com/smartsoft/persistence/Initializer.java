package com.smartsoft.persistence;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Singleton
@Startup
public class Initializer {
	private static Logger logger;
	private SpringBean springBean;
	private ApplicationContext context;
public Initializer() {
	logger =Logger.getLogger(this.getClass().getSimpleName());
	logger.setLevel(Level.INFO);
	logger.info("initialized");
}
@PostConstruct
public void init() {
	logger.info("init called");
	//context = new AnnotationConfigApplicationContext(Config.class);
	context = new ClassPathXmlApplicationContext("applicationContext.xml");
	springBean =(SpringBean)context.getBean("springBean");
	springBean.test();
}
}
