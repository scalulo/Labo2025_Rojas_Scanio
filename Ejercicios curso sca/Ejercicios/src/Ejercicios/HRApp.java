package Ejercicios;

import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(1001010, "toto", 100000);
        Employee e2 = new Employee(1091919, "juan", 90000);

        Department dept = new Department("Education", new ArrayList<>());
        dept.addEmployee(e1);
        dept.addEmployee(e2);

        System.out.println("Emp " + e1);
        System.out.println("Emp " + e2);
        ArrayList<Employee> emps = dept.getEmployee();

        for (Employee e : emps) {
            System.out.println("Emp " + e);
        }
        System.out.println("Total " + dept.getTotalSalary());
        System.out.println("Promedio " + dept.getAverageSalary());
        System.out.println("Emp " + dept.getEmployeeById(1001010));
    }
}