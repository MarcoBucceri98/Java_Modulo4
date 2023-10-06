package Contatore;/*Progettare una classe Contatore.Contatore che permetta di

        Istanziare la classe con un valore iniziale

        Istanziare la classe senza un valore iniziale

        Incrementare il conteggio attuale

        Ottenere il conteggio attuale

        Resettare il conteggio a zero

        Resettare il conteggio ad un altro valore
*/

import java.util.Random;

public class Contatore {

    private int tot;
    public Contatore(int tot){

        this.tot = tot;

    }

    public void Reset_to_Zero(){
        this.tot = 0;
    }
    public void Reset_to_Number(int a){

        this.tot = a;

    }
    public void add(int incr){

        this.tot += incr;
    }
    public int getTot(){
        return tot;
    }
    public void setTot(int tot){
        this.tot = tot;
    }
    public void setTot2(){
        this.tot = tot;
    }


}
