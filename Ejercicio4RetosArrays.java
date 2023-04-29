public class Ejercicio4RetosArrays {
  public static void main(String[] args) {
    int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(obtenerPrimoMasGrande(x));
  }
public static int obtenerPrimoMasGrande(int[] numeros) {
    int primoMasGrande = 0;
    for (int numero : numeros) {
        if (esPrimo(numero) && numero > primoMasGrande) {
            primoMasGrande = numero;
        }
    }
    return primoMasGrande;
}

public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}

  
}
