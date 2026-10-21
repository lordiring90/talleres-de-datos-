public class Ejercicio1 {
    public static int search(int[] arreglo, int valor) {
//usamos el for para recorrer la lista, empezando en cero, length es el size el tamaño del arreglo, no usamos <= porque digamos que tenemos 4 objetos, seria (0,1,2,3) entonces si length esta hasta 4 objetos, intentaria tomar la posicion 4 que en este caso esta en null
        for (int i = 0; i < arreglo.length; i++) {
// usamos el arreglo[i] == 1 para comparar, si es exactamente el mismo retorna i, osea true
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1; //sino retorna -1 :D
    }
//aqui probamos agregando objetcs
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(search(numeros, 30)); // 2
        System.out.println(search(numeros, 50)); // 4
        System.out.println(search(numeros, 99)); // -1
    }
}