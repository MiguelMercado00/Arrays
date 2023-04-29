public class Ejercicio1RetosArrays {
    public static void ArrayDePares(int[] arr_num) { 
        int ContadorDeNumerosPares = 0;
        for (int i = 0; i < arr_num.length; i++) {
            if (arr_num[i] % 2 == 0) {
            ContadorDeNumerosPares++;
        }
    }
    System.out.println("La cantidad de numeros pares es: " + ContadorDeNumerosPares);
        
    } 
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayDePares(x);
    }
}
