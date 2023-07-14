/*
Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class GestionVehiculo {

    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private Integer numeroMotor;
    private Integer chasis;
    private Integer anio;

    public GestionVehiculo() {
    }

    public GestionVehiculo(String marca, String modelo, String color, String tipo, Integer numeroMotor, Integer chasis, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "GestionVehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", anio=" + anio + '}';
    }
    
    

}
