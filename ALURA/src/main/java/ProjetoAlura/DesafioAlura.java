package ProjetoAlura;

import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        String nome;
        String tipoDeConta;
        int saldoInicial;
        int opcoes = 0;
        int valor = 0;
        int resultado = 0;
        int menu = 0;
        nome = "Jeremias Inacio";
        tipoDeConta = "Conta corrente.";
        saldoInicial = 2500;

        System.out.println("Deseja Acessar o Sistema: ");
        System.out.println("Digite 1- Sim e 2- Não");
        menu = dados.nextInt();



        while (menu == 1) {

            System.out.println("Dados Iniciais do Cliente");
            System.out.println("****************************************************************");
            System.out.println(" Nome: " + nome);
            System.out.println(" Tipo de Conta: " + tipoDeConta);
            System.out.println(" Saldo da Conta: " + saldoInicial);
            System.out.println("****************************************************************");

            System.out.println("Operações");

            System.out.println("1- Consultar dados: ");
            System.out.println("2- Receber valor: ");
            System.out.println("3- Transferir valor: ");
            System.out.println("4- Sair: ");
            System.out.println("Insira um numero para opção desejada: ");
            opcoes = dados.nextInt();


            if (opcoes == 1) {
                System.out.println("Dados Iniciais do Cliente");
                System.out.println("****************************************************************");
                System.out.println(" Nome: " + nome);
                System.out.println(" Tipo de Conta: " + tipoDeConta);
                System.out.println(" Saldo da Conta: " + saldoInicial);
                System.out.println("****************************************************************");
            }
            if (opcoes == 2) {
                System.out.println("Informe o Valor: ");
                valor = dados.nextInt();
                resultado = saldoInicial + valor;
                saldoInicial = resultado;
            }
            if (opcoes == 3) {
                System.out.println("Qual valor deseja transferir: ");
                valor = dados.nextInt();
                if (valor > 2500) {
                    System.out.println("Saldo insuficiente! Seu pobre fudido!");
                    continue;

                }
                resultado = saldoInicial - valor;
                saldoInicial = resultado;
            }
            if (opcoes == 4){
                System.out.println("Nada mais Show! ");
                break;
            }
        }
        if (menu ==2){
            System.out.println("Fim.");
        }
        if (menu >= 3 || menu == 0 ){
            System.out.println("Opção inválida.");

        }
    }
}





















