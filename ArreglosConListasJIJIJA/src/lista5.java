public class lista5 {

    public static boolean hasCycle(Nodo cabeza) {
        // si la lista esta vacia o solo tiene un nodo, no puede tener bucle
        if (cabeza == null || cabeza.siguiente == null) {
            return false;
        }

        // iniciamos ambos punteros (lento y rapido) en la cabeza
        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        // recorremos mientras el puntero rapido no llegue al final de la lista
        while (rapido != null && rapido.siguiente != null) {
            // 1. lento avanza 1 paso
            lento = lento.siguiente;

            // 2. rapido avanza 2 pasos
            rapido = rapido.siguiente.siguiente;

            // 3. si en algun momento coinciden (lento == rapido), hay un bucle
            if (lento == rapido) {
                return true;
            }
        }

        // si rapido llega a null, la lista termina y por tanto no tiene bucle
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA EJERCICIO 5: DETECTAR BUCLE (LIEBRE Y TORTUGA) ---");

        // Caso 1: Lista normal sin bucle (10 -> 20 -> 30 -> null)
        Nodo cabeza1 = new Nodo(10);
        cabeza1.siguiente = new Nodo(20);
        cabeza1.siguiente.siguiente = new Nodo(30);

        System.out.println("¿La lista 1 (normal) tiene bucle?: " + hasCycle(cabeza1)); // false

        // Caso 2: Lista infinita con bucle (10 -> 20 -> 30 -> vuelve a 20)
        Nodo cabeza2 = new Nodo(10);
        Nodo nodo20 = new Nodo(20);
        Nodo nodo30 = new Nodo(30);

        cabeza2.siguiente = nodo20;
        nodo20.siguiente = nodo30;
        nodo30.siguiente = nodo20; // aqui creamos la trampa/ciclo

        System.out.println("¿La lista 2 (con ciclo) tiene bucle?: " + hasCycle(cabeza2)); // true
    }
}