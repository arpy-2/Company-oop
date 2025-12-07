package ies.tierno.org.Empresa.Readers;

import ies.tierno.org.Empresa.Models.Empresa;
import java.util.Scanner;

public class EmpresaReader {
    public static Empresa readEmpresa(Scanner scanner) {
        System.out.print("Nombre de la empresa: ");
        String name = scanner.nextLine();
        System.out.print("CIF: ");
        String cif = scanner.nextLine();
        return new Empresa(name, cif);
    }
}