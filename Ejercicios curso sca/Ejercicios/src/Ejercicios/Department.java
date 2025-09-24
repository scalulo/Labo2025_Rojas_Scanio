package Ejercicios;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private int lastEmployeeAddedIndex = -1;

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee anEmployee) {
        if (lastEmployeeAddedIndex < employees.size()) {
            lastEmployeeAddedIndex++;
            employees.add(anEmployee);
        }
    }

    public ArrayList<Employee> getEmployee() {
        ArrayList<Employee> updatedEmployees = new ArrayList<>();

        for (Employee e : employees) {
            updatedEmployees.add(e);
        }
        return updatedEmployees;
    }

    public int getEmployeesCount() {
        return lastEmployeeAddedIndex + 1;
    }

    public Employee getEmployeeById(int empId) {
        for (Employee e : employees) {
            if (empId == e.getID()) {
                return e;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (Employee e : employees) {
            totalSalary += e.getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastEmployeeAddedIndex > -1) {
            return getTotalSalary() / employees.size();
        }
        return 0.0;
    }

    public String toString() {
        return name;
    }
}