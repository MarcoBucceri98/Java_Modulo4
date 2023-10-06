package Biblioteca;

public class Libro {

    private int indice;
    private String name;
    private String author;
    private boolean libroPresente;

    public Libro(int index, String name, String autore){
        this.name = name;
        this.author = autore;
        this.indice = index;
        this.libroPresente = false;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }




}
