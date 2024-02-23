package org.example;
import org.example.Ejercicios.ListaEnlazada;
import org.example.Ejercicios.ListaEnlazada.Nodo;


public class Main {
    public static void main(String[] args) {
       ListaEnlazada lista = new ListaEnlazada();
       //Insertando nodos al incio y final de la lista
       lista.InsertarAlInicio(10);
       lista.InsertarAlInicio(20);
       lista.InsertarAlFinal(30);
       lista.InsertarAlFinal(40);


        //Imprimiendo la Lista.
        System.out.println("Lista enlazada: ");
        lista.ImprimirLista();

        //Buscar nodo por su valor
        int posicion = lista.Buscar(20);
        System.out.println(("la Posicion del nodo con valor 20 es: " + posicion));

        //Eliminar un nodo al inicio y al final
        lista.EliminarAlInicio();
        lista.EliminarAlFinal();

        //Imprimir la lista despues de las eliminaciones realizadas
        System.out.println(("Lista despues de eliminar el primer y ultimo nodo: "));
        lista.ImprimirLista();

        // Invertir la lista
        lista.InvertirLista();

        // Imprimir la lista después de invertirla
        System.out.println("Lista después de invertirla:");
        lista.ImprimirLista();

        // Detectar un ciclo en la lista (en este caso, no hay ciclo)
        boolean hayCiclo = lista.DetectarCiclo();
        System.out.println("¿Hay un ciclo en la lista? " + hayCiclo);

        //Crear un nuevo nodo para la interseccion de dos listas.
        Nodo interseccion = new Nodo(30);

        //Agregar el nodo de la interseccion al final de la lista actual
        lista.cola.siguiente = interseccion;

        //Crear una nueva lista enlazada
        ListaEnlazada lista2 = new ListaEnlazada();
        lista2.InsertarAlInicio(41);
        lista2.InsertarAlFinal(42);
        lista2.cola.siguiente = interseccion;

        //Encontrar la interseccion de las dos listas
        Nodo nodoInterseccion = lista.EncontrarInterseccion(lista2);

        //Imprimir el nodo de la interseccion
        if (nodoInterseccion != null){
            System.out.println("El nodo de la intersección es: " + nodoInterseccion.dato);

        }else {
            System.out.println("No hay intersección entre las dos listas.");
        }


    }
}