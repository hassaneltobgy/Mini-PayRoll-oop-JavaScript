/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.minipayrollgui;

/**
 *
 * @author user
 */
public class Grade {
    protected String position;
    protected double taxRate;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    protected double payRate;

    public Grade() {
    }
    public Grade( double taxRate, double payRate) {

        this.taxRate = taxRate;
        this.payRate = payRate;
    }

    public Grade(String position, double taxRate, double payRate) {
        this.position = position;
        this.taxRate = taxRate;
        this.payRate = payRate;
    }

    public String getPosition() {
        return position;
    }



    public double getTaxRate() {
        return taxRate;
    }


    public double getPayRate() {
        return payRate;
    }


}
