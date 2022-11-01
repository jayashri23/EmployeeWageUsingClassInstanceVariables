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
    public int totalSalary;
    public void Wage(int fullTimeHr,int partTimeHr,int wage,int days, int maxHrs,int hr,int totalWorkingDays){

        numberOfWorkingDays=days;
        workingForFullTime=fullTimeHr;
        workingForPartTime=partTimeHr;
        wageForDaily=wage;
        maximumWorkingHr=maxHrs;
        workingHr=hr;

        while (numberOfWorkingDays< totalWorkingDays &&workingHr < maxHrs)
        {
            Random random=new Random();
            int x=random.nextInt(3);
            numberOfWorkingDays ++;
            switch (x)
            {
                case 0:
                    System.out.println("Employee is Absent");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Employee is Present Part Time");
                     monthlySalary=(wage*workingForPartTime);
                    System.out.println("Salary :" +monthlySalary);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Employee is Present full time");
                     monthlySalary=(wage*workingForFullTime);
                    System.out.println("Salary :" +monthlySalary);
                    System.out.println();
            }
        }
    }
    public static void main(String [] args){
        System.out.println("Welcome to Employee Wage ");
        System.out.println("Calculating Employee Wage Till Days reaches 20 and working hours reaches 100:");
        WagesForMonthTillConditionOFMonthAndDaysReaches wage=new WagesForMonthTillConditionOFMonthAndDaysReaches();
        wage.Wage(16,8,20,0,100,0,20);
    }
}
