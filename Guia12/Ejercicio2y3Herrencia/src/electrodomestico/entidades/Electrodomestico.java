/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package electrodomestico.entidades;

import java.util.Scanner;

public class Electrodomestico {

    private Double precio;
    private String color;
    private char consumoEnergetico;
    private Integer peso;

    public Electrodomestico() {
        
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
//    /*
//    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//    objeto y no será visible.
//     */
//    public void comprobarConsumoEnergetico(char letra) {
//        if (letra >= 'A' && letra <= 'F') {
//            this.consumoEnergetico = letra;
//        } else {
//            this.consumoEnergetico = 'F';
//        }
//    }
//
//    /*
//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//    minúsculas. Este método se invocará al crear el objeto y no será visible.
//     */
//    public void comprobarColor(String color) {
//        String[] coloresDisp = {"blanco", "negro", "rojo", "azul", "gris"};
//        boolean validacion = false;
//        for (String colorD : coloresDisp) {
//            if (color.equalsIgnoreCase(colorD)) {
//                this.color = colorD;
//                validacion = true;
//                break;
//            }
//        }
//        if (!validacion) {
//            this.color = "blanco";
//        }
//    }
//
//    /*
//     Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//    precio se le da un valor base de $1000.
//     */
//    public void crearElectrodomestico() {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese el precio");
//        this.precio = leer.nextDouble();
//        System.out.println("Ingrese el color");
//        this.color = leer.next();
//        System.out.println("Ingrese el consumo energetico (A,B,C,D,E o F)");
//        String consumo = leer.next();
//        this.consumoEnergetico = consumo.charAt(0);
//        System.out.println("Ingrese el peso");
//        this.peso = leer.nextInt();
//    }
//
//    /*
//     Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//    precio. Esta es la lista de precios:
//    LETRA PRECIO        PESO PRECIO
//    A $1000         Entre 1 y 19 kg $100
//    B $800          
//    C $600          Entre 20 y 49 kg $500
//    D $500          Entre 50 y 79 kg $800
//    E $300          Mayor que 80 kg $1000
//    F $100
//     */
//    public Double precioFinal() {
//        Double preFinal = precio;
//        switch (consumoEnergetico) {
//            case 'A':
//                preFinal += 1000;
//                break;
//            case 'B':
//                preFinal += 800;
//                break;
//            case 'C':
//                preFinal += 600;
//                break;
//            case 'D':
//                preFinal += 500;
//                break;
//            case 'E':
//                preFinal += 300;
//                break;
//            case 'F':
//                preFinal += 100;
//                break;
//        }
//        if (peso >= 1 && peso <= 19) {
//            preFinal += 100;
//        } else if (peso >= 20 && peso <= 49) {
//            preFinal += 500;
//        } else if (peso >= 50 && peso <= 79) {
//            preFinal += 800;
//        } else if (peso > 80) {
//            preFinal += 1000;
//        }
//        return preFinal;
//    }

