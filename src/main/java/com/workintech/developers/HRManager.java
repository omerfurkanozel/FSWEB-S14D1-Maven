package com.workintech.developers;

public class HRManager extends Employee {
   private JuniorDeveloper[] juniorDevelopers;
   private MidDeveloper[] midDevelopers;
   private SeniorDeveloper[] seniorDevelopers;

public HRManager(int id, String name, int sallary){
    super(id, name, sallary);
}
    public  HRManager(int id, String name, int sallary,
                      JuniorDeveloper[] juniorDevelopers,
                      SeniorDeveloper[] seniorDevelopers, MidDeveloper[] midDevelopers){
        super(id, name, sallary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers=midDevelopers;
        this.seniorDevelopers=seniorDevelopers;
    }

    public  void addEmployee(int index, JuniorDeveloper juniorDeveloper){
       try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("index is full some record exist ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
           System.out.println("index not found:" + index);
       }
    }
    public  void addEmployee(int index, MidDeveloper midDevoloper){
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDevoloper;
            } else {
                System.out.println("index is full some record exist ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("index not found:" + index);
        }

    }
    public  void addEmployee(int index, SeniorDeveloper seniorDevoloper){
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDevoloper;
            } else {
                System.out.println("index is full some record exist ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("index not found:" + index);
        }

    }
    @Override
    public void work(){
        System.out.println(getName()+ "hr manager starts to working");
    }

}

