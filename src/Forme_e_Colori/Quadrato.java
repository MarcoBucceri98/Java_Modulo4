package Forme_e_Colori;

import java.util.Arrays;

public class Quadrato {

    private int lato;

    public Quadrato (int lato){
        this.lato = lato;
    }

    public void setLato(int lato){
        this.lato = lato;
    }
    public int getPerimetro(){
        int perimetro = 0;
        perimetro = lato * 4;
        return perimetro;
    }
    public void printQuadrato(){
        String [][] quadrato = new String[lato][lato];
            for(int i=0; i<quadrato.length;i++){
                for(int j=0; j<quadrato[i].length;j++){
                    quadrato[i][j] = ".";
                }
            }
        for(int i=0; i<quadrato.length;i++){
            for(int j=0; j<quadrato[i].length;j++){
                System.out.print(quadrato[i][j] + " ");
            }
            System.out.println();
        }

    }
}
