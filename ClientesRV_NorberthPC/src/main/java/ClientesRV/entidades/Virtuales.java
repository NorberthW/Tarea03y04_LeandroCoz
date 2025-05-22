package ClientesRV.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Virtuales")

public class Virtual
{
    @IdVirtual
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdVirtual;

    @Column(name = "Cultura", nullable = false, length = 100)
    private String Cultura;

    @Column(name = "Periodo", nullable = false, length = 50)
    private String Periodo;

    @Column(name = "Tiempo", nullable = false, length = 50)
    private String Tiempo;

    @Column(name = "Precio", nullable = false)
    private Double Precio;
}
public Virtual( Integer IdVirtual,  String Cultura, String Periodo, String Tiempo,Double Precio ) {
    this.IdVirtual = IdVirtual;
    this.Cultura = Cultura;
    this.Periodo = Periodo;
    this.Tiempo = Tiempo;
    this.Precio = Precio;
}

public Integer getIdVirtual() {
    return IdVirtual;
}

public void setIdVirtual(Integer IdVirtual) {
    this.IdVirtual = IdVirtual;
}

public String getCultura() {
    return Cultura;
}

public void setCultural(String Cultura) {
    this.Cultura = Cultura;
}

public String getPeriodon() {
    return Periodo;
}

public void setPeriodo(String Periodo) {
    this.Periodo = Periodo;
}

public String getTiempon() {
    return Tiempo;
}

public void setTiempo(String Tiempo) {
    this.Tiempo = Tiempo;
}

public String getPrecio() {
    return Precio;
}

public void setPrecio(Double Precio) {
    this.Precio = Precio;
}