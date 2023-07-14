/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package extramentorApp;

import Entidades.SVN;
import Servicio.SVNService;


public class ExtraMentor {

    public static void main(String[] args) {
        SVNService ser = new SVNService();
        SVN n= ser.insertarNumeros();
        
        System.out.println("*------Numero de valores------*");
        System.out.println(ser.numeroValores());
        System.out.println("*------Suma de valores------*");
        System.out.println(ser.sumaValores());
        System.out.println("*------Promedio de valores------*");
        System.out.println(ser.numeroMedia());
        
    }
    
}
