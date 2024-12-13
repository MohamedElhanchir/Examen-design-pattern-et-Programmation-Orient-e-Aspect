package elhanchir.mohamed;

import elhanchir.mohamed.transaction.Transaction;
import elhanchir.mohamed.transaction.TransactionBuilder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("001", new Date(), 1000, "vente");
        System.out.println(transaction);

        Transaction build = new TransactionBuilder()
                .setId("002")
                .setDate(new Date())
                .setAmount(2000)
                .setType("achat")
                .build();

        System.out.println("**********************************");
        System.out.println(build);
    }
}