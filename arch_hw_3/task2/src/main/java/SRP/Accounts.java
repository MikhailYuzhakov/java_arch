package SRP;

import java.util.List;

/**
 * Бухгалтерия
 */
public class Accounts {
    private List<Employee> employees;
    private int baseSalary;

    public Accounts(List<Employee> employees) {
        this.employees = employees;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.13);
        return baseSalary - tax;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
