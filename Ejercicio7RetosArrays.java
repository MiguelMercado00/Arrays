import java.util.Scanner;
public class Ejercicio7RetosArrays {
  public static int Array1(String[] mensajes) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    while (contador < mensajes.length) {
      System.out.println("Introduce un mensaje:");
      String mensaje = sc.nextLine();
      if (mensaje.length() < 10) {
        mensajes[contador] = mensaje;
        contador++;
      } else {
        System.out.println("El mensaje es demasiado largo. Introduce uno más corto.");
      }
    }
    sc.close();
    return contador;
  }
    public static void main(String[] args) {
    String[] arrayAlternativo = new String[10];
    int x = Array1(arrayAlternativo);
    System.out.println("Se lleno el arreglo de " + x + " elementos.");

    }
  }



