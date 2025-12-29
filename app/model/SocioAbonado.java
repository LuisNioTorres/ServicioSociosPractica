public class SocioAbonado extends Socio {
    private final boolean esAbonado = true;

    public SocioAbonado(String cedula, String nombre, int edad, int partidosVisitados) {
        super(cedula, nombre, edad, partidosVisitados);
    }

    public SocioAbonado(String cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
    }

    public void irAlEstadio() {
        System.out.println("Pagar Abono Mensual, valor es = " + ABONO_MENSUAL);
    }

}
