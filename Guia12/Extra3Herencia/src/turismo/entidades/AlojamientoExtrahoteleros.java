/*
 En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa
 */
package turismo.entidades;


public abstract class AlojamientoExtrahoteleros extends Alojamiento {
    protected Boolean privado;
    protected Double cantMetrosCuadrados;

    public AlojamientoExtrahoteleros() {
    }

    public AlojamientoExtrahoteleros(Boolean privado, Double cantMetrosCuadrados, String nombre, String direccion, String localidad, String Gerente) {
        super(nombre, direccion, localidad, Gerente);
        this.privado = privado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public abstract double getPrecioHabitacion(); 

    @Override
    public String toString() {
        return "AlojamientoExtrahoteleros{" + "privado=" + privado + ", cantMetrosCuadrados=" + cantMetrosCuadrados + '}';
    }
    
}
