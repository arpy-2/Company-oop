package ies.tierno.org.Empresa.Models;

public class Empleado {
    private String nif;
    private String name;
    private String surname;
    private String position;

    public Empleado(String nif, String name, String surname, String position) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getNif() {
        return nif;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + nif + ") - " + position;
    }
}