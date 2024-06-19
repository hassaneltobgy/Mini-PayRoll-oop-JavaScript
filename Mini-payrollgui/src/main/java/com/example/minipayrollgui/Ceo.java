/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.minipayrollgui;

/**
 *
 * @author user
 */
public class Ceo extends Engineer{

    public Ceo() {
    }

    public Ceo (Grade grade,double workinghours){
        this.grade=grade;
        this.workingHours=workinghours;
    }
    public Ceo(int id, String name, int age, double workingHours, Grade grade) {
        super(id, name, age, workingHours, grade);
    }
    public Ceo(int id, String name, int age, double salary, double workingHours, Grade grade) {
        super(id, name, age, salary, workingHours, grade);
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
