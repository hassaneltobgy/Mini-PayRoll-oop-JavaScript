package com.example.minipayrollgui;

public class TeamLeader extends Engineer{


    public TeamLeader() {
    }
    public TeamLeader (Grade grade,double workinghours){
        this.grade=grade;
        this.workingHours=workinghours;
    }
    public TeamLeader(int id, String name, int age, double workingHours, Grade grade) {
        super(id, name, age, workingHours, grade);
    }
    public TeamLeader(int id, String name, int age, double salary, double workingHours, Grade grade) {
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
