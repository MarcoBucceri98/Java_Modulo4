package Contatore;

import Contatore.Contatore;

import java.util.Scanner;

public class EsercizioContatore {

    public static void esercizio(){

        int settaggio = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un valore per inizializzare a tuo piaciere la variabile");
        settaggio = scan.nextInt();
        Contatore cont = new Contatore(0);
        System.out.println("Stato iniziale" + cont.getTot());
        cont.setTot(settaggio);
        System.out.println("Stato post inizializzazione" + cont.getTot());
        cont.add(5);
        System.out.println("Stato post incremento" + cont.getTot());
        cont.Reset_to_Zero();
        System.out.println("Stato post reset a Zero" + cont.getTot());
        cont.Reset_to_Number(5);
        System.out.println("Stato post reset a numero diverso da zero" + cont.getTot());
        cont.setTot2();
        System.out.println("Stato inizializzazione senza elemento" +cont.getTot());

    }

}
