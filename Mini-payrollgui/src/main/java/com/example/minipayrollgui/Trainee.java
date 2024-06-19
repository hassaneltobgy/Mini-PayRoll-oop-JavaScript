/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.minipayrollgui;

/**
 *
 * @author user
 */
public class Trainee extends Employee {

    protected String uniName;
    protected int academicYear;
    protected float gpa;


    public Trainee() {

    }





    public Trainee(int id, String name, int age, double salary, String uniName, int academicYear, float gpa) {
        super(id, name, age, salary);
        this.uniName = uniName;
        this.academicYear = academicYear;
        this.gpa = gpa;

    }


    public String getUniName() {
        return uniName;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public float getGpa() {
        return gpa;
    }


    public double calcSalary()
    {
        return 250;
    }

}
