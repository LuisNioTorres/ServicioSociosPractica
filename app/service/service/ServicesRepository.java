package app.service.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import app.repository.Repository.SociosRepository;
import model.Socio;

public class ServicesRepository {
    public SociosRepository sociosStorage = new SociosRepository();

    public boolean agregarSocio(Socio socioNuevo) {
        String cedulaSocioNuevo = socioNuevo.getCedula();
        if (cedulaSocioNuevo.isBlank()) {
            System.out.println("La cedula del socio a ingresar esta vacía!");
            return false;
        }
        return sociosStorage.agregarSocio(socioNuevo);
    }

    public boolean eliminarSocioPorCedula(String cedula) {
        if (cedula.isBlank()) {
            System.out.println("Cedula a eliminar es incorrecta");
            return false;
        }
        return sociosStorage.eliminarSocio(cedula);
    }

    public List<Socio> getUsuarios() {
        return sociosStorage.getStorage();
    }

    public boolean modificarSocioPorCedula(String cedula, String nombreNuevo) {
        if (nombreNuevo.isBlank()) {
            System.out.println("El nuevo nombre del socio es inválido");
            return false;
        }
        return sociosStorage.editarSocioPorCedula(cedula, nombreNuevo);
    }

    public List<Socio> getSociosPorTipoDeAbono(boolean esAbonado) {
        return sociosStorage.getStorage().stream().filter(socio -> socio.esAbonado() == esAbonado)
                .collect(Collectors.toList());
    }

}
