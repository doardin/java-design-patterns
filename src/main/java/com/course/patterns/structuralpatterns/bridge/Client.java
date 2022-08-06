package com.course.patterns.structuralpatterns.bridge;

import com.course.patterns.structuralpatterns.bridge.converters.CSVConverter;
import com.course.patterns.structuralpatterns.bridge.converters.IConverter;
import com.course.patterns.structuralpatterns.bridge.converters.JsonConverter;
import com.course.patterns.structuralpatterns.bridge.employees.ITGuy;
import com.course.patterns.structuralpatterns.bridge.employees.ProjectManager;

public class Client {
    
    public static void main(String[] args) {
        IConverter csvConverter = new CSVConverter();
        IConverter jsonConverter = new JsonConverter();

        ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
        ProjectManager pm = new ProjectManager("Jean Barber", 40, 6000d);

        System.out.println(csvConverter.getEmployeeFormated(it));
        System.out.println(jsonConverter.getEmployeeFormated(it));
        System.out.println(csvConverter.getEmployeeFormated(pm));
        System.out.println(jsonConverter.getEmployeeFormated(pm));

    }

}
