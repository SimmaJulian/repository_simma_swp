package Pizzarien;

public class BerlinPizzaria extends Pizzaria{
    public String zutaten;
    public int stück;
    public String verpackung;
    public BerlinPizzaria(String art){
        if("Salami".equalsIgnoreCase(art)) {
            this.zutaten = "Salami";
            this.stück = 8;
            this.verpackung = "weißer Karton";
        }
        else if("Calzone".equalsIgnoreCase(art)) {
            this.zutaten = "Margherita";
            this.stück = 8;
            this.verpackung = "roter Karton";
        }
        else if("Hawaii".equalsIgnoreCase(art)) {
            this.zutaten = "Ananas, Schinken, extra Mozarella";
            this.stück = 4;
            this.verpackung = "blauer Karton";
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
