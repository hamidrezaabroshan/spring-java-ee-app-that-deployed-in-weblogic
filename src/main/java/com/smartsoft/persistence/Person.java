package com.smartsoft.persistence;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person {
	@SequenceGenerator(name="sec1", sequenceName="mysequence" )
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec1")
	private long id;
	private String firstName;
	private String lastName;
private int age;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}


}
