package ClientesRV.Controlador;

import ClientesRV.entidades.Virtual;
import ClientesRV.servicio.VirtualServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/Virtuales")
public class VirtualControlador
{
    @Autowired
    private VirtualServicio VirtualServicio;

    @GetMapping
    public List<Virtual> index()
    {

        return VirtualServicio.listarVirtual();
    }

    }
