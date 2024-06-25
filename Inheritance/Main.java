package com.example.Inheritance;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne=new Engineer("Zeynep Güzel", 75000, 27);
        Salesperson employeeTwo=new Salesperson("Bediş Altun", 70000, 27, .25);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary); //75000
        System.out.println(employeeOne.getAnnualBonus()); //3750
        System.out.println(employeeTwo.salary); //84000
        System.out.println(employeeTwo.getCommissionPercentage()); //0.25

    }
}
