package Esercizio_ImpiantoElettrico;

import javax.imageio.ImageReadParam;

/*
Modificare la classe Esercizio_ImpiantoElettrico.Lampadina facendo in modo che tutte le lampadine condividano l’informazione sulla presenza di corrente all’interno dell’impianto (immaginate che tutte le lampadine siano collegate allo stesso impianto di corrente)

Le lampadine devono comportarsi coerentemente con la presenza o meno di elettricità nell’impianto

Quindi quando non c’è corrente una lampadina può essere soltanto nello stato «spento» o «rotto»

Scrivere un metodo di test che testi la funzione di ’’staccare’’ o ‘’riattaccare’’ la corrente

 */

public class Impianto {

private static boolean stato;
private Lampadina lamp;
    public Impianto(boolean s, Lampadina lamp){
        this.stato = s;
        this.lamp = lamp;
    }

    public boolean isStato() {
        return stato;
    }

    public void stampaStato(){

        if(stato == false ){
            System.out.println("CORRENTE ASSENTE");
            return;
        }
        if(stato == true){
            System.out.println("CORRENTE PRESENTE");
            return;
        }

    }
    public void setElectricity(boolean electricity) {
        if (electricity == false) {
                if (lamp.isStatoLamp()) {
                    lamp.setStatoLamp(false);
                }
            }

        this.stato = electricity;
    }

}
