package com.banco.model;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    Set<Conta> contasSet;

    public Banco(){
        this.contasSet = new HashSet<>();
    }

}
