package Pizzarien;

public abstract class Pizzaria {
    public abstract String getBacken();
    public abstract int getSchneiden();
    public abstract String getEinpacken();

    @Override
    public String toString(){
        return "Zutaten = " + this.getBacken() + "   Anzahl Stücke = " + this.getSchneiden() + "   Verpackung = " + this.getEinpacken();
    }

}
