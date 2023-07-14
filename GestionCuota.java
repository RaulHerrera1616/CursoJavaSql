/*
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package entidad;

import java.util.Date;


public class GestionCuota  {
    private Integer nCuota;
    private Double montoCuota;
    private Boolean paga;
    private Date fechaVencimiento;
    private String tipoPago;

    public GestionCuota() {
        
    }

    public GestionCuota(Integer nCuota, Double montoCuota, Boolean paga, Date fechaVencimiento, String tipoPago) {
        this.nCuota = nCuota;
        this.montoCuota = montoCuota;
        this.paga = paga;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoPago = tipoPago;
    }
    

    public Integer getnCuota() {
        return nCuota;
    }

    public void setnCuota(Integer nCuota) {
        this.nCuota = nCuota;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public Boolean getPaga() {
        return paga;
    }

    public void setPaga(Boolean paga) {
        this.paga = paga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "GestionCuota{" + "nCuota=" + nCuota + ", montoCuota=" + montoCuota + ", paga=" + paga + ", fechaVencimiento=" + fechaVencimiento + ", tipoPago=" + tipoPago + '}';
    }
    
    
    
    
    
    
}
