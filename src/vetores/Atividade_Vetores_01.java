package vetores;

import java.util.Scanner;

public class Atividade_Vetores_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior, menor;

        // Lendo os 10 números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        // Inicializa maior e menor
        maior = numeros[0];
        menor = numeros[0];

        // Verifica maior e menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Resultado
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
