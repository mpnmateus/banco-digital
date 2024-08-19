package com.banco.model;

import com.banco.service.IConta;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;


    public Conta (Cliente cliente){
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor){}

    public void depositar(double valor){}

    public void transferir(double valor, Conta contaDestino){}

    public void imprimirExtrato(){
        System.out.println("O extrato do cliente ");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
