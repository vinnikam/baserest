package co.vinni.funcional.servicios;

import co.vinni.funcional.controller.exception.ResourceNotFoundException;
import co.vinni.funcional.modelo.Vehiculo;
import co.vinni.funcional.repositorio.VehiculoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculoServicio {
    @Autowired
    private final VehiculoRepositorio vehiculoRepositorio;
    public Vehiculo buscarXId(Long id) throws ResourceNotFoundException{
        var vehiculo = vehiculoRepositorio.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Vehiculo no encontrado id :: "+id));
        return vehiculo;
    }
    public List<Vehiculo> buscarTodos() {
        return vehiculoRepositorio.findAll();
    }
}
