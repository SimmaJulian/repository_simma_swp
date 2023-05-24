package Umschlaege;

public class A5 extends Briefumschlaege {
    public double gewicht;
    public String groesse;
    public A5(String groesse, double gewicht){
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
