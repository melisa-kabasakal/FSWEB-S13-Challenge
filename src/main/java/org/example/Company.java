package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames ){
        this.developerNames = developerNames;
        setGiro(giro);
        this.id = id;
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        if(giro >= 0) {
            this.giro = giro;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index is out of bounds.");

        } else if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Index is already occupied.");
        }
    }
}
