package app.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import model.Socio;

public class SociosRepository {
    public final List<Socio> storage = new ArrayList<Socio>();

    public boolean agregarSocio(Socio socioNuevo) {
        return this.storage.add(socioNuevo);
    }

    public boolean eliminarSocio(String cedula) {
        Socio socioEliminar = obtenerSocioPorCedula(cedula);
        if (socioEliminar == null) {
            return false;
        }
        return this.storage.removeIf(socio -> socio.getCedula().equals(cedula));
    }

    public Socio obtenerSocioPorCedula(String cedula) {
        for (Socio socio : storage) {
            if (socio.getCedula().equals(cedula))
                return socio;
        }
        return null;
    }

    public boolean editarSocioPorCedula(String cedulaBuscar, String nombreNuevo) {
        Socio socioEditar = obtenerSocioPorCedula(cedulaBuscar);
        if (socioEditar != null) {
            socioEditar.setNombre(nombreNuevo);
            return true;
        }
        return false;
    }

    public List<Socio> getStorage() {
        return this.storage;
    }
}
