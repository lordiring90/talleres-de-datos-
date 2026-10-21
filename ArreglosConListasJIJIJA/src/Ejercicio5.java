public class Ejercicio5 {
    public static int encontrarFaltante(int[] arreglo) {
        // N representa el total de numeros que deberia haber (tamaño del arreglo + 1)
        int n = arreglo.length + 1;

        // 1. calculamos la suma ideal de 1 a N usando la formula N * (N + 1) / 2
        int sumaIdeal = n * (n + 1) / 2;

        // 2. sumamos los elementos que realmente tenemos en el arreglo
        int sumaReal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaReal += arreglo[i];
        }

        // 3. la resta de la suma ideal menos la suma real nos da el numero faltante
        return sumaIdeal - sumaReal;
    }

    // aqui probamos encontrando el numero que falta
    public static void main(String[] args) {

        // de 1 a 5 falta el 3
        int[] numeros1 = {1, 2, 4, 5};
        System.out.println(encontrarFaltante(numeros1)); // 3

        // de 1 a 6 falta el 5
        int[] numeros2 = {1, 2, 3, 4, 6};
        System.out.println(encontrarFaltante(numeros2)); // 5
    }
}