package ClientesRV;

import ClientesRV.entidades.Virtual;
import ClientesRV.repositorio.VirtualRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner{
    @Autowired
    private VirtualRepositorio VirtualRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        }
    @Override
    public void run(String... args) throws Exception {

        Virtual = new Virtual("Kotosh", "Periodo 1", "5 min","5.00");

        VirtualRepositorio.save(Virtual);
    }
}