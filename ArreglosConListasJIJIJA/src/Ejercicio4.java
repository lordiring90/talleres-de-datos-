import java.util.Arrays;

public class Ejercicio4 {
    public static void moverCeros(int[] arreglo) {
        // puntero para saber en que posicion colocar el siguiente numero distinto de cero
        int idxNoCero = 0;

        // recorremos el arreglo y movemos todos los numeros diferentes de cero al inicio
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != 0) {
                arreglo[idxNoCero] = arreglo[i];
                idxNoCero++;
            }
        }

        // rellenamos con ceros las posiciones sobrantes hasta el final del arreglo
        for (int i = idxNoCero; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }

    // aqui probamos moviendo los ceros al final
    public static void main(String[] args) {

        int[] numeros1 = {0, 1, 0, 3, 12};
        moverCeros(numeros1);
        System.out.println(Arrays.toString(numeros1)); // [1, 3, 12, 0, 0]

        int[] numeros2 = {0, 0, 5, 2, 0};
        moverCeros(numeros2);
        System.out.println(Arrays.toString(numeros2)); // [5, 2, 0, 0, 0]
    }
}