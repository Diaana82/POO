package parcial01;

import java.util.Scanner;
import java.util.Random;

public class Parcial01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Cantidad de numeros a validar: ");
        int cantidad = scanner.nextInt();
        
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = 100 + random.nextInt(99900);
        }
        
        System.out.print("Numeros generados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i]);
            if (i < cantidad - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        System.out.println("Resultados:");
        for (int i = 0; i < cantidad; i++) {
            int numero = numeros[i];
            
            //  si la suma de dígitos es par
            int suma = 0;
            int temp = numero;
            while (temp > 0) {
                suma += temp % 10;
                temp /= 10;
            }
            boolean condicion1 = (suma % 2 == 0);
            
            //  si el número invertido es divisible por 3
            int numeroInvertido = 0;
            temp = numero;
            while (temp > 0) {
                int digito = temp % 10;
                numeroInvertido = numeroInvertido * 10 + digito;
                temp /= 10;
            }
            boolean condicion2 = (numeroInvertido % 3 == 0);
            
            // si es camaleón las dos de arriba
            boolean esCamaleon = condicion1 && condicion2;
            
            System.out.println(numero + " -> " + (esCamaleon ? "Si" : "No"));
        }
        
        scanner.close();
    }
}
