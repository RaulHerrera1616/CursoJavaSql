/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.CuentaBancaria_Entid;
import java.util.Scanner;

/**
 *
 * @author sistemas
 */
public class CuentaBancariaServicio {
    public CuentaBancaria_Entid crearCuenta(){
        CuentaBancaria_Entid cc = new CuentaBancaria_Entid();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("ingrese dni del cliente: ");
        cc.setDniCliente(123456789);
        System.out.println(" ");
        System.out.print("ingrese nro de cuenta: ");
        cc.setNumeroCuenta(123);
        System.out.println(" ");
        System.out.print("dinero inicial: " );
        cc.setSaldoInicial(500);
        return cc;
    }
    
//    UNIFICAR EL realizarTransaccion AL RESTO DEL CODIGO
//    public void realizarTransaccion(CuentaBancaria_Entid cc, double monto) {
//        // Realizar la transacción
//        double nuevoSaldo = cc.getNuevoActual() - monto;
//        // Actualizar el saldo actual
//        cc.setSaldoActual(nuevoSaldo);
//    }
    //Aca ud estaba moostrando una cuenta vacia, primero tiene que setear cada uno de los atributos y resien mostrarlos
    public CuentaBancaria_Entid infoCuenta(CuentaBancaria_Entid cc){
        CuentaBancaria_Entid info = new CuentaBancaria_Entid();
        info.setDniCliente(cc.getDniCliente());
        info.setNumeroCuenta(cc.getNumeroCuenta());
        info.setSaldoInicial(cc.getSaldoInicial());
        info.setNuevoActual(cc.getNuevoActual());
        System.out.print("DNI del Cliente: " + info.getDniCliente());
        System.out.println(" ");
        System.out.println("Nro de Cuenta: " + info.getNumeroCuenta());
        System.out.println(" ");
        System.out.println("Saldo Inicial: " + info.getSaldoInicial());
        System.out.println(" ");
        System.out.println("Saldo Actual: " + info.getNuevoActual());
        return info;
    }
    
