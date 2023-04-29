public class Ejercicio5RetosArrays {
    
    public static void ValorBuscado() { 
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicion = -1;
        int valorBuscado = 3;
        for (int i = 0; i < arreglo.length; i++) {
         if (arreglo[i] == valorBuscado) {
            posicion = i;
            break;
    }
}
          System.out.println("La posición de " + valorBuscado + " en el array es: " + posicion);

}
    public static void main(String[] args) {
        ValorBuscado();
}
}
