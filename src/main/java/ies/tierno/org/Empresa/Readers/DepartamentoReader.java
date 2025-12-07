package ies.tierno.org.Empresa.Readers;

import ies.tierno.org.Empresa.Models.Departamento;
import java.util.Scanner;

public class DepartamentoReader {
    public static Departamento readDepartamento(Scanner scanner) {
        System.out.print("Nombre del departamento: ");
        String name = scanner.nextLine();

        System.out.print("Presupuesto: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        return new Departamento(name, budget);
    }
}