    public void ActualizoNuevoSaldo(CuentaBancaria_Entid cc){
        cc.setNuevoActual(cc.getNuevoActual()+cc.getSaldoInicial());
        
    }
    public void IngresoDinero (CuentaBancaria_Entid cc){
        Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero va a depositar");
        double monto = leer.nextDouble();
        // en esta parte se olvido de sumarle el saldo inicial asi le muestra el total del nuevo saldo
        cc.setNuevoActual(cc.getNuevoActual()+monto+cc.getSaldoInicial());
        System.out.println(infoCuenta(cc));
        System.out.println("Su saldo actual es de $ " + cc.getNuevoActual());
    }
    public void RetirarDinero (CuentaBancaria_Entid cc){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("cuanto dinero va a retirar");
        double monto = leer.nextDouble();
        if (monto<=cc.getNuevoActual()) {
            double aux =cc.getNuevoActual()-monto;
            cc.setNuevoActual(aux);
            System.out.println(infoCuenta(cc));
            System.out.println("su saldo actual es de " + cc.getNuevoActual());
        } else {
            System.out.println(infoCuenta(cc));
            System.out.println("no hay saldo suficiente");
        }
    }
    public void ExtraccionRapida (CuentaBancaria_Entid cc){
        if (cc.getNuevoActual()>0) {
            System.out.println("su saldo es de $ " + cc.getNuevoActual());
            System.out.println("va a retirar el 20% : $ " + cc.getNuevoActual()*0.20);
            cc.setNuevoActual(cc.getNuevoActual()-(cc.getNuevoActual()*0.20));
           
            System.out.println("su saldo es de $ " + cc.getNuevoActual());
        }else{
            System.out.println("no tiene saldo suficiente");
        }
    }
    public void ConsultaSaldo(CuentaBancaria_Entid cc){
        System.out.println("su saldo es de $ " + cc.getNuevoActual());
    }
    
}
//    CuentaBancaria_Entid cc = new CuentaBancaria_Entid();
//    public CuentaBancaria_Entid crearCuenta(){
//        
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.print("ingrese dni del cliente: ");
//        cc.setDniCliente(123456789);
//        System.out.println(" ");
//        System.out.print("ingrese nro de cuenta: ");
//        cc.setNumeroCuenta(123);
//        System.out.println(" ");
//        System.out.print("dinero inicial: " );
//        cc.setSaldoInicial(500);
//        cc.setNuevoActual(0);
//        cc.setNuevoActual(0);
//        return cc; 
//    }
//    
////    UNIFICAR EL realizarTransaccion AL RESTO DEL CODIGO
////    public void realizarTransaccion(CuentaBancaria_Entid cc, double monto) {
////        // Realizar la transacción
////        double nuevoSaldo = cc.getNuevoActual() - monto;
////        // Actualizar el saldo actual
////        cc.setSaldoActual(nuevoSaldo);
////    }
//    public CuentaBancaria_Entid infoCuenta(CuentaBancaria_Entid cc){
//        CuentaBancaria_Entid info = new CuentaBancaria_Entid();
//        info.setDniCliente(cc.getDniCliente());
//        info.setNumeroCuenta(cc.getNumeroCuenta());
//        info.setSaldoInicial(cc.getSaldoInicial());
//        info.setNuevoActual(cc.getNuevoActual());
//        System.out.print("DNI del Cliente: " + cc.getDniCliente());
//        System.out.println(" ");
//        System.out.println("Nro de Cuenta: " + cc.getNumeroCuenta());
//        System.out.println(" ");
//        System.out.println("Saldo Inicial: " + cc.getSaldoInicial());
//        System.out.println(" ");
//        System.out.println("Saldo Actual: " + cc.getNuevoActual());
//        return info;
//    }
//    
//    public void ActualizoNuevoSaldo(CuentaBancaria_Entid cc){
//        cc.setNuevoActual(cc.getNuevoActual()+cc.getSaldoInicial());
//        
//    }
//    public void IngresoDinero (CuentaBancaria_Entid cc){
//        Scanner leer = new Scanner(System.in);
//        System.out.println("cuanto dinero va a depositar");
//        cc.setNuevoActual(cc.getNuevoActual()+leer.nextDouble());
////        double monto = leer.nextDouble();
////        cc.setNuevoActual(cc.getNuevoActual()+monto);
//        System.out.println(infoCuenta(cc));
//        System.out.println("Su saldo actual es de $ " + cc.getNuevoActual());
//    }
//    public void RetirarDinero (CuentaBancaria_Entid cc){
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("cuanto dinero va a retirar");
//        double monto = leer.nextDouble();
//        if (monto<=cc.getNuevoActual()) {
//            double aux =cc.getNuevoActual()-monto;
//            cc.setNuevoActual(aux);
//            System.out.println(infoCuenta(cc));
//            System.out.println("su saldo actual es de " + cc.getNuevoActual());
//        } else {
//            System.out.println(infoCuenta(cc));
//            System.out.println("no hay saldo suficiente");
//        }
//    }
//    public void ExtraccionRapida (CuentaBancaria_Entid cc){
//        if (cc.getNuevoActual()>0) {
//            System.out.println("su saldo es de $ " + cc.getNuevoActual());
//            System.out.println("va a retirar el 20% : $ " + cc.getNuevoActual()*0.20);
//            cc.setSaldoActual(cc.getNuevoActual()-(cc.getNuevoActual()*0.20));
//           
//            System.out.println("su saldo es de $ " + cc.getNuevoActual());
//        }else{
//            System.out.println("no tiene saldo suficiente");
//        }
//    }
//    public void ConsultaSaldo(CuentaBancaria_Entid cc){
//        System.out.println("su saldo es de $ " + cc.getNuevoActual());
//    }
//    


