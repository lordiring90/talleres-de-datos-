public class Ejercicio2 {
    public static int sumaTotal(int[] arreglo) {
        // creamos la variable suma iniciando en cero para ir acumulando los valores
        int suma = 0;

        // recorremos el arreglo desde la posicion 0 hasta antes del tamaño total (length)
        for (int i = 0; i < arreglo.length; i++) {
            // usamos += para ir sumando y guardando el valor de cada posicion
            suma += arreglo[i];
        }

        return suma; // retornamos el total que se acumulo
    }

    // aqui probamos con algunos arreglos para comprobar que suma bien
    public static void main(String[] args) {

        int[] numeros1 = {10, 20, 30, 40, 50};
        int[] numeros2 = {5, 5, 5, 5};
        int[] numeros3 = {1, 2, 3};

        System.out.println(sumaTotal(numeros1)); // 150
        System.out.println(sumaTotal(numeros2)); // 20
        System.out.println(sumaTotal(numeros3)); // 6
    }
}