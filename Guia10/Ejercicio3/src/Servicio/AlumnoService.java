/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class AlumnoService {

     Scanner leer = new Scanner(System.in);
     ArrayList<Alumno> listaAlumnos = new ArrayList();

    public void crearAlumno() {

        String opcion;
        String nombre;

        do {
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                notas.add(leer.nextInt());
            }
            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);
            System.out.println("Desea crear otro alumno s/n");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("s"));

        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno.getNombre() + " - " + listaAlumno.getNotas());
        }
    }

    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */
    public void notaFinal(String alumno) {
        double notaFinal = 0.0;
        double sumaNotas = 0;
        boolean encontrado = false;
        for (Alumno alumno1 : listaAlumnos) {

            if (alumno1.getNombre().equalsIgnoreCase(alumno)) {
                ArrayList<Integer> notas = alumno1.getNotas();
                for (Integer nota : notas) {
                    sumaNotas += nota;
                }
                notaFinal = sumaNotas / 3;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("el alumno ingresado no se encuentra en la lista");

        } else {
            System.out.println(sumaNotas);
        }

    }

}


