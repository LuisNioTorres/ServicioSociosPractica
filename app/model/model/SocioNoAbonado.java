package model;

public class SocioNoAbonado extends Socio {
    public final boolean esAbonado = false;

    public SocioNoAbonado(String cedula, String nombre, int edad, int partidosVisitados) {
        super(cedula, nombre, edad, partidosVisitados);
    }

    public SocioNoAbonado(String cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
    }

    public void irAlEstadio() {
        System.out.println("Pagando entrada al estadio " + EstadioEquipo.VALOR_ENTRADA);
        aumentarPartidoVisitado();
    }

    @Override
    public boolean esAbonado() {
        return this.esAbonado;
    }

}
