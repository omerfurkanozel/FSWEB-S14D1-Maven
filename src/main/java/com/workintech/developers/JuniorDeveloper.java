package com.workintech.developers;

public class JuniorDeveloper extends  Employee {
    public JuniorDeveloper(int id, String name, int sallary) {
        super(id, name, sallary);
    }
    @Override
    public void work(){
        System.out.println(getName()+ "junior developer starts to working...");
    }
}