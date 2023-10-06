package Biblioteca;
/*
Scrivere un programma che permetta di gestire una Biblioteca semplificata, in grado di gestire un array di indici (interi) dei libri che contiene. La Biblioteca viene costruita a partire da un array di indici di libri.
In particolare, implementare i seguenti metodi:
esisteLibro: prende un indice e restituisce true se esiste il libro con questo indice, false altrimenti
getIndiciLibriOrdinati: ritorna la lista degli indici di libri presenti nella biblioteca, in ordine ascendente
 */

public class Biblioteca {

    Libro [] libri;

    public Biblioteca(Libro[] libro){

        this.libri = libro;

    }

    public boolean isLibroinBiblioteca(int x){

        for(int i = 0; i<=libri.length-1;i++){
            if(libri[i].getIndice() == x){
                System.out.println("Libro trovato!\nAutore: "+libri[i].getName()+"\nTitolo: "+ libri[i].getAuthor()+"\nIndice: "+libri[i].getIndice());
                return true;
            }

            }
            System.out.println("LIBRO NON TROVATO!");
            return false;
    }

    public void setIndiciOrdinati(){
        int valMin = 0;
        for (int i = 0; i <= libri.length-1; i++) {

            for(int j = i+1; j<=libri.length-1; j++){

                if(libri[j].getIndice() < libri[i].getIndice()){
                    valMin = libri[i].getIndice();
                    libri[i].setIndice(libri[j].getIndice());
                    libri[j].setIndice(valMin);
                }


            }
            System.out.println(libri[i].getIndice());
        }
    }



    public static void main(String[] args) {

        Libro[] books = new Libro[]{
                new Libro(123, "Luciana Litizzetto", "I dolori del giovane Programmatore"),
                new Libro(4, "Super Mario", "Errori da non ripetere"),
                new Libro(98, "Luigi Pirandino", "Uno, nessuno e diecimila bug"),
                new Libro(33, "Roberto Roberti", "Come programmare in Java da zero"),
                new Libro(76, "Piero Java", "Mille splendidi errori"),
                new Libro(2, "Lavinia Pitoni", "Non si esce vivi dalle biblioteche"),
                new Libro(235, "Luciana Litizzetto Jr.", "I dolori del vecchio Programmatore")
        };

        Biblioteca bib = new Biblioteca(books);

        bib.isLibroinBiblioteca(33);
        bib.setIndiciOrdinati();


    }

}


