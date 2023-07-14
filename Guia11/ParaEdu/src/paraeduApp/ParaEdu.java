/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paraeduApp;

import Entidad.CuentaBancaria_Entid;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class ParaEdu {

    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicio cc = new CuentaBancariaServicio();
        CuentaBancaria_Entid c1 = cc.crearCuenta();

            String confirma = "N";
            int opcion;
        do {
            System.out.println("MENU\n 1.Crear Cuenta\n 2.Deposito\n 3.Extraccion\n 4.Extraccion Rapida\n 5.Consultar Saldo\n 6.Consultar Informacion de Cliente\n 7.Salir");
            System.out.println("Ingrese la Opcion:");
            opcion = leer.nextInt();
            
            
            
            
            switch (opcion) {
                case 1:
                    System.out.println("Creamos Cuenta");
                    System.out.println(c1);
                    break;
                case 2:
                    System.out.println(c1);
                    cc.IngresoDinero(c1);
                    break;
                case 3:
                    System.out.println(c1);
                    cc.RetirarDinero(c1);
                    break;
                case 4:
                    cc.ExtraccionRapida(c1);
                    break;
                case 5:
                    cc.ConsultaSaldo(c1);
                    break;
                case 6:
                    //Asi muestra los datos de la cuenta actualizados
                    System.out.println(c1.toString());
                    break;
                case 7:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirma = leer.next();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;    
            }
        } while (!confirma.equalsIgnoreCase("S"));
        System.out.println("Oky ...");

    }

}


