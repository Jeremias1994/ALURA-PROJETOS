package org.example;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas =0;

        while (tentativas < 5){
            System.out.println("Digite um numero: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns você acertou o numero digitado.");
                break;
            } else if (numeroDigitado < numeroGerado){
                System.out.println("Numero menor que o digitado");
            } else {
                System.out.println("Numero digitado é maior");
            }
            if (tentativas ==5){
                System.out.println("Acabaram suas tentativas");
            }
        }
    }
}
