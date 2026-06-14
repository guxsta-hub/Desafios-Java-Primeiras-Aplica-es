package DesafiosAula3;
//Classe que diz se é o número vai ser positivo ou negativo
import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitura.nextDouble();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}

