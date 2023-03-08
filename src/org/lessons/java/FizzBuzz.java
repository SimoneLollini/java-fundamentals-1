package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

//    Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare
//    (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // dichiaro il metodo che mi permette di far inserire dei dati all'utente
        boolean check;
        int loopNum = 0;

        do {
            System.out.println("Quanti numeri vuoi stampare?");
            try {
                loopNum = Integer.parseInt(scan.nextLine());
                check = loopNum > 0 && loopNum <= 1000;
            } catch (NumberFormatException nfe) {
                check = false;
                scan.close(); //interrompo lo scan
            }
            if (!check) {
                System.out.println("Inserisci un numero maggiore di zero e minore o uguale a mille, numero inserito: " + loopNum);
            }
        } while (!check);

        for (int i = 1; i <= loopNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
