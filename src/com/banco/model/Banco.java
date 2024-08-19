package com.banco.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Banco {
    Set<Conta> contas;
    private String nome;
    private Conta conta;

    public Banco(){
        this.contas = new LinkedHashSet<>();
    }

    public void adicionarContaCorrenteViaNome (String nome){
        contas.add(new ContaCorrente(new Cliente(nome)));
    }
    public void adicionarContaPoupancaViaNome (String nome){
        contas.add(new ContaPoupanca(new Cliente(nome)));
    }

    public Conta buscarContaPorNome (String nome) {
        Conta contaParaBuscar = null;
        for(Conta c : contas)
            if(c.getCliente().getNome().equals(nome)){
                contaParaBuscar = c;
                break;
            }
        return contaParaBuscar;
    }

    public void sacar (String nome, double valor){
        Conta conta = buscarContaPorNome(nome);
        if(conta != null)
            conta.sacar(valor);
        else
            System.out.println("Conta não encontrada!");
    }
    public void depositar (String nome, double valor){
        Conta conta = buscarContaPorNome(nome);
        if(conta != null)
            conta.depositar(valor);
        else
            System.out.println("Conta não encontrada!");
    }
    public void transferir(String nomeOrigem, String nomeDestino, double valor){
        Conta contaOrigem = buscarContaPorNome(nomeOrigem);
        Conta contaDestino = buscarContaPorNome(nomeDestino);
        if(contaOrigem != null && contaDestino != null)
            contaOrigem.transferir(valor, contaDestino);
        else
            System.out.println("Conta de origem e/ou Conta de destino não encontrada (s).");
    }

    public void imprimirExtrato(String nome){
        Conta conta = buscarContaPorNome(nome);
        if(conta != null)
            conta.imprimirExtrato();
        else
            System.out.println("Conta não encontrada.");
    }

    public void exibirContasBanco(){
        if(!contas.isEmpty()) {
            for(Conta c : contas)
                System.out.println("Cliente: " + c.getCliente().getNome() +
                        " | Conta: " + c.getNumero());
        }
        else
            System.out.println("Sem contas nesse banco.");
    }

}
