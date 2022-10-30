package org.example;

import mypackage.BanqueService;
import mypackage.BanqueWS;
import mypackage.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService bankWS = new BanqueWS().getBanqueServicePort();
        System.out.println("\n---------------Convert Dh to Euro");
        double response = bankWS.conversionEuroToDH(30);
        System.out.println(response);
        System.out.println("\n---------------Get Account------------------------");
        Compte account = bankWS.getCompte(1L);
        System.out.println(account.getCode());
        System.out.println(account.getSolde());
        System.out.println(account.isActive());
        System.out.println("\n---------------Get Accounts------------------------");
        List<Compte> accounts = bankWS.listeComptes();
        accounts.forEach(account1 -> {
            System.out.println(account1.getCode());
            System.out.println(account1.getSolde());
            System.out.println(account1.isActive());
            System.out.println("************");
        });
    }
}
