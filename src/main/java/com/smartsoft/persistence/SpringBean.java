package com.smartsoft.persistence;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SpringBean {
	private static Logger logger;
	@Autowired
	private PersonService service;
	@PostConstruct
	public void init() {
		logger =Logger.getLogger("springBean");
		logger.setLevel(Level.INFO);
		logger.info("spring bean initialized");
	}
	public void test() {
		Person p1 = new Person();
		p1.setAge(22);
		p1.setFirstName("hamidreza");
		p1.setLastName("abroshan");
		p1 =service.savePerson(p1);
		Person p2 =service.findById(p1.getId());
		logger.info("person id is:"+p2.getId());
		logger.info("testing");
	}
}
