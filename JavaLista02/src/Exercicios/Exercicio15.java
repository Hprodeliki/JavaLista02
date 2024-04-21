package Exercicios;
import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        int[] vetor = new int[5];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os 5 números:");
        vetor[0] = leitor.nextInt();
        int anterior = vetor[0]; 
        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Digite o próximo número maior que " + anterior + ": ");
            int numero = leitor.nextInt();
            if (numero > anterior) {
                vetor[i] = numero;
                anterior = numero;
            } else {
                System.out.println("Número inválido! O número deve ser maior que " + anterior + ".");
              i--;
            }
        }
        leitor.close();

        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
