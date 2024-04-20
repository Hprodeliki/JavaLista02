package Exercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextDouble();
        }
        leitor.close();

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;
        System.out.println("Valores menores que a média:");
        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
          }
        System.out.println("Valores iguais à média:");
        for (double numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }
        System.out.println("Valores superiores à média:");
        for (double numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }
    }
}
