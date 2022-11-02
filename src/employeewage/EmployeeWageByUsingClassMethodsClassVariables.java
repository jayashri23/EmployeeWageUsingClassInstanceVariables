package employeewage;

import java.util.Random;

public class EmployeeWageByUsingClassMethodsClassVariables {
    public static int wage() {
        int maxHr = 100;
        int numWorkingDays = 20;
        int wage = 20;
        int totalWorkingDays = 0;
        int partHr = 8;
        int fullHr = 16;
        int monthlySalary = 0;
        while (totalWorkingDays <= numWorkingDays && totalWorkingDays <= maxHr) {
            totalWorkingDays++;
            Random random = new Random();
            int x = random.nextInt(3);
            if (x==0) {
                System.out.println("Day :" + totalWorkingDays);
                System.out.println("Employee is Absent");
                System.out.println();
            } else if (x==1) {
                System.out.println("Day:" + totalWorkingDays);
                System.out.println("Employee is Present Part Time");
                monthlySalary = (wage * partHr);
                System.out.println("Salary Of Month :");
                System.out.println();
            }else
                System.out.println("Day :" + totalWorkingDays);
                System.out.println("Employee is Present full time");
                monthlySalary = (wage * fullHr);
                System.out.println("Salary Of Month :");
                System.out.println();
        }return monthlySalary;
    }
         public static void main(String [] args){
        System.out.println("Calculating Employee Wage TillCondition Reaches");
        wage();
    }
 }
