class Nodo {
    int dato;
    Nodo siguiente;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Lista1 {

    public static Nodo insertAtEnd(Nodo cabeza, int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        // 1. si cabeza == null, el nuevo nodo pasa a ser la cabeza
        if (cabeza == null) {
            return nuevoNodo;
        }

        // 2. si no, creamos actual = cabeza y recorremos hasta el ultimo nodo (donde siguiente es null)
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        // 3. asignamos el nuevo nodo al final de la lista
        actual.siguiente = nuevoNodo;
        return cabeza;
    }

    // funcion auxiliar para mostrar la lista de forma visual (ej: 10 -> 20 -> null)
    public static void imprimirLista(Nodo cabeza) {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // probamos agregando nodos y mostrando etiquetas explicativas en consola
    public static void main(String[] args) {
        Nodo cabeza = null;

        System.out.println("--- PRUEBA EJERCICIO 1: INSERTAR AL FINAL ---");

        cabeza = insertAtEnd(cabeza, 10);
        System.out.print("Lista tras insertar 10: ");
        imprimirLista(cabeza);

        cabeza = insertAtEnd(cabeza, 20);
        System.out.print("Lista tras insertar 20: ");
        imprimirLista(cabeza);

        cabeza = insertAtEnd(cabeza, 30);
        System.out.print("Lista tras insertar 30: ");
        imprimirLista(cabeza);
    }
}