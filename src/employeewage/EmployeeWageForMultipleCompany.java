package employeewage;

import java.util.Random;

public class EmployeeWageForMultipleCompany {
    public static int employeeWage(String company ,int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
        //variables
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        //computation
        while (totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            Random rand =new Random();
            int check=rand.nextInt(3);
            switch (check){
                case 1 :
                    System.out.println("fullTime");

                    empHrs=4;
                break;
                case 2 :
                    System.out.println("partTime");
                    empHrs=8;
                break;
                default :
                    empHrs=0;
                break;
                }
                totalEmpHrs=totalEmpHrs+empHrs;
            System.out.println("Day:" +totalWorkingDays+ "Emp Hr:" +empHrs);
             }
        int totalWage=totalEmpHrs*empRatePerHour;
        System.out.println("Total Employee Wage for Company:"+company+ "is: "+totalWage);
        return totalWage;
        }
        public static void main(String [] args){
        employeeWage("Reliance",20,2,10);
        employeeWage("Tata",10,4,20);
    }
}
