package employeewage;

import java.util.Random;

public class EmployeeWageByUsingSwitchCase {

    public int fullTimeWorkingHr;

    public int partTimeWorkingHr;

    public int dailyWage;

    public EmployeeWageByUsingSwitchCase(int wage){
        dailyWage =wage;
    }
    public void setFullTimeWorkingHr(int fullTime){
        fullTimeWorkingHr=fullTime;
    }
    public void setPartTimeWorkingHr(int partTime){
        partTimeWorkingHr=partTime;
    }
    public void printWage(){
        System.out.println("Employee Part Time Working Hr =" +partTimeWorkingHr);
        System.out.println("Employee Full Time Working Hr =" +fullTimeWorkingHr);
        System.out.println("Employee Wage = " +dailyWage);
        Random rand = new Random();
        int x = rand.nextInt(3);
        switch(x)
        {
            case 2:
                System.out.println("Employee full time present");
                int  salary = (fullTimeWorkingHr * dailyWage);
                System.out.println("Salary = " +salary);
                System.out.println(".....................");
                break;
            case 1:
                System.out.println("Employee Part time present");
                salary = (partTimeWorkingHr * dailyWage);
                System.out.println("Salary = " +salary);
                System.out.println("......................");
                break;
            default:
                System.out.println("Employee is absent");
                System.out.println(".....................");
        }
    }
    public static void main(String [] args){
        EmployeeWageByUsingSwitchCase obj=new EmployeeWageByUsingSwitchCase(20);
        obj.setFullTimeWorkingHr(16);
        obj.setPartTimeWorkingHr(8);
        obj.printWage();
    }
}
