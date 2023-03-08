package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

//    Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare
//    (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // dichiaro il metodo che mi permette di far inserire dei dati all'utente
        System.out.print("Quanti numeri vuoi stampare?");
        int loopNum = Integer.parseInt(scan.nextLine()); // prima di passare alla riga successiva invoco il metodo scan e setto la variabile loopNum con il suo valore in entrata
        scan.close(); //interrompo lo scan

        if (loopNum > 1000) {
            System.out.println("Il valore inserito dev'essere minore o uguale a 1000, valore inserito: " + loopNum);
            return;
        }

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
