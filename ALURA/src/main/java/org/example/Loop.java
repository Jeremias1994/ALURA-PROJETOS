package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao =0;
        double nota = 0;

        for (int i = 0; i < 3; i++){
            System.out.print("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;

        }

        System.out.println("Média de avaliação "+ mediaAvaliacao/3);
    }
}