package com.banco.app;

import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.ContaCorrente;

public class TesteAppBanco {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Mateus");

        Conta c1 = new ContaCorrente(cliente);
    }
}
