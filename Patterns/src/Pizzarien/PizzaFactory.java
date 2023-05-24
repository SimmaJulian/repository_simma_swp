package Pizzarien;

import Umschlaege.A4;
import Umschlaege.Briefumschlaege;

public class PizzaFactory {
    public static Pizzaria getPizza(String stadt, String art){
        if("Berlin".equalsIgnoreCase(stadt)){
            return new BerlinPizzaria(art);
        }else if("Rostock".equalsIgnoreCase(stadt)){
            return new RostockPizzaria(art);
        }else if("Hamburg".equalsIgnoreCase(stadt)){
            return new HamburgPizzaria(art);
        }
        return null;
    }
}
