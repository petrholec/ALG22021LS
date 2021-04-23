package bank3App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import bank3Bank.Person;
import bank3Bank.Client;
import bank3Bank.Company;

public class BankApp {
    public static void main(String[] args) {
        Person pekar = new Person("Pekar");
        Person svecova = new Person("Svecova");
        Company skoda = new Company("Skoda");

        pekar.addAccount(1000);
        pekar.addAccount(500);
        svecova.addAccount(1200);
        skoda.addAccount(120);

        List<Client> clients = new ArrayList(Arrays.asList(pekar, svecova, skoda));
        //clients.add(pekar);
        for (Client client : clients) {
            System.out.println(client.adressClient() + " " + client.getAllMoney());
        }

        //Arrays.sort
        Collections.sort(clients);
        //client1.compareTo(client2)

        System.out.println("vsechny penize");
        for (Client client : clients) {
            System.out.println(client.adressClient() + " " + client.getAllMoney());
        }
    }
}
