package org.example;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluindoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os clientes estaoa curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluindoNoPlano == false && tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");

        }else {
            System.out.println("Deve pagar a locação.");
        }
    }
}
