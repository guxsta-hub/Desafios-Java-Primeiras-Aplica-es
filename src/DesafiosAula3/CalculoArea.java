package DesafiosAula3;
//Classe que faz cálculo de área
import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha uma opção: ");
        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o lado do quadrado: ");
            double lado = leitura.nextDouble();

            double area = lado * lado;

            System.out.println("A área do quadrado é: " + area);

        } else if (opcao == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = leitura.nextDouble();

            double area = 3.14 * raio * raio;

            System.out.println("A área do círculo é: " + area);

        } else {
            System.out.println("Opção inválida!");
        }
    }
}

