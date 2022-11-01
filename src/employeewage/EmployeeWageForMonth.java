package employeewage;
import java.util.Random;
public class EmployeeWageForMonth {
    public int workingForFullTime;
    public int workingForPartTime;
    public int wageForDaily;
    public int numberOfWorkingDays;

    public void month(int fullTime ,int partTime,int wage,int days){
        fullTime=workingForFullTime;

        partTime=workingForPartTime;

        wage=wageForDaily;

        days=numberOfWorkingDays;
    }
    public void printMonth(){
        System.out.println("Employee Part Time Working Hr =" +workingForFullTime);
        System.out.println("Employee Full Time Working Hr =" +workingForPartTime);
        System.out.println("Employee Wage = " +wageForDaily);
        Random rand = new Random();
        int isPresent = rand.nextInt(3);
        if(isPresent == 2){
                System.out.println("Employee is Present Full Time");
               int salary = (wageForDaily * workingForFullTime);
               int total = (salary * numberOfWorkingDays);
                System.out.println("Salary of Month is: " + total);
            } else if (isPresent == 1) {
                System.out.println("Employee is Present Part Time ");
               int salary = (wageForDaily * workingForPartTime);
               int total = (salary * numberOfWorkingDays);
                System.out.println("Salary oF Month is:" + total);
            } else
                System.out.println("Employee is Absent ");
        }
        public static void main(String  [] args){
            System.out.println("......................");
            System.out.println("Calculating Employee Wage For Month:");
            System.out.println("......................");
            EmployeeWageForMonth obj =new EmployeeWageForMonth();
            obj.month(16,8,20,20);
            obj.printMonth();
        }
    }

