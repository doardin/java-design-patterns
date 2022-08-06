package com.course.patterns.structuralpatterns.bridge.converters;

import java.util.Locale;

import com.course.patterns.structuralpatterns.bridge.employees.Employee;

public class CSVConverter implements IConverter {

    @Override
    public String getEmployeeFormated(Employee emp) {
        return String.format(Locale.US, "%s,%d,%.2f", emp.getName(), emp.getAge(), emp.getSalary());
    }

    
}
