package com.gugawag.rpc.banco;

public class Conta {

    String id;
    Double saldo;

    public Conta(){}

    public Conta(String id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
