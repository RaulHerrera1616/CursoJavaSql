/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package turismo.entidades;


public class Camping extends AlojamientoExtrahoteleros {
    private Integer cantidadMaxCarpas;
    private Integer cantidadBanios;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer cantidadMaxCarpas, Integer cantidadBanios, Boolean restaurante, Boolean privado, Double cantMetrosCuadrados, String nombre, String direccion, String localidad, String Gerente) {
        super(privado, cantMetrosCuadrados, nombre, direccion, localidad, Gerente);
        this.cantidadMaxCarpas = cantidadMaxCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public Integer getCantidadMaxCarpas() {
        return cantidadMaxCarpas;
    }

    public void setCantidadMaxCarpas(Integer cantidadMaxCarpas) {
        this.cantidadMaxCarpas = cantidadMaxCarpas;
    }

    public Integer getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(Integer cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantidadMaxCarpas=" + cantidadMaxCarpas + ", cantidadBanios=" + cantidadBanios + ", restaurante=" + restaurante + '}';
    }

    @Override
    public double getPrecioHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
