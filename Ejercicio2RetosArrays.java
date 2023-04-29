
public class Ejercicio2RetosArrays {
        public static void main(String[] args) {
            String[] x = {"hola", "Buenos Días", "programación", "java"};
            ArrayDeStrings(x);
        }
          
        public static void ArrayDeStrings(String[] array) {
            int maximolargo = array[0].length();
            String stringmaslargo = array[0];
            
            for (int i = 0; i < array.length; i++) {
                if (array[i].length() > maximolargo) {
    
                    maximolargo = array[i].length();
                    stringmaslargo = array[i];   
        }    
        }
            System.out.println("El String más largo es: " + stringmaslargo);
        }
    }
    

