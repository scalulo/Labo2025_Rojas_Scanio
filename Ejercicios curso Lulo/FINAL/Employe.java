package objetos;

public class Employee {
    private int empCode;
    private String fullName;
    private double payRate;

    public Employee(int empCode, String fullName, double payRate) {
        this.empCode = empCode;
        this.fullName = fullName;
        this.payRate = payRate;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Employee " + getEmpCode() + " " + getFullName() + " " + getPayRate();
    }
}
