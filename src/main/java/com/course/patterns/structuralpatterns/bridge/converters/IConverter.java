package com.course.patterns.structuralpatterns.bridge.converters;

import com.course.patterns.structuralpatterns.bridge.employees.Employee;

public interface IConverter {
    String getEmployeeFormated(Employee emp);
}
