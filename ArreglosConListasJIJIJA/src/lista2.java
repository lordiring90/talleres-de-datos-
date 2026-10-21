public class lista2 {
    public static Nodo reverseList(Nodo cabeza) {
        // 1. usamos 3 punteros: prev en null, actual en cabeza y sig en null
        Nodo prev = null;
        Nodo actual = cabeza;
        Nodo sig = null;

        // recorremos la lista mientras el nodo actual no sea null
        while (actual != null) {
            // 2. guardamos el siguiente nodo para no perder el resto de la lista
            sig = actual.siguiente;

            // 3. invertimos la flecha haciendo que apunte al nodo anterior
            actual.siguiente = prev;

            // 4. avanzamos los punteros prev y actual un paso hacia adelante
            prev = actual;
            actual = sig;
        }

        // prev queda apuntando al ultimo nodo original, que ahora es la nueva cabeza
        return prev;
    }

    // funcion auxiliar para imprimir la lista en consola
    public static void imprimirLista(Nodo cabeza) {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // creamos manualmente una lista: 10 -> 20 -> 30 -> 40 -> null
        Nodo cabeza = new Nodo(10);
        cabeza.siguiente = new Nodo(20);
        cabeza.siguiente.siguiente = new Nodo(30);
        cabeza.siguiente.siguiente.siguiente = new Nodo(40);

        System.out.println("--- PRUEBA EJERCICIO 2: INVERTIR LISTA ---");

        System.out.print("Lista original:  ");
        imprimirLista(cabeza);

        cabeza = reverseList(cabeza);

        System.out.print("Lista invertida: ");
        imprimirLista(cabeza);
    }
}