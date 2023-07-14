
package extra2relacionesApp;

import Entidades.Cine;
import Entidades.Pelicula;
import Entidades.Sala;
import Servicio.CineService;
import java.util.Scanner;

public class Extra2Relaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sa;
        do {
                    System.out.println("::::::::::::Peliculas en salas::::::::::::");
        System.out.println("*-Sala 1: SPIDERMAN LEJOS DE CASA"
                + "\n*-Sala 2: MARIO BROS"
                + "\n*-Sala 3: EL EXORSISTA DEL PAPA"
                + "\n*-Sala 4: EL DILEMA"
                +  "\n*-5: Salir");
        System.out.println("Elija el numero de sala que desea entrar");
        sa = leer.nextInt();
        switch (sa) {
            case 1:
                CineService sv1 = new CineService();
                Pelicula pelicula1 = new Pelicula("SPIDERMAN LEJOS DE CASA", 130, 13, "Jon Watts");
                Sala sala1 = new Sala();
                Cine cine1 = new Cine(sala1, pelicula1, 0, 0, 0);
                sv1.crearSalaVacia(cine1);
                sv1.llenarSalaDeCine(cine1);
                break;
            case 2:
                CineService sv2 = new CineService();
                Pelicula pelicula2 = new Pelicula("SUPER MARIO BROS", 92, 7, "Aaron Horvath, Michael Jelenic");
                Sala sala2 = new Sala();
                Cine cine2 = new Cine(sala2, pelicula2, 0, 0, 0);
                sv2.crearSalaVacia(cine2);
                sv2.llenarSalaDeCine(cine2);
                break;
            case 3:
                CineService sv3 = new CineService();
                Pelicula pelicula3 = new Pelicula("EL EXORCISTA DEL PAPA", 103, 15, "Julius Avery");
                Sala sala3 = new Sala();
                Cine cine3 = new Cine(sala3, pelicula3, 0, 0, 0);
                sv3.crearSalaVacia(cine3);
                sv3.llenarSalaDeCine(cine3);
                break;
            case 4:
                CineService sv4 = new CineService();
                Pelicula pelicula4 = new Pelicula("EL DILEMA", 118, 13, "Ron Howard");
                Sala sala4 = new Sala();
                Cine cine4 = new Cine(sala4, pelicula4, 0, 0, 0);
                sv4.crearSalaVacia(cine4);
                sv4.llenarSalaDeCine(cine4);
                break;
            case 5:
                System.out.println("::::::::::::::::Gracias por elegir nuestro Cine::::::::::::::::");
                break;
                
        }
        } while (sa<5);

    }

}
