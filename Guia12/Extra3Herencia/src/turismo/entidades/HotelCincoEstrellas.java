/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package turismo.entidades;


public final class HotelCincoEstrellas extends HotelCuatroEstrellas {

    private Integer cantSalonesConf;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(Integer cantSalonesConf, Integer cantidadSuites, Integer cantidadLimosinas) {
        this.cantSalonesConf = cantSalonesConf;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public HotelCincoEstrellas(Integer cantSalonesConf, Integer cantidadSuites, Integer cantidadLimosinas, Boolean gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double PrecioHabitaciones, String nombre, String direccion, String localidad, String Gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, PrecioHabitaciones, nombre, direccion, localidad, Gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public double precioHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
