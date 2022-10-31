package employeewage;

import java.util.Random;

public class EmployeeIsPresentOrAbsent {

    public void employeeAttendance() {

        Random rand = new Random();
        int attendanceCheck=rand.nextInt(2);
        if(attendanceCheck == 1){
            System.out.println("Employee is Present");
        }else
        {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String [] args){
        System.out.println("Welcome To Employee Wage Computation Program");
        EmployeeIsPresentOrAbsent s=new EmployeeIsPresentOrAbsent();
        s.employeeAttendance();
    }
}
