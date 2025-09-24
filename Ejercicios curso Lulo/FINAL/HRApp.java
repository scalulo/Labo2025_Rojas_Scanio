package objetos;

import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee emp1 = new Employee(1001010, "toto", 100000);
        Employee emp2 = new Employee(1091919, "juan", 90000);

        Department dept = new Department("Education", new ArrayList<>());
        dept.addWorker(emp1);
        dept.addWorker(emp2);

        System.out.println("Emp " + emp1);
        System.out.println("Emp " + emp2);

        ArrayList<Employee> workers = dept.getAllWorkers();

        for (Employee emp : workers) {
            System.out.println("Emp " + emp);
        }

        System.out.println("Total " + dept.calculateTotalSalary());
        System.out.println("Promedio " + dept.calculateAverageSalary());
        System.out.println("Emp " + dept.findWorkerById(1001010));
    }
}
