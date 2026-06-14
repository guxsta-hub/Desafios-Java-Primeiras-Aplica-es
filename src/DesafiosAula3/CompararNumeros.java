package DesafiosAula3;
//Classe que faz comparação de números
import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitura.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }
    }
}

