package Umschlaege;

public class A4 extends Briefumschlaege {
    public double gewicht;
    public String groesse;
    public A4(String groesse, double gewicht){
        this.gewicht=gewicht;
        this.groesse=groesse;
    }
    @Override
    public String getGroesse(){
        return this.groesse;
    }
    @Override
    public double getGewicht(){
        return this.gewicht;
    }
}
