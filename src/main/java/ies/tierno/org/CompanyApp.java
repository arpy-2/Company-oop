package ies.tierno.org;

import ies.tierno.org.Empresa.Models.*;
import ies.tierno.org.Empresa.Readers.*;
import java.util.Scanner;

public class CompanyApp {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("EMPRESA");
        Empresa empresa = EmpresaReader.readEmpresa(scanner);

        createData(empresa);

        System.out.println("Datos creados:");
        System.out.println("Departamentos: Desarrollo, Marketing, Recursos Humanos");

        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) printDepartamento(empresa);
            else if (option == 2) printEmpleados(empresa);
            else if (option == 3) findEmpleado(empresa);
            else if (option == 4) System.out.println("Saliendo...");
            else System.out.println("Opcion no valida");

        } while (option != 4);
    }

    private void createData(Empresa empresa) {
        Departamento d1 = new Departamento("Desarrollo", 50000.0);
        Departamento d2 = new Departamento("Marketing", 30000.0);
        Departamento d3 = new Departamento("Recursos Humanos", 25000.0);

        empresa.addDepartment(d1);
        empresa.addDepartment(d2);
        empresa.addDepartment(d3);

        Empleado e1 = new Empleado("12345678A", "Juan", "Perez", "Programador");
        Empleado e2 = new Empleado("87654321B", "Ana", "Lopez", "Jefe de Proyecto");
        Empleado e3 = new Empleado("11223344C", "Carlos", "Garcia", "Programador");

        Empleado e4 = new Empleado("44332211D", "Maria", "Martinez", "Marketing");
        Empleado e5 = new Empleado("55667788E", "Luis", "Rodriguez", "Marketing");

        Empleado e6 = new Empleado("99887766F", "Laura", "Sanchez", "Reclutadora");
        Empleado e7 = new Empleado("66778899G", "Pedro", "Fernandez", "Formacion");

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.addEmployee(e3);

        d2.addEmployee(e4);
        d2.addEmployee(e5);

        d3.addEmployee(e6);
        d3.addEmployee(e7);
    }

    private void printMenu() {
        System.out.println("1. Ver departamento");
        System.out.println("2. Ver empleados");
        System.out.println("3. Buscar empleado");
        System.out.println("4. Salir");
        System.out.print("Elige una de las siguientes opciones: ");
    }

    private void printDepartamento(Empresa empresa) {
        System.out.print("Departamento: ");
        String nombre = scanner.nextLine();
        Departamento d = empresa.findDepartment(nombre);

        if (d == null) {
            System.out.println("No se encuentra el departamento");
        } else {
            System.out.println("Nombre: " + d.getName());
            System.out.println("Presupuesto: " + d.getBudget());
            System.out.println("Empleados: " + d.getEmployeeCount());
        }
    }

    private void printEmpleados(Empresa empresa) {
        System.out.print("Departamento: ");
        String nombre = scanner.nextLine();
        Departamento d = empresa.findDepartment(nombre);

        if (d == null) {
            System.out.println("No se encuentra el departamento");
            return;
        }

        Empleado[] empleados = d.getEmployees();
        if (d.getEmployeeCount() == 0) {
            System.out.println("No hay empleados");
        } else {
            for (int i = 0; i < d.getEmployeeCount(); i++) {
                System.out.println(empleados[i]);
            }
        }
    }

    private void findEmpleado(Empresa empresa) {
        System.out.print("Departamento: ");
        String depto = scanner.nextLine();
        Departamento d = empresa.findDepartment(depto);

        if (d == null) {
            System.out.println("No existe el departamento");
            return;
        }

        System.out.print("NIF empleado: ");
        String nif = scanner.nextLine();
        Empleado e = d.findEmployee(nif);

        if (e == null) {
            System.out.println("No se encuentra el empleado en el departamento");
        } else {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new CompanyApp().run();
    }
}