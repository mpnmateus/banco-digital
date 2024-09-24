package com.banco.model;

public class Cliente {

    private static int SEQUENCIAL_CLIENTE = 1;

    private int id_cliente;
    private String nome;

    public Cliente (String nome){
        this.nome = nome;
        this.id_cliente = SEQUENCIAL_CLIENTE++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
