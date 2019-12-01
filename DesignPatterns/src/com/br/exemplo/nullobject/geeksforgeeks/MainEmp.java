package com.br.exemplo.nullobject.geeksforgeeks;

public class MainEmp {
    public static void main(String[] args){
        Emp emp1 = EmpData.getClient("Anna");
        Emp emp2 = EmpData.getClient("Hache");
        Emp emp3 = EmpData.getClient("Salvador");
        Emp emp4 = EmpData.getClient("Musashi");

        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }
}
