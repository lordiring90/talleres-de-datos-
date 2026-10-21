public class lista3 {

    public static Nodo getNthFromEnd(Nodo cabeza, int n) {
        // 1. usamos dos punteros: rapido y lento iniciando en cabeza
        Nodo rapido = cabeza;
        Nodo lento = cabeza;

        // 2. avanzamos el puntero rapido N pasos primero
        for (int i = 0; i < n; i++) {
            if (rapido == null) return null; // si N es mayor que la lista
            rapido = rapido.siguiente;
        }

        // 3. movemos ambos 1 paso a la vez hasta que rapido sea null
        while (rapido != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente;
        }

        // lento es la respuesta
        return lento;
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
        // creamos una lista de prueba: 10 -> 20 -> 30 -> 40 -> 50 -> null
        Nodo cabeza = new Nodo(10);
        cabeza.siguiente = new Nodo(20);
        cabeza.siguiente.siguiente = new Nodo(30);
        cabeza.siguiente.siguiente.siguiente = new Nodo(40);
        cabeza.siguiente.siguiente.siguiente.siguiente = new Nodo(50);

        System.out.println("--- PRUEBA EJERCICIO 3: N-ÉSIMO NODO DESDE EL FINAL ---");
        System.out.print("Lista original: ");
        imprimirLista(cabeza);

        // probamos buscar el nodo 2 desde el final (el penúltimo)
        int n1 = 2;
        Nodo res1 = getNthFromEnd(cabeza, n1);
        if (res1 != null) {
            System.out.println("El nodo " + n1 + "º desde el final es: " + res1.dato); // 40
        }

        // probamos buscar el nodo 4 desde el final
        int n2 = 4;
        Nodo res2 = getNthFromEnd(cabeza, n2);
        if (res2 != null) {
            System.out.println("El nodo " + n2 + "º desde el final es: " + res2.dato); // 20
        }
    }
}