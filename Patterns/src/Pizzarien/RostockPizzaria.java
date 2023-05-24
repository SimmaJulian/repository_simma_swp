package Pizzarien;

public class RostockPizzaria extends Pizzaria{
    public String zutaten;
    public int stück;
    public String verpackung;
    public RostockPizzaria(String art){
        if("Salami".equalsIgnoreCase(art)) {
            this.zutaten = "Salami, Käserand";
            this.stück = 4;
            this.verpackung = "gelber Karton";
        }
        else if("Calzone".equalsIgnoreCase(art)) {
            this.zutaten = "Margherita";
            this.stück = 1;
            this.verpackung = "weißer Karton";
        }
        else if("Hawaii".equalsIgnoreCase(art)) {
            this.zutaten = "Ananas, Meeresfrüchte";
            this.stück = 2;
            this.verpackung = "weiß Karton";
        }

    }
    @Override
    public String getBacken(){
        return this.zutaten;
    }
    @Override
    public int getSchneiden(){
        return this.stück;
    }
    @Override
    public String getEinpacken(){
        return this.verpackung;
    }
}
