package Atividades;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o segundo numero: ");
        int numero2 = scanner.nextInt();


        if (numero1 == numero2) {
            System.out.println("Os numeros são iguais");

        }if (numero1 > numero2) {
            System.out.println("Os numeros são diferentes, o primeiro é maior");


        }else {
            System.out.println("O primeiro numero é menor e o segundo é maior");
        }
    }
}



