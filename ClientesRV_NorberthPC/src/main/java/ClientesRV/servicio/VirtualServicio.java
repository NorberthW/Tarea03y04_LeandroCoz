package ClientesRV.servicio;

import ClientesRV.entidades.Virtual;
import ClientesRV.repositorio.VirtualRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  java.util.List;
@Service
public class VirtualServicio {

    @Autowired
    private VirtualRepositorio VirtualRepositorio;

    public List<Virtual> listarVirtual() {

        return VirtualRepositorio.findAll();
    }

    public Virtual agregarVirtuala(Virtual Virtual) {

        return VirtualRepositorio.save(Virtual);
    }

    public Virtual editarVirtual(Integer IdVirtual) {

        return VirtualRepositorio.findById(IdVirtual).get();
    }

    public Virtual actualizarVirtual(Virtual Virtual) {

        return VirtualRepositorio.save(Virtual);
    }

    public void eliminarVirtual(Integer IdVirtual) {

        VirtualRepositorio.deleteById(IdVirtual);
    }
}
