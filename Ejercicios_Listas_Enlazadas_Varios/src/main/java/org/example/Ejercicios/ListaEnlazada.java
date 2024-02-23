package org.example.Ejercicios;



 public class ListaEnlazada {


     public static class Nodo {
            public int dato;
            public Nodo siguiente;

            public Nodo(int dato) {
                this.dato = dato;
                this.siguiente = null;
            }
        }
        Nodo cabeza;
        public Nodo cola;

        public void InsertarAlInicio(int dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            if (cola == null) {
                cola = nuevo;
            }
        }

        public void InsertarAlFinal(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (cola != null) {
                cola.siguiente = nuevo;
            }
            cola = nuevo;
            if (cabeza == null) {
                cabeza = nuevo;
            }
        }

        public void EliminarAlInicio() {
            if (cabeza != null) {
                cabeza = cabeza.siguiente;
                if (cabeza == null) {
                    cola = null;
                }
            }
        }

        public void EliminarAlFinal() {
            if (cola != null) {
                Nodo actual = cabeza;
                Nodo anterior = null;
                while (actual.siguiente != null) {
                    anterior = actual;
                    actual = actual.siguiente;
                }
                if (anterior != null) {
                    anterior.siguiente = null;

                } else {
                    cabeza = null;
                }
                cola = anterior;
            }
        }

        public int Buscar(int dato) {
            int posicion = 0;
            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.dato == dato) {
                    return posicion;
                }
                posicion++;
                actual = actual.siguiente;
            }
            return -1;
        }

        public void ImprimirLista() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.println((actual.dato + ""));
                actual = actual.siguiente;
            }
            System.out.println();
        }

        //invertiendo la Lista Enlazada.
        public void InvertirLista(){
            Nodo actual = cabeza;
            Nodo anterior = null;
            Nodo siguiente;
            while(actual != null){
                siguiente = actual.siguiente;
                actual.siguiente = anterior;
                anterior= actual;
                actual = siguiente;
            }
            cabeza = anterior;
        }

        //Detectando un ciclo en una Lista Enlazada.
        public boolean DetectarCiclo(){
            Nodo lento = cabeza;
            Nodo rapido = cabeza;
            while (rapido != null && rapido.siguiente != null){
                lento = lento.siguiente;
                rapido = rapido.siguiente.siguiente;
                if(lento == rapido){
                    return true;
                }
            }
            return false;
        }

        //Eliminar Nodo en una Lista Enlazada con un solo puntero.
        public void EliminarNodo(Nodo nodo){
            if ( nodo == cabeza){
                cabeza = cabeza.siguiente;
                return;
            }
            Nodo actual = cabeza;
            while (actual.siguiente != nodo){
                actual = actual.siguiente;
            }
            actual.siguiente = nodo.siguiente;
            if ( nodo == cola){
                cola = actual;
            }
        }

        //Encontrar la interseccion de dos listas enlazadas
        public Nodo EncontrarInterseccion(ListaEnlazada lista2){
            Nodo actual1 = cabeza;
            Nodo actual2 = lista2.cabeza;
            while (actual1 != null && actual2 != null){
                if (actual1 == actual2){
                    return actual1;
                }
                actual1 = actual1.siguiente;
                actual2 = actual2.siguiente;
           }
           return null;
        }

    }

