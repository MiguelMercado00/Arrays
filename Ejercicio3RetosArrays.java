public class Ejercicio3RetosArrays {
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
          if (array[i] < min) {
            min = array[i];
          }
        }

        return min;
      }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(min(x));
      
    }
      
}
