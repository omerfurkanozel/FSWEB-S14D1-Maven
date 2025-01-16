package com.workintech.developers;

public class SeniorDeveloper extends  Employee{
    public SeniorDeveloper(int id, String name, int sallary){
        super(id,name,sallary);
    }
    @Override
    public  void work(){
        System.out.println(getName()+"senior developer starts to working...");
    }
}
