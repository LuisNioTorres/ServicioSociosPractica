package model;

public abstract class Socio extends Persona implements IAccionesSocio {
    private int partidosVisitados;

    public Socio(String cedula, String nombre, int edad, int partidosVisitados) {
        super(cedula, nombre, edad);
        this.partidosVisitados = partidosVisitados;
    }

    public Socio(String cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
        this.partidosVisitados = 0;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("He visitado " + this.partidosVisitados + " partidos. ");
    }

    public abstract boolean esAbonado();

    public void aumentarPartidoVisitado() {
        this.partidosVisitados += 1;
    }
}
