/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.minipayrollgui;
import java.util.ArrayList;


/**
 *
 * @author user
 */
public class Company {

    public static ArrayList<Employee> eng = new ArrayList<Employee>();


    public Company() {
    }


    public void add(Employee e) {
//        boolean exists = eng.contains(e);
//        if (exists == true) {
//            System.out.println(" item already exists");
//        } else {
            eng.add(e);


    }



    public String printTrainee(int i) throws NoItemsException {



           // for (int i = 0; i < eng.size(); i++) {

                    if (Search((eng.get(i)).getId()) == 1) {

                        return ("Id:" + eng.get(i).getId() + "   " +
                                "name:" + eng.get(i).getName() + "   " +
                                "age:" + eng.get(i).getAge() + "   " +
                                "salary:" + ((Trainee) eng.get(i)).calcSalary() + "   " +
                                "university name:" + ((Trainee) eng.get(i)).getUniName() + "   " +
                                "academic year:" + ((Trainee) eng.get(i)).getAcademicYear() + "   " +
                                "gpa:" + ((Trainee) eng.get(i)).getGpa());

                    }
            //}

         return (" ");
    }



    public String printEngineer(int i) throws NoItemsException , NegativeSalary {
        boolean flageng = true;

//        for (int i = 0; i < eng.size(); i++)
//        {

        if (Search((eng.get(i)).getId()) == 1) {

            return ("working hour:" + ((Engineer) eng.get(i)).getWorkingHours() + "   " +
                    "Name:" + eng.get(i).getName() + "   " +
                    "Age:" + eng.get(i).getAge() + "   " +
                    "Salary:" +
                    ((Engineer) eng.get(i)).calcSalary() + "   " +
                    "Id:" + eng.get(i).getId() + "   " +
                    "position:" + ((Engineer) eng.get(i)).getGrade().getPosition() + "   " +
                    "tax rate:" + ((Engineer) eng.get(i)).getGrade().getTaxRate() + "   " +
                    "payrate:" + ((Engineer) eng.get(i)).getGrade().getPayRate());
        }


//        }
 return (" ");

    }






    public void modify(Employee newE, int id) {
        for (int i = 0; i < eng.size(); i++) {
            if (id == eng.get(i).getId()) {
                int position = eng.indexOf(eng.get(i));
                eng.set(position, newE);
                break;
            }

        }

    }


    public int delete(int id) throws NoItemsException{


        try {
            for (int i = 0; i < eng.size(); i++) {
                if (id == eng.get(i).getId()) {
                    //if (Search((eng.get(i)).getId()) == 1) {

                    int position = eng.indexOf(eng.get(i));
                    eng.remove(position);
                  return 1;
                    //}

                }
            }
                throw new NoItemsException("no items to show");
            }
catch (NoItemsException n)
{
            return 0;
        }

        }




    public int Search( int id)
    {
        for (int i=0;i<eng.size();i++)
        {
            if (id == eng.get(i).getId())
                return 1;

        }
        return 0;


    }


}












