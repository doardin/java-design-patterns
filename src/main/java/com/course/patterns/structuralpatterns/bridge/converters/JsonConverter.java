package com.course.patterns.structuralpatterns.bridge.converters;

import com.course.patterns.structuralpatterns.bridge.employees.Employee;

public class JsonConverter implements IConverter {

    @Override
    public String getEmployeeFormated(Employee emp) {
        StringBuilder builder = new StringBuilder()
            .append("{\n")
                .append("\t\"name\": \"").append(emp.getName()).append("\"\n")
                .append("\t\"age\": \"").append(emp.getAge()).append("\"\n")
                .append("\t\"salary\": \"").append(emp.getSalary()).append("\"\n")
            .append("}");
        return builder.toString();
    }
    
}
