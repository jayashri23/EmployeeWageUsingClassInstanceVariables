package employeewage;

import java.util.Random;
public class EmpWageBuilder {
    private final String company;
    private final int empRatePerHours;
    private final int numberOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmpWageBuilder(String company ,int empRatePerHours,int numberOfWorkingDays, int maxHoursPerMonth){
        this.company=company;
        this.empRatePerHours=empRatePerHours;
        this.numberOfWorkingDays=numberOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
    }
    void computeEmpWage(){
        //variables
        int empHrs=0,totalEmpHours=0,totalWorkingDays=0;
        //computation
        while (totalEmpHours<=maxHoursPerMonth && totalWorkingDays <numberOfWorkingDays){
            totalWorkingDays++;
            Random rand=new Random();
            int check=rand.nextInt(3);
            switch (check){
                case 1:
                    System.out.println("PartTime");
                    empHrs=4;
                    break;
                case 2:
                    System.out.println("fullTime");
                    empHrs=8;
                    break;
                default:
                    System.out.println("Absent");
                    empHrs=0;
            }
            totalEmpHours=totalEmpHours+empHrs;
            System.out.println("Day:"+totalWorkingDays+ "Emp Hr:"  +totalEmpHours);
        }
        totalEmpWage=totalEmpHours*empRatePerHours;
    }
    @Override
    public String toString(){
        return "Total Employee Wage for Company:" +company+ ":is  "  +totalEmpWage ;
    }
    public static void main(String [] args){
        EmpWageBuilder dmart=new EmpWageBuilder("Dmart",20,10,10);
        EmpWageBuilder relince=new EmpWageBuilder("Relince",10,20,20);
        dmart.computeEmpWage();
        relince.computeEmpWage();
        System.out.println(relince);
    }
}
