package employeewage;

import java.util.Random;

public class WagesForMonthTillConditionOFMonthAndDaysReaches {
    public int workingForFullTime;
    public int workingForPartTime;
    public int wageForDaily;
    public int numberOfWorkingDays;
    public int workingHr;
    public int maximumWorkingHr;
    public int monthlySalary;
    public void Wage(int fullTimeHr,int partTimeHr,int wage,int days, int maxHrs,int hr,int totalWorkingDays){

        numberOfWorkingDays=days;
        workingForFullTime=fullTimeHr;
        workingForPartTime=partTimeHr;
        wageForDaily=wage;
        maximumWorkingHr=maxHrs;
        workingHr=hr;
        int salary=0;
        int empHours=0;
        int totalWorkingHOurs=0;

        while (totalWorkingDays< days &&totalWorkingHOurs < maxHrs)
        {
            totalWorkingDays ++;
            Random random=new Random();
            int x=random.nextInt(3);
            switch (x)
            {
                case 0:
                    System.out.println("Day="+totalWorkingDays);
                    System.out.println("Employee is Absent");
                    empHours=0;
                    salary=empHours*wage;
                    System.out.println("Salary: " +salary);
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Day="+totalWorkingDays);
                    System.out.println("Employee is Present Part Time");
                    empHours=fullTimeHr;
                     salary=(wage*empHours);
                    System.out.println("Salary :" +salary);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Day="+totalWorkingDays);
                    System.out.println("Employee is Present full time");
                    empHours=partTimeHr;
                    salary=(wage*empHours);
                    System.out.println("Salary :" +salary);
                    System.out.println();
                    break;
            }
            monthlySalary+=salary;
            totalWorkingHOurs+=empHours;
        }
    }
    public static void main(String [] args){
        System.out.println("Welcome to Employee Wage ");
        System.out.println("Calculating Employee Wage Till Days reaches 20 and working hours reaches 100:");
        WagesForMonthTillConditionOFMonthAndDaysReaches wage=new WagesForMonthTillConditionOFMonthAndDaysReaches();
        wage.Wage(16,8,20,20,100,0,0);
    }
}
