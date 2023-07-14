package ejemplometodosclasecolections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjemploMetodosClaseColections {

    public static void main(String[] args) {
        //METODO fill(List<T> lista, Objeto objeto)
        //En este ejemplo, se crea una lista de cadenas que contiene los valores "a", "b" y "c"
        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c"));
        //Se crea un objeto de tipo cadena con el valor "d"
        String objeto = "d";
        //se llama a la función fill de la clase Collections para reemplazar todos los elementos 
        //de la lista con el objeto "d". Después de la llamada a fill, la lista contendrá los 
        //valores "d", "d" y "d".
        Collections.fill(lista, objeto);

        //----------------------------------------------------------------------------------------------------------
        //METODO frequency(Collection<T> coleccion, Objeto objeto) 
        //se crea una lista de cadenas que contiene los valores "a", "b", "c", "a", "b"
        List<String> li = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b"));
        //Se crea un objeto de tipo cadena con el valor "a"
        String obj = "a";
        //Se llama al método frequency de la clase Collections para obtener la frecuencia con la
        //que el objeto "a" aparece en la lista
        int frecuencia = Collections.frequency(li, obj);
        //Después de la llamada a frequency, el valor de la variable frecuencia será 2, lo que 
        //significa que el objeto "a" aparece dos veces en la lista. El resultado se imprime en la consola.
        System.out.println("La frecuencia de " + obj + " es " + frecuencia);

        //----------------------------------------------------------------------------------------------------------
        //METODO replaceAll(List<T> lista, T valorViejo, T valorNuevo)
        //Se crea una lista de cadenas que contiene los valores "a", "b", "c", "a"
        List<String> lis = new ArrayList<>(Arrays.asList("a", "b", "c", "a"));
        //se crea un valor antiguo de tipo cadena con el valor "a" y un valor nuevo de tipo cadena con el 
        //valor "d"
        String valorViejo = "a";
        String valorNuevo = "d";
        //se llama al método replaceAll de la clase Collections para reemplazar todas las apariciones del
        //valor antiguo "a" por el valor nuevo "d"
        Collections.replaceAll(lis, valorViejo, valorNuevo);
        //El resultado se imprime en la consola.
        System.out.println(lis);

        //----------------------------------------------------------------------------------------------------------
        //METODO reverse(List<T> lista) (si la lista contiene los elementos "a", "b", "c", "d" y se llama 
        //al método reverse, la lista se modificará para contener "d", "c", "b", "a".)
        //Se crea una lista de cadenas que contiene los valores "a", "b", "c", "d"
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        //se llama al método reverse de la clase Collections para invertir el orden de los elementos en la lista
        Collections.reverse(list);
        //El resultado se imprime en la consola.
        System.out.println(list);

        //----------------------------------------------------------------------------------------------------------
        //METODO reverseOrder() (El método "reverseOrder()" es útil en situaciones donde se necesita ordenar una 
        //colección en orden inverso al orden natural de los elementos)
        //Se crea una lista de enteros que contiene los valores 3, 1, 4, 2
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(3, 1, 4, 2));
        //se llama al método "sort" de la clase Collections y se pasa la lista y el comparador devuelto por el 
        //método "reverseOrder"
        Collections.sort(lista1, Collections.reverseOrder());
        //Se muestra la lista inversa
        System.out.println(lista1);

        //----------------------------------------------------------------------------------------------------------
        //METODO shuffle(List<T> lista)
        //Se crea una lista de cadenas que contiene los valores 
        ArrayList<String> lista2 = new ArrayList<String>();
        lista2.add("elemento1");
        lista2.add("elemento2");
        lista2.add("elemento3");
        lista2.add("elemento4");
        lista2.add("elemento5");

        System.out.println("Lista original: " + lista2);
        //la permuta aleatoriamente utilizando el método shuffle
        Collections.shuffle(lista2);

        System.out.println("Lista permutada aleatoriamente: " + lista2);

        //----------------------------------------------------------------------------------------------------------
        //METODO sort(List<T> lista) (orden ascendente)
        //Se crea una lista de enteros que contiene los valores 5,3,7,1,9
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        lista3.add(5);
        lista3.add(3);
        lista3.add(7);
        lista3.add(1);
        lista3.add(9);
        //Se muestra la lista original
        System.out.println("Lista original: " + lista3);
        //La ordena en orden ascendente utilizando el método sort
        Collections.sort(lista3);
        //Se muestra la lista en orden ascendente
        System.out.println("Lista ordenada en orden ascendente: " + lista3);
    }

}
