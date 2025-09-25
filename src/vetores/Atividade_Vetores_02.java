package vetores;

import java.util.Random;

public class Atividade_Vetores_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Números Pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nNúmeros Ímpares:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
