/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package electrodomestico.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private  Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor" + " con resolucion de " + resolucion + "' \nsintonizadorTDT: " + sintonizadorTDT +" \nColor: "+ super.getColor()+" \nConsumo energetico Tipo :"+ super.getConsumoEnergetico()+" \nPeso:"+ super.getPeso()+"kg";
    }
    
}
//    public void crearTelevisor() {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        crearElectrodomestico();
//        System.out.println("Ingrese la resolucion en pulgadas");
//        this.resolucion = leer.nextInt();
//        System.out.println("¿Tiene sintonizador TDA? s/n");
//        String opc = leer.next();
//        if (opc.equalsIgnoreCase("s")) {
//            this.sintonizadorTDT = true;
//        } else {
//            this.sintonizadorTDT = false;
//        }
//    }
//
//    /*
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
//Finalmente, en el main debemos realizar lo siguiente:
//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos.
//     */
//    @Override
//    public Double precioFinal() {
//        double preFinal = super.precioFinal();
//        System.out.println(preFinal);
//        if (resolucion > 40 && sintonizadorTDT) {
//            preFinal = (preFinal * 1.3) + 500;
//        } else if (sintonizadorTDT && resolucion <= 40) {
//            preFinal += 500;
//        } else if (resolucion > 40) {
//            preFinal *= 1.3;
//        }
//        System.out.println(preFinal);
//        return preFinal;
//
//    }

