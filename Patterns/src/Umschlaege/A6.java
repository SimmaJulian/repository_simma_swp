package Umschlaege;

public class A6 extends Briefumschlaege {
    public String groesse;
    public double gewicht;
    public A6(String groesse, double gewicht){
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
