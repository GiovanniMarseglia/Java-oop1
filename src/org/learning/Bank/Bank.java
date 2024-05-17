package org.learning.Bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire il proprio nome");
        Account account = new Account(scanner.nextLine());
        int choice=0;
        while(choice != 1) {
            System.out.println("Digita 0 se vuoi depositare denaro, digita 2 se vuoi prelevare oppure digita 1 se vuoi uscire");
            choice = scanner.nextInt();
            if (choice == 0){
                System.out.println("quanti soldi vuoi depositare?");
                account.addMoney(scanner.nextBigDecimal());
                System.out.println("Importo aggiornato: " + account.getBalance());
            }else if(choice == 2){
                System.out.println("quanti soldi vuoi prelevare?");
                account.removeMoney(scanner.nextBigDecimal());
                System.out.println("Importo aggiornato: " + account.getBalance());
            }else if(choice != 0 && choice != 1 && choice != 2){
                System.out.println("hai inserito un valore non valido...riprova");
            }else{
                choice = 1;
            }
        }



        scanner.close();
    }
}
