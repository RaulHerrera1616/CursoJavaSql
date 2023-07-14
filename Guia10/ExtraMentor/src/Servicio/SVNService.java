/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Servicio;

import Entidades.SVN;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SVNService {
    private Scanner leer = new Scanner(System.in);
    private List<Integer> numeros = new ArrayList();
    
    public SVN insertarNumeros(){
        int numero;
        do {
            System.out.println("ingrese numeros enteros");
            numero=leer.nextInt();
            if (numero!=-99) {
                numeros.add(numero);
            }
        } while (numero!=-99);
        for (Integer numero1 : numeros) {
            System.out.println(numero1);
        }
        return new SVN(numero);       
    }
    public int numeroValores(){
        return numeros.size();
    }
    public int sumaValores(){
        int suma=0;
        for (Integer numero : numeros) {
            suma+=numero;
        }
        return suma;
    }
    public double numeroMedia(){
        return sumaValores()*1.0/numeroValores()*1.0;
    }
}
