package parcial02_ejecicio1;
import java.util.Scanner;

public class Parcial02_ejecicio1 {
    
     public static String[] invertirArray(String[] array) {
        String[] arrayInvertido = new String[array.length];
        
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        
        return arrayInvertido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de elementos del array: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        String[] arrayOriginal = new String[cantidad];
        
        for (int i=0; i < cantidad; i++){
            System.out.print("Ingrese el elemento: "+(i+1)+": ");
            arrayOriginal[i] = scanner.nextLine();
        }
        String[]arrayInvertido=invertirArray(arrayOriginal);
        
        System.out.println("\nArrayOriginal: ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i]);
            if (i < arrayOriginal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\nArray invertido: ");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.print(arrayInvertido[i]);
            if (i < arrayInvertido.length - 1) {
                System.out.print(", ");
            }
        }
          
    }
    
}
