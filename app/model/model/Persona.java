package model;

public abstract class Persona {
    private String cedula;
    private String nombre;
    private int edad;

    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Mi nombre es " + this.nombre + " con cedula " + this.cedula);
    }
}
