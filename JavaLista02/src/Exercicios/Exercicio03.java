package Exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número da posição " + i + ": ");
            numeros[i] = leitor.nextDouble();
        }
        leitor.close();

        double[] dobrados = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            dobrados[i] = numeros[i] * 2;
        }

        System.out.println("Valores do segundo vetor:");
        for (double numero : dobrados) {
            System.out.println(numero);
        }
    }
}
