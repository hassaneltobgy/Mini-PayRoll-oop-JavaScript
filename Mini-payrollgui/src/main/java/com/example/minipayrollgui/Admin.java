package com.example.minipayrollgui;

public class Admin {
    String deletestr;
    public void addd(Employee e,Company co)throws NoItemsException
    {
        co.add(e);
    }
    public void deletee(Company co, int id) throws NoItemsException{
        {  int var = co.delete( id);
        if (var==0)
            System.out.println("item does not exist");
        else
            System.out.println("item removed successfully");}

    }
    public void editt(Employee newe,Company co, int id){

        co.modify(newe,id);
    }
    public void printEng(Company co, int i ) throws NoItemsException, NegativeSalary{
        String Str;
        Str= co.printEngineer(i);
        System.out.println(Str);
    }
    public void printTraineee(Company co, int i) throws NoItemsException{
        String Str2;
        Str2= co.printTrainee(i);
        System.out.println(Str2);
    }
    public double calcsalary(Employee e) throws NegativeSalary
    {
        return (e.calcSalary()) ;
    }



}


