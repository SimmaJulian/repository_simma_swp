package Proxy_Drucker;

public class Colour_Drucker implements Drucker{
    public void Drucken(int seiten, String farbe)
    {
        System.out.println("Drucke " + seiten + " Seiten im ColorDrucker");
    }
}
