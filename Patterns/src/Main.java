import Observer_Wetterstation.Bildschirm;
import Observer_Wetterstation.Farbsignalgeber;
import Observer_Wetterstation.Tongeber;
import Observer_Wetterstation.Wetterstation;
import Pizzarien.PizzaFactory;
import Pizzarien.Pizzaria;
import Proxy_Drucker.Drucker;
import Proxy_Drucker.Proxy;
import Umschlaege.Briefumschlaege;
import Umschlaege.UmschlaegeFactory;

public class Main {
    public static void main(String[] args) {
        /*  SINGLETON

        Singleton.Drucker d1 = Singleton.Drucker.getInstance();
        d1.drucken();

        Singleton.Drucker d2 = Singleton.Drucker.getInstance();
        d2.drucken();

        */


        /*  BRIEFE PATTERN
        Briefumschlaege erster = UmschlaegeFactory.getUmschläge("Umschlaege.A4", "45x30", 17);

        System.out.println(erster);

         */

        /*  PIZZARIA
        Pizzaria test = PizzaFactory.getPizza("Hamburg", "Hawaii");

        System.out.println(test);

         */

        //int temperatur = (int)(Math.random() * 50 + -20);
        //int feuchtigkeit = (int)(Math.random() * 100 + 0);

        /* OBSERVER
        Bildschirm b1 = new Bildschirm();
        Tongeber t1 = new Tongeber();
        Farbsignalgeber f1 = new Farbsignalgeber();

        b1.getWerte_Push(Wetterstation.feuchtigkeit, Wetterstation.temperatur);
        t1.getWerte_Push(Wetterstation.feuchtigkeit, Wetterstation.temperatur);
        f1.getWerte_Push(Wetterstation.feuchtigkeit, Wetterstation.temperatur);
        */

        Drucker drucker = new Proxy();

        drucker.Drucken(6, "SW");
    }
}