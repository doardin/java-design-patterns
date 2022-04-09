package com.course.patterns.creationalpatterns.prototype.deepshallow.model;

public class User implements Cloneable {

    public String name;
    public Integer age;
    public Address address;

    public User(String name, Integer age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public User clone() throws CloneNotSupportedException {
		//  (Shallow copy) Use's same objects instance of source
        //	return (User) super.clone();

		//  (Deep copy) Create objects instance for each property
		User cloneUser = (User) super.clone();
		cloneUser.address = (Address) address.clone();
		return cloneUser;
	}

}
