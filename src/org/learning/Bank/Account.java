package org.learning.Bank;

public class Account {
    private int codeAccount;
    private String name;
    private double balance=0.0;

    public Account(String name){
        setName(name);
        codeAccount = ((int)(Math.random()*1000)+1);
    }

    public int getCodeAccount() {
        return codeAccount;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(double money){
        balance += money;
    }

    public void removeMoney(double money){
        if(money <= balance) {
            balance -= money;
            System.out.println("Prelievo effettuato corretttamente");
        }else{
            System.out.println("L'importo che si vuole prelevare è maggiore del saldo..prelievo annullato");
        }
    }
}
