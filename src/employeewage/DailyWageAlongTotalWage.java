package employeewage;

import java.util.Random;

public class DailyWageAlongTotalWage {
    private final int empRatePerHours;
    private final int numberOfWorkingDays;
    private int totalEmpWage;
    public DailyWageAlongTotalWage(int empRatePerHours,int numberOfWorkingDays){

        this.empRatePerHours=empRatePerHours;

        this.numberOfWorkingDays=numberOfWorkingDays;

    }
    private void computeEmpWage(){
        //variables
        int empHrs=0,totalEmpHours=0,totalWorkingDays=0;
        //computation
        while (totalWorkingDays<=numberOfWorkingDays) {
            totalWorkingDays++;
            Random rand = new Random();
            int check = rand.nextInt(3);
            switch (check) {
                case 1:
                    System.out.println("Day="+totalWorkingDays+ " PartTime");
                    empHrs = 4;
                    int dailyWage = empHrs * empRatePerHours;
                    System.out.println("DailyEmpWage="+dailyWage);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Day="+totalWorkingDays+ " fullTime");
                    empHrs = 8;
                    dailyWage = empHrs * empRatePerHours;
                    System.out.println("DailyEmpWage="+dailyWage);
                    System.out.println();
                    break;
                default:
                    System.out.println("Day="+totalWorkingDays+ " Absent");
                    empHrs = 0;
                    dailyWage = empHrs * empRatePerHours;
                    System.out.println("DailyEmpWage="+dailyWage);
                    System.out.println();
            }
            totalEmpHours=totalEmpHours+empHrs;
        }
        totalEmpWage=totalEmpHours*empRatePerHours;
        System.out.println("Total Days: "+totalWorkingDays+ " Total Employee Wage="  +totalEmpWage);
    }

    public static void main(String [] args){
        System.out.println("......................................................");
        System.out.println("Calculating Daily Employee Wage along With Total Wage:");
        System.out.println("......................................................");
        DailyWageAlongTotalWage wage=new DailyWageAlongTotalWage(20,30 );
        wage.computeEmpWage();
    }
}
