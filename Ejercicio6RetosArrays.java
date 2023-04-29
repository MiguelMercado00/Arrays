public class Ejercicio6RetosArrays {
    public static void ArrayDeParesAlCuadrado(int[] arr_num) { 
        for (int i = 0; i < arr_num.length; i++) {
            if (arr_num[i] % 2 == 0) {
                System.out.println("El numero " + arr_num[i] + " al cuadrado es: " + (Math.pow(arr_num[i], 2)));
        }
    }
        
    } 
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayDeParesAlCuadrado(x);
    }
}
