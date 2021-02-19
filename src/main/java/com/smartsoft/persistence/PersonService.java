package com.smartsoft.persistence;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {
@Autowired
private DaoRepository<Person,Long> repo;
private Logger logger;
@PostConstruct
private void init() {
	logger =Logger.getLogger("PersonService");
	logger.setLevel(Level.INFO);
	logger.info("personService is initializing");
}
@Transactional
public Person savePerson(Person person) {
	logger.info("person has been persisted successfully");
	return repo.save(person);
}
public Person findById(Long id) {
	return repo.findOne(id);
}
}
