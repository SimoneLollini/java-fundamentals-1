package org.lessons.java;

public class FizzBuzz {

//    Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare
//    (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
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
