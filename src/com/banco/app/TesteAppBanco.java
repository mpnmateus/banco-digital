package com.banco.app;

import com.banco.model.Banco;
import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.ContaCorrente;
import com.sun.security.jgss.GSSUtil;

public class TesteAppBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();


        banco.adicionarContaCorrenteViaNome("Mateus");
        banco.adicionarContaCorrenteViaNome("Pedro");
        banco.adicionarContaPoupancaViaNome("José");
        banco.exibirContasBanco();
    }
}
