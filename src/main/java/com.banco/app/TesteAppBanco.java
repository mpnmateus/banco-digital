package com.banco.app;

import com.banco.model.Banco;
import java.util.Scanner;

public class TesteAppBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 8){
            System.out.println("\n------------------------ MENU ------------------------");
            System.out.println(" 1 - Cadastrar nova conta Corrente para um cliente ");
            System.out.println(" 2 - Cadastrar nova conta Poupança para um cliente ");
            System.out.println(" 3 - Realizar saque ");
            System.out.println(" 4 - Realizar depósito ");
            System.out.println(" 5 - Realizar transferência ");
            System.out.println(" 6 - Imprimir extrato ");
            System.out.println(" 7 - Imprimir relação de contas em um banco ");
            System.out.println(" 8 - Sair ");

            System.out.println("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do cliente para o qual será criada uma conta Corrente: ");
                    String nomeCliente = scanner.next();
                    banco.adicionarContaCorrenteViaNome(nomeCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do cliente para o qual será criada uma conta Corrente: ");
                    nomeCliente = scanner.next();
                    banco.adicionarContaPoupancaViaNome(nomeCliente);
                    break;

                case 3:
                    System.out.println("Digite o nome do cliente para o qual quer fazer um saque: ");
                    nomeCliente = scanner.next();
                    System.out.println("Digite o valor do saque: ");
                    int valorSaque = scanner.nextInt();
                    banco.sacar(nomeCliente, valorSaque);
                    break;

                case 4:
                    System.out.println("Digite o nome do cliente para o qual quer fazer um depósito: ");
                    nomeCliente = scanner.next();
                    System.out.println("Digite o valor do saque: ");
                    int valorDeposito = scanner.nextInt();
                    banco.depositar(nomeCliente, valorDeposito);
                    break;

                case 5:
                    System.out.println("Digite o nome do cliente da conta de origem: ");
                    String nomeClienteContaOrigem = scanner.next();
                    System.out.println("Digite o nome do cliente da conta de destino: ");
                    String nomeClienteContaDestino = scanner.next();

                    System.out.println("Digite o valor da transferência: ");
                    int valorTransferencia = scanner.nextInt();

                    banco.transferir(nomeClienteContaOrigem, nomeClienteContaDestino, valorTransferencia);
                    break;

                case 6:
                    System.out.println("Digite o nome do cliente para o qual quer imprimir o extrato: ");
                    nomeCliente = scanner.next();
                    banco.imprimirExtrato(nomeCliente);
                    break;

                case 7:
                    banco.exibirContasBanco();
                    break;

            }
        }
        System.out.println("Você saiu do programa.");

        scanner.close();
    }
}
