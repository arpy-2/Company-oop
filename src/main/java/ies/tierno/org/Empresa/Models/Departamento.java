package ies.tierno.org.Empresa.Models;

public class Departamento {
    private String name;
    private double budget;
    private Empleado[] employees;
    private int employeeCount;

    public Departamento(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.employees = new Empleado[20];
        this.employeeCount = 0;
    }

    public String getName() {
        return name;
    }
    public double getBudget() {
        return budget;
    }
    public int getEmployeeCount() {
        return employeeCount;
    }
    public Empleado[] getEmployees() {
        return employees;
    }

    public void addEmployee(Empleado e) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = e;
            employeeCount++;
        }
    }

    public Empleado findEmployee(String nif) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getNif().equalsIgnoreCase(nif)) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Departamento: " + name + ", Presupuesto: " + budget + "€";
    }
}