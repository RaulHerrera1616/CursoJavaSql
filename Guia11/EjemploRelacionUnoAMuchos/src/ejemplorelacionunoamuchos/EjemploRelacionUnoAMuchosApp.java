/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package ejemplorelacionunoamuchos;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;

public class EjemploRelacionUnoAMuchosApp {

    public static void main(String[] args) {
        
        Equipo equip = new Equipo();
        
        equip.setNombreEquipo("Los Pumas");
        List<Jugador> listaJugadors = new ArrayList<>();
        
        Jugador jug1 = new Jugador();
        Jugador jug2 = new Jugador();
        Jugador jug3 = new Jugador();

        jug1.setNombre("Malena");
        jug1.setApellido("Zerrizuela");
        jug1.setPosicion(3);
        jug1.setNumero(35);
        
        jug2.setNombre("Julio");
        jug2.setApellido("Villa");
        jug2.setPosicion(2);
        jug2.setNumero(22);
        
        jug3.setNombre("Antonela");
        jug3.setApellido("Martinez");
        jug3.setPosicion(1);
        jug3.setNumero(65);
        
        listaJugadors.add(jug1);
        listaJugadors.add(jug2);
        listaJugadors.add(jug3);
        
        equip.setListaDeJugadores(listaJugadors);
        
        System.out.println("El equipo: " + equip.getNombreEquipo() + 
                "\n contiene como jugadores a: \n " + equip.getListaDeJugadores().toString());
        

    }

}
