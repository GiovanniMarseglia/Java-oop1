package org.learning.Bank;

import java.math.BigDecimal;

public class Account {
    private int codeAccount;
    private String name;
    private BigDecimal balance=BigDecimal.ZERO;

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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(BigDecimal money){
        balance = balance.add(money);

    }

    public void removeMoney(BigDecimal money){

        if(money.compareTo(balance)<=0) {
            balance=balance.subtract(money);
            System.out.println("Prelievo effettuato correttamente");
        }else{
            System.out.println("L'importo che si vuole prelevare è maggiore del saldo..prelievo annullato");
        }
    }
}
