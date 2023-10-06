package Esercizio_ImpiantoElettrico;/*
Progettare una classe Esercizio_ImpiantoElettrico.Lampadina che rappresenti una lampadina elettrica
La lampadina può essere accesa, spenta o rotta
Espone due metodi
stato() che indica lo stato corrente della lampadina
click() che cambia lo stato da accesa a spenta o da spenta ad accesa, oppure rompe la lampadina
Una lampadina si rompe dopo un numero di click definito dal produttore
La classe deve contenere uno o più campi che ne descrivano lo stato
Un costruttore
I metodi indicati sopra

 */

public class Lampadina {

    private boolean statoLamp;
    private int click;
    public Lampadina(int click) {
        this.statoLamp = false;
        this.click = click;
    }

    public boolean isStatoLamp() {
        return statoLamp;
    }

    public void setStatoLamp(boolean statoLamp) {
        this.statoLamp = statoLamp;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public void click() {

            if (click > 0) {
                if (statoLamp == true) {
                    statoLamp = false;
                    click--;
                    return;
                }
                if (statoLamp == false) {
                    statoLamp = true;
                    click--;
                    return;
                }

            }
        }



    public void getStato(){
        if(statoLamp == true && click >=0) System.out.println("LAMPADINA ACCESA");
        if(statoLamp == false && click >=0) System.out.println("LAMPADINA SPENTA");
        if(click == 0) System.out.println("LAMPADINA ROTTA");

    }

}