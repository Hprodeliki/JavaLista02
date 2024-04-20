package Exercicios;
import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[5];
        double[] pesos = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = leitor.nextDouble();
        }

        for (int i = 0; i < pesos.length; i++) {
            System.out.println("Digite o peso para a " + (i + 1) + "ª nota: ");
            pesos[i] = leitor.nextDouble();
        }
        leitor.close();

        double somaPonderada = 0;
        double somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaPonderada / somaPesos;
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
    }
}
