package ies.tierno.org.Empresa.Models;

public class Empresa {
    private String name;
    private String cif;
    private Departamento[] departments;
    private int departmentCount;

    public Empresa(String name, String cif) {
        this.name = name;
        this.cif = cif;
        this.departments = new Departamento[10];
        this.departmentCount = 0;
    }

    public String getName() {
        return name;
    }
    public String getCif() {
        return cif;
    }
    public int getDepartmentCount() {
        return departmentCount;
    }
    public Departamento[] getDepartments() {
        return departments;
    }

    public void addDepartment(Departamento d) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = d;
            departmentCount++;
        }
    }

    public Departamento findDepartment(String name) {
        for (int i = 0; i < departmentCount; i++) {
            if (departments[i].getName().equalsIgnoreCase(name)) {
                return departments[i];
            }
        }
        return null;
    }
}