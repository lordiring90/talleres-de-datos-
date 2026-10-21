public class Lista4 {

    public static Nodo deleteDuplicates(Nodo cabeza) {
        // 1. iniciamos el puntero actual en la cabeza de la lista
        Nodo actual = cabeza;

        // recorremos la lista verificando actual y que el siguiente no sea null
        while (actual != null && actual.siguiente != null) {
            // 2. si el dato actual es igual al siguiente, lo saltamos apuntando dos posiciones adelante
            if (actual.dato == actual.siguiente.dato) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                // 3. si no son iguales, avanzamos al siguiente nodo normalmente
                actual = actual.siguiente;
            }
        }

        return cabeza;
    }

    // funcion auxiliar para imprimir la lista
    public static void imprimirLista(Nodo cabeza) {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // creamos una lista ordenada con duplicados: 1 -> 1 -> 2 -> 3 -> 3 -> null
        Nodo cabeza = new Nodo(1);
        cabeza.siguiente = new Nodo(1);
        cabeza.siguiente.siguiente = new Nodo(2);
        cabeza.siguiente.siguiente.siguiente = new Nodo(3);
        cabeza.siguiente.siguiente.siguiente.siguiente = new Nodo(3);

        System.out.println("--- PRUEBA EJERCICIO 4: ELIMINAR DUPLICADOS ---");
        System.out.print("Lista original con duplicados: ");
        imprimirLista(cabeza);

        cabeza = deleteDuplicates(cabeza);

        System.out.print("Lista limpia sin duplicados:    ");
        imprimirLista(cabeza);
    }
}