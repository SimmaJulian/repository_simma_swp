package Pizzarien;

public class HamburgPizzaria extends Pizzaria{
    public String zutaten;
    public int stück;
    public String verpackung;
    public HamburgPizzaria(String art){
        if("Salami".equalsIgnoreCase(art)) {
            this.zutaten = "Salami, Chilli-Sauce";
            this.stück = 8;
            this.verpackung = "weißer Karton";
        }
        else if("Calzone".equalsIgnoreCase(art)) {
            this.zutaten = "Prosciutto";
            this.stück = 4;
            this.verpackung = "weißer Karton, 8-eckig";
        }
        else if("Hawaii".equalsIgnoreCase(art)) {
            this.zutaten = "Ananas";
            this.stück = 2;
            this.verpackung = "brauner Karton";
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
