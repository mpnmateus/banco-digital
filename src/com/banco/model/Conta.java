package com.banco.model;

public class Conta {
    protected int agencia;
    protected int numero;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.cliente = cliente;
    }

}
