package com.workintech.developers;

public class MidDeveloper extends  Employee{
    public MidDeveloper(int id, String name, int sallary){
        super(id, name, sallary);
    }
    @Override
    public void work(){
        System.out.println(getName()+"mid developer starts to working...");
    }
}
