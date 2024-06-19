/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.minipayrollgui;

/**
 *
 * @author user
 */

public abstract class Engineer extends Employee{

    protected double workingHours;
    protected Grade grade ;


    public Engineer() {
    }
    public Engineer (Grade grade,double workinghours){
        this.grade=grade;
        this.workingHours=workinghours;
    }

    public Engineer(int id, String name, int age, double workingHours, Grade grade) {
        super(id, name, age);
        this.workingHours = workingHours;
        this.grade = grade;


    }
    public Engineer(int id, String name, int age, double salary, double workingHours, Grade grade) {
        super(id, name, age, salary);
        this.workingHours = workingHours;
        this.grade = grade;


    }



    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }



    ;

    public abstract double calcSalary() throws NegativeSalary;


}
