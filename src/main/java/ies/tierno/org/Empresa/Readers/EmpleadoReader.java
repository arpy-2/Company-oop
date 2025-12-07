package ies.tierno.org.Empresa.Readers;

import ies.tierno.org.Empresa.Models.Empleado;
import java.util.Scanner;

public class EmpleadoReader {
    public static Empleado readEmpleado(Scanner scanner) {
        System.out.print("NIF: ");
        String nif = scanner.nextLine();

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Apellido: ");
        String surname = scanner.nextLine();

        System.out.print("Posicion: ");
        String position = scanner.nextLine();

        return new Empleado(nif, name, surname, position);
    }
}