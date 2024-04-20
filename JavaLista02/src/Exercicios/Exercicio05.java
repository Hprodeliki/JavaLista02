package Exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextInt();
        }
        System.out.println("Digite um número para contar: ");
        int n = leitor.nextInt();
        leitor.close();

        int count = 0;
        for (int numero : numeros) {
            if (numero == n) {
                count++;
            }
        }

        System.out.println("O número " + n + " aparece " + count + " vezes no vetor.");
    }
}
