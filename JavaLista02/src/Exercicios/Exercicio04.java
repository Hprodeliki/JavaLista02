package Exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número da posição " + i + ": ");
            numeros[i] = leitor.nextDouble();
        }

        System.out.println("Digite um número para comparar: ");
        double n = leitor.nextDouble();
        leitor.close();

        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < n) {
                System.out.println(i);
            }
        }
    }
}

