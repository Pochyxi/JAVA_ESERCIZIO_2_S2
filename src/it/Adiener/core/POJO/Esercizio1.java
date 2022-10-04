package it.Adiener.core.POJO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {


    public void letsGo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");

        int selectedNumberOfWords = 0;
        boolean selectedNumberOfWordsCheck = true;

        do {
            try {
                selectedNumberOfWords = Integer.parseInt(scanner.nextLine());
                selectedNumberOfWordsCheck = false;

            } catch( Exception e ) {
                System.out.println("Qualcosa è andato storto. Riprova!");
            }
        } while( selectedNumberOfWordsCheck );

        HashSet<String> wordsArray = new HashSet<>();
        HashSet<String> duplicati = new HashSet<>();

        boolean wordArrayCheck = true;
        while ( wordArrayCheck ) {
            try {
                for( int i = 0; i < selectedNumberOfWords; i++ ) {

                    System.out.println("Dimmi la parola numero " + (i + 1));
                    String input = scanner.nextLine();

                    if( wordsArray.add(input) ) {
                        wordsArray.add(input);
                        System.out.println("eeeeeeee " + i + " " + wordsArray);
                    } else {
                        duplicati.add(input);
                        System.out.println("Duplicato! " + i + " " + duplicati);
                    }

                    if( i == selectedNumberOfWords - 1 ) {
                        wordArrayCheck = false;
                    }

                }
            } catch( Exception e ) {
                System.out.println("Qualcosa è andato storto. Riprova!");
            }
        } ;

        System.out.println();
        System.out.println("Parole duplicate");
        for ( String el : duplicati ) {
            System.out.println( el );
        }

        System.out.println();
        System.out.println("Parole distinte");
        for ( String el : wordsArray ) {
            System.out.println(el);
        }


        scanner.close();
    }
}
