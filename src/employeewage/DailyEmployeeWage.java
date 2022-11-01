package employeewage;
import java.util.Random;
public class DailyEmployeeWage {
    public int workingHours;
    public int wagePerHour;
    public DailyEmployeeWage(int hr) {
         workingHours=hr;
    }
    public void setWage(int wage){
        wagePerHour = wage;
    }
    public void employeeD() {

        System.out.println("Employee Wage per hours= " + wagePerHour);
        System.out.println("Employee Working Hours =" + workingHours);
        Random rand = new Random();
        int isPresent = rand.nextInt(2);
        if (isPresent == 1) {
            System.out.println("Employee is Present");
            int salary = wagePerHour * workingHours;
            System.out.println("Employee Daily Wage = " +salary);
        } else {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String [] args){
    DailyEmployeeWage obj = new DailyEmployeeWage(8);
        obj.setWage(20);
        obj.employeeD();
    }
}