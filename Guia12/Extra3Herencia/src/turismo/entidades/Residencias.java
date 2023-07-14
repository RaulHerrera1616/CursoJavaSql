/*
 Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios 
y si posee o no campo deportivo.
 */
package turismo.entidades;


public class Residencias extends AlojamientoExtrahoteleros {
    private Integer cantidadHabitaciones;
    private Boolean descuentoGremios;
    private Boolean complejoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantidadHabitaciones, Boolean descuentoGremios, Boolean complejoDeportivo, Boolean privado, Double cantMetrosCuadrados, String nombre, String direccion, String localidad, String Gerente) {
        super(privado, cantMetrosCuadrados, nombre, direccion, localidad, Gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.complejoDeportivo = complejoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Boolean getDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(Boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public Boolean getComplejoDeportivo() {
        return complejoDeportivo;
    }

    public void setComplejoDeportivo(Boolean complejoDeportivo) {
        this.complejoDeportivo = complejoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentoGremios=" + descuentoGremios + ", complejoDeportivo=" + complejoDeportivo + '}';
    }

    @Override
    public double getPrecioHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
