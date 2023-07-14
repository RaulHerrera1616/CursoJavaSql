/*
Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package entidad;

import java.util.ArrayList;
import java.util.Date;



public class GestionPoliza {
    
    private GestionIntegralCliente cliente;
    private ArrayList<GestionVehiculo> auto;
    private Integer numeroPoliza;
    private Date fechaInicioPoliza ;
    private Date fechaFinPoliza;
    private Double montoTotalAsegurado;
    private Integer cantidadCoutas;
    private String formaPago;
    private Boolean granizo;
    private Double montoMaxGranizo;
    private String tipoCobertura;
    private ArrayList<GestionCuota> gestionCuota;

    public GestionPoliza() {
    }

    public GestionPoliza(GestionIntegralCliente cliente, ArrayList<GestionVehiculo> auto, Integer numeroPoliza, Date fechaInicioPoliza, Date fechaFinPoliza, Double montoTotalAsegurado, Integer cantidadCoutas, String formaPago, Boolean granizo, Double montoMaxGranizo, String tipoCobertura, ArrayList<GestionCuota> gestionCuota) {
        this.cliente = cliente;
        this.auto = auto;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.cantidadCoutas = cantidadCoutas;
        this.formaPago = formaPago;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
        this.gestionCuota = gestionCuota;
    }
    

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(Date fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public Date getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(Date fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public Double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Integer getCantidadCoutas() {
        return cantidadCoutas;
    }

    public void setCantidadCoutas(Integer cantidadCoutas) {
        this.cantidadCoutas = cantidadCoutas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public GestionIntegralCliente getCliente() {
        return cliente;
    }

    public void setCliente(GestionIntegralCliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<GestionVehiculo> getAuto() {
        return auto;
    }

    public void setAuto(ArrayList<GestionVehiculo> auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "GestionPoliza{" + "cliente=" + cliente + ", auto=" + auto + ", numeroPoliza=" + numeroPoliza + ", fechaInicioPoliza=" + fechaInicioPoliza + ", fechaFinPoliza=" + fechaFinPoliza + ", montoTotalAsegurado=" + montoTotalAsegurado + ", cantidadCoutas=" + cantidadCoutas + ", formaPago=" + formaPago + ", granizo=" + granizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
}
