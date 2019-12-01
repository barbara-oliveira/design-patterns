package com.br.exemplo.nullobject.geeksforgeeks;

public class EmpData {
    public static final String[] names = {"Hache", "Salvador", "Anna"};

    public static Emp getClient(String name){
        for(String Listname : names){
            if(Listname.equalsIgnoreCase(name)){
                return new Coder(name);
            }
        }
        return new NoClient();
    }
}
