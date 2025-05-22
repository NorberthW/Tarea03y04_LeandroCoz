package ClientesRV.repositorio;

import ClientesRV.entidades.Virtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VirtualRepositorio extends JpaRepository<Virtual.Integer> {
}
