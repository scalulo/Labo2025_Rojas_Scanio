package objetos;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employe> staffList = new ArrayList<>();
    private int lastAddedIndex = -1;

    public Department(String deptName, ArrayList<Employe> staffList) {
        this.deptName = deptName;
        this.staffList = staffList;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ArrayList<Employe> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Employe> staffList) {
        this.staffList = staffList;
    }

    public void addWorker(Employe newWorker) {
        if (lastAddedIndex < staffList.size()) {
            lastAddedIndex++;
            staffList.add(newWorker);
        }
    }

    public ArrayList<Employe> getAllWorkers() {
        ArrayList<Employe> updatedList = new ArrayList<>();
        for (Employe worker : staffList) {
            updatedList.add(worker);
        }
        return updatedList;
    }

    public int countWorkers() {
        return lastAddedIndex + 1;
    }

    public Employe findWorkerById(int workerId) {
        for (Employe worker : staffList) {
            if (workerId == worker.getID()) {
                return worker;
            }
        }
        return null;
    }

    public double calculateTotalSalary() {
        double totalPay = 0.0;
        for (Employe worker : staffList) {
            totalPay += worker.getSalary();
        }
        return totalPay;
    }

    public double calculateAverageSalary() {
        if (lastAddedIndex > -1) {
            return calculateTotalSalary() / staffList.size();
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return deptName;
    }
}
