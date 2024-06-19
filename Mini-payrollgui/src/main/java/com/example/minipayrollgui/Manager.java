/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.minipayrollgui;

/**
 *
 * @author user
 */
public class Manager extends Engineer {

    public Manager() {

    }


    public Manager(int id, String name, int age, double workingHours, Grade grade) {
        super(id, name, age, workingHours, grade);
    }
    public Manager(int id, String name, int age, double salary, double workingHours, Grade grade) {
        super(id, name, age, salary, workingHours, grade);
    }

    public Manager (Grade grade,double workinghours){
        this.grade=grade;
        this.workingHours=workinghours;
    }

    public double calcSalary() throws NegativeSalary {

        try {
            if (this.workingHours > 0 && this.getGrade().getPayRate() > 0 && this.getGrade().getTaxRate() > 0) {
                 return ((super.workingHours) * (super.getGrade().getPayRate()) - (super.getGrade().getTaxRate()));

            }
    else throw new NegativeSalary("invalid numbers");
    }
    catch(NegativeSalary s){
        System.out.println(s.getMessage());
        return -1;
    }
    }




}
