/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import electrodomestico.entidades.Electrodomestico;
import java.util.Scanner;


public class ElectrodomesticoService {

        /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            letra=letra;
        } else {
            letra='F';
        }
    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public void comprobarColor(String color) {
        String[] coloresDisp = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean validacion = false;
        for (String colorD : coloresDisp) {
            if (color.equalsIgnoreCase(colorD)) {
                color=color;
                validacion = true;
                break;
            }
        }
        if (!validacion) {
            color="blanco";
        }
    }

    /*
     Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Double precio= 1000d;
        System.out.println("Ingrese el color");
        String color = leer.next().toLowerCase();
        comprobarColor(color);
        System.out.println(color);
        System.out.println("Ingrese el consumo energetico (A,B,C,D,E o F)");
        char letra = leer.next().toUpperCase().charAt(0);
        System.out.println(letra);
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso");
        int peso = leer.nextInt();
        return new Electrodomestico(precio, color, letra, peso);
    }

    /*
     Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:
    LETRA PRECIO        PESO PRECIO
    A $1000         Entre 1 y 19 kg $100
    B $800          
    C $600          Entre 20 y 49 kg $500
    D $500          Entre 50 y 79 kg $800
    E $300          Mayor que 80 kg $1000
    F $100
     */
    public Double precioFinal(Electrodomestico elec) {

        Double preFinal = elec.getPrecio();
        switch (elec.getConsumoEnergetico()) {
            case 'A':
                preFinal += 1000;
                break;
            case 'B':
                preFinal += 800;
                break;
            case 'C':
                preFinal += 600;
                break;
            case 'D':
                preFinal += 500;
                break;
            case 'E':
                preFinal += 300;
                break;
            case 'F':
                preFinal += 100;
                break;
        }
        
        if (elec.getPeso() >= 1 && elec.getPeso() <= 19) {
            preFinal += 100;
        } else if (elec.getPeso() >= 20 && elec.getPeso() <= 49) {
            preFinal += 500;
        } else if (elec.getPeso() >= 50 && elec.getPeso() <= 79) {
            preFinal += 800;
        } else if (elec.getPeso() > 80) {
            preFinal += 1000;
        }
        elec.setPrecio(preFinal);
        return elec.getPrecio();
    }
    public void mostrar(Electrodomestico elec){
        System.out.println(elec.toString());
    }
    
}
