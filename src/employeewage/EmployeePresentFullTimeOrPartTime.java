package employeewage;

import java.util.Random;

public class EmployeePresentFullTimeOrPartTime {
    private int fullTimeHr;
    private int employeeWage;
    private int partTimeHr;

    public EmployeePresentFullTimeOrPartTime(int hr){
        fullTimeHr=hr;
    }
    public void setWage(int wage){
            employeeWage=wage;
    }
    public void setPartTime(int partTime1){
        partTimeHr=partTime1;
    }
    public  void printEmp(){
        System.out.println("Employee Wage =" +employeeWage);
        System.out.println("Employee Part Time Hours =" +partTimeHr);
        System.out.println("Employee Full Time Hours =" +fullTimeHr);
        Random rand = new Random();
        int x = rand.nextInt(3);

        if (x == 2) {
            System.out.println("Employee is present full time and salary:");
          int  salary = (fullTimeHr * employeeWage);
            System.out.println("Employee Full Time Wage=" +salary);
        } else if (x == 1) {
            System.out.println("Employee is part time present and salary:");
            int salary = (partTimeHr * employeeWage);
            System.out.println("Employee Part Time Wage =" +salary);
        } else {
            System.out.println("Employee is absent and salary  is 0");
    }
}
public static void main(String [] args){
        EmployeePresentFullTimeOrPartTime part=new EmployeePresentFullTimeOrPartTime(16);
        part.setPartTime(8);
        part.setWage(20);
        part.printEmp();
    }
}
