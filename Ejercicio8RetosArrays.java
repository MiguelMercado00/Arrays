import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio8RetosArrays {
    
      public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);
        int numero = 0;
        while (numero != -1) {
          System.out.println("Introduce un número o -1 para salir: ");
          numero = input.nextInt();
          if (numero == -1) {
            break;
          }
          if (Arrays.binarySearch(numeros, numero) >= 0) {
            System.out.println("El número " + numero + " se encuentra en la lista.");
          } else {
            System.out.println("El número " + numero + " no se encuentra en la lista.");
          }
        }
        input.close();
      }
      public static int[] OrdenarArray(int[] numeros) {
        Arrays.sort(numeros);
        return numeros;
      }
    }

