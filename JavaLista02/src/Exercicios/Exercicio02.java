package Exercicios;
import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número da posição " + i + ": ");
            numeros[i] = leitor.nextDouble();
        }
        leitor.close();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println("O número na posição " + i + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("O número na posição " + i + " é negativo.");
            } else {
                System.out.println("O número na posição " + i + " é zero.");
            }
        }
    }
}
