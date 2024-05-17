package org.learning.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Inserisci il prezzo");
        product.setPrice(scanner.nextInt());
        System.out.println("Inserisci l'iva");
        product.setIva(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Inserisci il nome");
        product.setName(scanner.nextLine());

        System.out.println("Codice prodotto: " + product.getCode());
        System.out.println("Prezzo base: " + product.getPrice());
        System.out.println("Iva: " + product.getIva());
        System.out.println("Prezzo comprensivo di iva: " + product.getPriceWithIva());
        System.out.println("Nome completo: " + product.getFullName());
        scanner.close();
    }
}
