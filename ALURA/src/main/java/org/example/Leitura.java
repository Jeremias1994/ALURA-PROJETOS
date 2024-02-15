package org.example;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.print("Digite o ano de lancamento do seu filme:");
        int ano = leitura.nextInt();
        System.out.print("Digite sua avaliacao para o filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println("Nome do filme: " + filme);
        System.out.println("Lançado no ano: "+ ano);
        System.out.println("Nota do filme: "+ avaliacao);


    }
}
