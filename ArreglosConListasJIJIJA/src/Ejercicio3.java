import java.util.Arrays;

public class Ejercicio3 {
    public static void reverse(int[] arreglo) {
        // ponemos un puntero al inicio (posicion 0) y otro al final (length - 1)
        int inicio = 0;
        int fin = arreglo.length - 1;

        // recorremos mientras inicio no se cruce o sea igual a fin
        while (inicio < fin) {
            // guardamos el valor en temp para hacer el intercambio sin perder el dato
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;

            // movemos inicio hacia adelante y fin hacia atras para acercarnos al centro
            inicio++;
            fin--;
        }
    }

    // aqui probamos invirtiendo algunos arreglos
    public static void main(String[] args) {

        int[] numeros1 = {10, 20, 30, 40, 50};
        reverse(numeros1);
        System.out.println(Arrays.toString(numeros1)); // [50, 40, 30, 20, 10]

        int[] numeros2 = {1, 2, 3, 4};
        reverse(numeros2);
        System.out.println(Arrays.toString(numeros2)); // [4, 3, 2, 1]
    }
}