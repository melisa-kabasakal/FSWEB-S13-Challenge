package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        totalProject();
    }
    public static void totalProject(){
        Healthplan healthplan = new Healthplan(1, "Melisa's Plan", Plan.BASIC);
        String[] healthplans = {"Melisa's Plan"};
        Employee employee = new Employee(1, "Melisa Kabasakal", "melis@example.com", "pass123", healthplans);

        String [] developers = new String[2];
        Company company = new Company(1, "Melis", 1000000, developers);

        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(company);
        company.addEmployee(0, "Zeynep");
        company.addEmployee(1, "Pelin");
        company.addEmployee(1, "Cevher");
        company.addEmployee(5, "Merve");

    }
}