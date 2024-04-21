package Exercicios;
import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        int[] vetor2 = new int[5];
        int[] vetor1 = new int [5];

        System.out.println("Digite os componentes do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o componente " + (i + 1) + ": ");
      
        }

        System.out.println("Digite os componentes do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite o componente " + (i + 1) + ": ");
            vetor2[i] = leitor.nextInt();
        }
        leitor.close();

        boolean iguais = true;
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }

        if (iguais) {
            System.out.println("os vetores são iguais.");
        } else {
            System.out.println("os vetores são diferentes.");
        }
    }
}
