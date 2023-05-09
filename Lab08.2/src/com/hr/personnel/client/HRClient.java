/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24)));
        dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2)));
        dept.addEmployee(new SalariedEmployee("Adrienne", LocalDate.of(2005,9,29), 2600.0));
        dept.addEmployee(new HourlyEmployee("Orion", LocalDate.of(2013,2,8), 10.0, 20.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its Employees
        System.out.println("\n Pay employees:");
        dept.payEmployees();

        // print personal greeting
        String greeting = "\n" +
                "(\\_/) \n" +
                "(O.O) \n" +
                "(m m)o \n";
        System.out.println(greeting);
    }
}