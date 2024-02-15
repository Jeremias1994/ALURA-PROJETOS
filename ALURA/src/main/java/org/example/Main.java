package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        /*padrao camelCase para variavel inicia com letra minuscula e para classe com letra maiuscula*/
        System.out.println("anoDeLancamento: " +anoDeLancamento );
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("A nota do Filme foi: " + notaDoFilme);
        // média calculada pelas 3 notas da Jack, Paulo, e Lucas.
        double media = (9.8 + 6.3 + 8.0) /3 ;
        System.out.println("A media do filme foi: " + media);
        String sinopse;
        sinopse = " Filme de aventura com galã do anos 80 ";
        System.out.println("sinopse: "+ sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);

         



    }
}