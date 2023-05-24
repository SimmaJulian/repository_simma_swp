package Umschlaege;

public abstract class Briefumschlaege {

    public abstract String getGroesse();
    public abstract double getGewicht();
    @Override
    public String toString(){
        return "Größe = " + this.getGroesse() + "mm; Gewicht = " + this.getGewicht()+"g";
    }
}
