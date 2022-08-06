package com.course.patterns.structuralpatterns.bridge.employees;

public abstract class Employee {
    protected String name;
    protected Integer age;
    protected Double salary;

    public Employee(String name, Integer age, Double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

}
