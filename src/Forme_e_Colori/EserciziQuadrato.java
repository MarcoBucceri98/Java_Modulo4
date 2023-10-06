package Forme_e_Colori;

import Forme_e_Colori.Quadrato;

import java.util.Scanner;

public class EserciziQuadrato {

    public static void esercizioQ(){

        int lat = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il lato: ");
        lat = scan.nextInt();
        Quadrato q = new Quadrato(lat);

        System.out.println("Il perimetro del tuo quadrato è: " + q.getPerimetro());
        System.out.println("Sto stampando il tuo quadrato..");
        q.printQuadrato();

    }

}
