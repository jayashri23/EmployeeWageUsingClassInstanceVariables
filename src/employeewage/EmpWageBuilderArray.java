package employeewage;

import java.util.Random;

public class EmpWageBuilderArray {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHour,
                                   int numOfWorkings, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour,
                numOfWorkings, maxHoursPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        //variable
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            Random r = new Random();
            int empCheck = r.nextInt(3);
            switch (empCheck) {
                case partTime:
                    System.out.println("partTime");
                    empHrs = 4;
                    break;
                case fullTime:
                    System.out.println("FullTime");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Absent");
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day " + totalWorkingDays + "Emp Hr:" + totalEmpHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilderArray emp = new EmpWageBuilderArray();
        emp.addCompanyEmpWage("Dmart", 20, 2, 10);
        emp.addCompanyEmpWage("Relince", 10, 5, 10);
        emp.computeEmpWage();
    }
}
