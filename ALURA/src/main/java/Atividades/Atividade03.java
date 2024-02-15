package Atividades;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Calcular Área do quadrado:");
        int base = 0;
        int altura = 0;
        int resultado = 0;

        System.out.println("Insira o valor da base: ");
        base = valor.nextInt();

        System.out.println("Insira o valor da altura: ");
        altura = valor.nextInt();
        resultado = base * altura ;

        System.out.println("O resultado é: "+ resultado);




    }
}
