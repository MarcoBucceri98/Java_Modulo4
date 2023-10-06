package Forme_e_Colori;

public class Cerchio {

    private double raggio;
    private Colore colore;
    public Cerchio(double raggio){

        this.raggio = raggio;
        this.colore = Colore.NERO;
    }

    public void setRaggio(double r){
        this.raggio=r;
    }
    public double getRaggio(){
        return raggio;
    }
    public double getCirconferenza(){
        double circonferenza = raggio * 6.28;
        return circonferenza;
    }
    public double getArea(){
        double area = (getCirconferenza()*raggio)/2;
        return area;
    }
    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }
}
