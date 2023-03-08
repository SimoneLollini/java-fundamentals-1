package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

//        Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat
public class TrainTicket {

    public static void main(String[] args) {
        // salvo il metodo che utilizzero per prendere i dati dall'utente
        Scanner scan = new Scanner(System.in);
        //chiedo il numero di km all'utente
        System.out.print("Numero intero di km da percorrere:");
        int km = Integer.parseInt(scan.nextLine());
        //chiedo il numero di km all'utente
        System.out.print("La tua età:");
        int age = Integer.parseInt(scan.nextLine());
        //calcolo il prezzo totale del biglietto

        scan.close(); //!! chiusura dello scan

        double totPrice = km * 0.21;
        //System.out.println(totPrice);

        //calcolo sconto under
        double discountUnder = (totPrice * 0.20);

        //calcolo sconto over
        double discountOver = (totPrice * 0.40);

        //salvo la variabile che conterrà il prezzo finale
        double finalPrice;

        if (age < 18) {
            finalPrice = totPrice - discountUnder;
        } else if (age > 65) {
            finalPrice = totPrice - discountOver;
        } else {
            finalPrice = totPrice;
        }

        // Salvo il metodo che mi permette di avere come valore finale un numero formato "umano"
        DecimalFormat toDecimal = new DecimalFormat("#.##");

        //stampo a schermo il valore del prezzo finale
        //System.out.println(finalPrice);
        System.out.println(toDecimal.format(finalPrice)); //formato con finalPrice formato umano
    }

}
