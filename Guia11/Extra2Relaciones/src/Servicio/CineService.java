/*
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Servicio;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Random;

public class CineService {

    Random ran = new Random();

    public void crearPelicula(Cine ci) {
        ci.setPeliculaActual(new Pelicula("Pelicula 1", (90 + ran.nextInt(241)), (1 + ran.nextInt(18)), "Director A"));
    }

    public void crearSalaVacia(Cine ci) {
        String[] vector = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                ci.getSala().getButaca()[i][j] = new Asiento(8 - i, vector[j], null);
                System.out.print(ci.getSala().getButaca()[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public void llenarSalaDeCine(Cine ci) {
        ArrayList<Espectador> espectadores = new ArrayList<>();
        boolean validacion;
        int c = 1;
        for (int i = 0; i < 30; i++) {

            String nombre = "Espectador " + (i + 1);
            int edad = 10 + ran.nextInt(30);
            double dineroDisp = 100 + ran.nextInt(1000);
            Espectador persona = new Espectador(nombre, edad, dineroDisp);
            espectadores.add(persona);
        }

        ci.setPrecioEntrada(150 + ran.nextInt(500));
        for (int i = 0; i < espectadores.size(); i++) {
            validacion = false;
            System.out.println(espectadores.get(i));
            System.out.println(espectadores.get(i).getEdad() + " - " + ci.getPeliculaActual().getEdadMinima());
            if (espectadores.get(i).getDineroDisp() >= ci.getPrecioEntrada()) {
                if (espectadores.get(i).getEdad() >= ci.getPeliculaActual().getEdadMinima()) {
                    do {
                        int fila = ran.nextInt(8);
                        int columna = ran.nextInt(6);
                        if (ci.getSala().getButaca()[fila][columna].getPersona() == null) {
                            ci.getSala().getButaca()[fila][columna].setPersona(new Espectador(espectadores.get(i).getNombre(), espectadores.get(i).getEdad(), espectadores.get(i).getDineroDisp()));
                            System.out.println("Tu butaca es: " + ci.getSala().getButaca()[fila][columna].getNumero() + ci.getSala().getButaca()[fila][columna].getLetra() + " " + ci.getSala().getButaca()[fila][columna].getPersona());
                            validacion = true;
                            ci.setEspectadoresEnSala(c++);

                        }
                    } while (!validacion);
                    
                }
            }
        }
        System.out.println("La sala esta reproduciendo: "+ci.getPeliculaActual().toString());
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Mostrar sala");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (ci.getSala().getButaca()[i][j].getPersona() == null) {
                    System.out.print(ci.getSala().getButaca()[i][j].getNumero() + ci.getSala().getButaca()[i][j].getLetra() + "  |");
                } else {
                    System.out.print(ci.getSala().getButaca()[i][j].getNumero() + ci.getSala().getButaca()[i][j].getLetra() + " X|");
                }
            }
            System.out.println("");
        }
        double suma=ci.getEspectadoresEnSala()*ci.getPrecioEntrada();
        ci.setEspectadoresNoPermitidos(30-ci.getEspectadoresEnSala());
        System.out.println("PRECIO DE LA ENTRADA:"+ci.getPrecioEntrada() + "$");
        System.out.println("Espectadores en sala: " + ci.getEspectadoresEnSala());
        System.out.println("Espectadores que no entraron a la sala: " + ci.getEspectadoresNoPermitidos());
        System.out.println("La recaudacion en la sa fue de: "+suma+"$");
  

    }

}
//    public void CrearCine(char[][] sala, Pelicula peliculaActual) {
//
//        for (int i = ci.getFilas() - 1; i >= 0; i--) {
//            for (int j = 0; j < ci.getColumnas(); j++) {
//                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
//            }
//            System.out.println("");
//        }
//        
//        System.out.println("-------------------------");
//        System.out.println("Espectadores en sala: " + ci.getEspectadoresEnSala());
//        System.out.println("Espectadores no permitidos: " + ci.getEspectadoresNoPermitidos());
//
//        
//    }
//
//    public void agregarEspectadores(char[][] sala, Pelicula peliculaActual,ArrayList<Espectador> espectadores) {
//        
//        double entrada=150;
//        ci.setPrecioEntrada(entrada);
//        ci.setPeliculaActual(peliculaActual);
//        for (int i = 0; i < 30; i++) {
//            boolean bandera = false;
//            String nombre = "Espectador " + i;
//            int edad = 10 + ran.nextInt(30);
//            double dineroDisp = 100 + ran.nextInt(1000);
//            Espectador espectador = new Espectador(nombre, edad, dineroDisp);
//            System.out.println(dineroDisp+" "+ci.getPrecioEntrada());
//            System.out.println(edad+" "+ci.getPeliculaActual().getEdadMinima());
//            if (dineroDisp>=ci.getPrecioEntrada()) {
//                if (edad>=ci.getPeliculaActual().getEdadMinima()) {
//                    
//                    do {
//                        int fila = ran.nextInt(8);
//                        int columna = ran.nextInt(6);
//                        System.out.println(ci.getSala()[fila][columna]);
//                        if (ci.getSala()[fila][columna]==' ') {                          
//                            ci.setSala(espectador.getNombre());
//                            System.out.print((fila + 1) + " " + (char) ('A' + columna) + " " + ci.getSala()[fila][columna] + " | ");
//                            bandera = true;
//                        }
//                        
//                    } while (!bandera);
//                }
//            }
//            
////            espectadores.add(espectador);
//        }
//        
//            
//        }
//        public void tablaFinal(Cine cine,char[][] sala) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (ci.getSala()[i][j] == ' ') {
//                    System.out.print((i + 1) + " " + (char) ('A' + j) + " " + ci.getSala()[i][j] + " | ");
//                } else {
//                    System.out.print((i + 1) + " " + (char) ('A' + j) + " " + ci.getSala()[i][j] + " | ");
//                }
//            }
//            System.out.println("");
//        }
//    }

/*
    public void ubicarEspecadores(Cine cine) {
        boolean bandera;
        int c = 0;
        for (int i = 0; i < 20; i++) {
            bandera = false;
            String nombre = "Espectador " + Integer.toString(i);
            int edad = (int) ((Math.random() * 60) + 10);
            float dinero = (float) (Math.random() * 300) + 100;
            if (dinero >= cine.getEntrada()) {
                if (edad >= cine.getPelicula().getEdadMinima()) {
                    do {
                        int fila = (int) (Math.random() * 8);
                        int columna = (int) (Math.random() * 6);
                        if (cine.getSala().getMatriz()[fila][columna].getPersona() == null) {
                            cine.getSala().getMatriz()[fila][columna].setPersona(new Espectador(nombre, edad, dinero));
                            bandera = true;
                            System.out.println(c++);
                        }
                    } while (!bandera);
                }
            }
        }
    }
 */
