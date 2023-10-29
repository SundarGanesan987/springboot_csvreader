package com.javatpoint.controller;

//EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL
public class employee_map {
    public String EMPLOYEE_ID;
    public String FIRST_NAME;
    public String LAST_NAME;
    public String EMAIL;


    //getters and setters

    @Override
    public String toString() {
        return "Employee{" +
                "EMPLOYEE_ID='" + EMPLOYEE_ID + '\'' +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                '}';
    }
}
