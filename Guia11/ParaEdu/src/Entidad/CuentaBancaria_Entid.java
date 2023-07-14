/*

 */
package Entidad;

public class CuentaBancaria_Entid {

    private int numeroCuenta;
    private long dniCliente;
    private double saldoInicial;
    private double nuevoActual;

    public CuentaBancaria_Entid() {
    }

    public CuentaBancaria_Entid(int numeroCuenta, long dniCliente, double saldoInicial, double nuevoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoInicial = saldoInicial;
        this.nuevoActual = nuevoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getNuevoActual() {
        return nuevoActual;
    }

    public void setNuevoActual(double nuevoActual) {
        this.nuevoActual = nuevoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria_Entid{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoInicial=" + saldoInicial + ", nuevoActual=" + nuevoActual + '}';
    }

}
