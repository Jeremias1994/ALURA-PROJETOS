package Atividades;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        double numero = scanner.nextDouble();

        if (numero <0){
            System.out.println("Número negativo.");

        }else if (numero >0){
            System.out.println("Número positivo.");

        }else{
            System.out.println("O número é zero");
        }

    }
}


