package app.controller;

import java.util.List;

import app.service.service.ServicesRepository;
import model.*;

public class Main {
    public static void main(String[] args) {
        SocioAbonado abonado1 = new SocioAbonado("A001", "Ana Pérez", 25, 0);
        SocioAbonado abonado2 = new SocioAbonado("A002", "Luis Gómez", 30, 0);
        SocioAbonado abonado3 = new SocioAbonado("A003", "Marta López", 22, 0);
        SocioAbonado abonado4 = new SocioAbonado("A004", "Carlos Ruiz", 28);
        SocioAbonado abonado5 = new SocioAbonado("A005", "Sofía Díaz", 35);
        SocioNoAbonado noAbonado1 = new SocioNoAbonado("N001", "Jorge Ramírez", 27);
        SocioNoAbonado noAbonado2 = new SocioNoAbonado("N002", "Lucía Fernández", 24);
        SocioNoAbonado noAbonado3 = new SocioNoAbonado("N003", "Andrés Molina", 31);
        SocioNoAbonado noAbonado4 = new SocioNoAbonado("N004", "Camila Torres", 29);
        ServicesRepository servicioBancoPichincha = new ServicesRepository();
        servicioBancoPichincha.agregarSocio(noAbonado4);
        servicioBancoPichincha.agregarSocio(abonado1);
        servicioBancoPichincha.agregarSocio(abonado2);
        servicioBancoPichincha.agregarSocio(noAbonado3);
        List<Socio> listaSocios = servicioBancoPichincha.getUsuarios();
        for (Socio socio : listaSocios) {
            socio.irAlEstadio();
            socio.presentarse();
        }
        Socio socioAEliminar1 = servicioBancoPichincha.sociosStorage.obtenerSocioPorCedula("N004");
        System.out.println("Se intenta eliminar a existente : ");
        socioAEliminar1.presentarse();
        Socio socioAEliminar2 = servicioBancoPichincha.sociosStorage.obtenerSocioPorCedula("N004ddddsfd");
        System.out.println(socioAEliminar2);
        System.out.println("Se intenta eliminar a NO EXISTENTE : "
                + servicioBancoPichincha.sociosStorage.obtenerSocioPorCedula("N004ddddsfd"));
        System.out.println("Socio eliminado correctamente a : " + socioAEliminar1 + " Se logro si? : "
                + servicioBancoPichincha.eliminarSocioPorCedula("N003"));
        System.out
                .println("!!! Socio eliminado correctamente a : " + socioAEliminar2 + " no se logro eliminar verdad ? "
                        + servicioBancoPichincha.eliminarSocioPorCedula("Nd3"));
        for (Socio socio : listaSocios) {
            socio.irAlEstadio();
            socio.presentarse();
        }
    }
}
