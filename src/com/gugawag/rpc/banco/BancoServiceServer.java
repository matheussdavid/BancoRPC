package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {

    private Map<String, Double> saldoContas;

    private List<Conta> contas;

    public BancoServiceServer() throws RemoteException {
//        saldoContas = new HashMap<>();
//        saldoContas.put("1", 100.0);
//        saldoContas.put("2", 156.0);
//        saldoContas.put("3", 950.0);
        contas = new ArrayList<Conta>();
        Conta conta1 = new Conta("1", 100.0);
        contas.add(conta1);
        Conta conta2 = new Conta("2", 100.0);
        contas.add(conta2);
        Conta conta3 = new Conta("3", 100.0);
        contas.add(conta3);
    }

    @Override
    public double saldo(String conta) throws RemoteException {
        double saldo = 1;
        for (Conta c: contas){
            if(c.getId() == conta){
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

    @Override
    public int quantidadeContas() throws RemoteException {
        return contas.size();
    }

    @Override
    public void adicionarConta(String id, Double saldo) throws RemoteException{
        Conta conta = new Conta(id, saldo);
        contas.add(conta);
    }

}
