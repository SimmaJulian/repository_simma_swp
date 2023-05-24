package Observer_Wetterstation;

public class Bildschirm implements Wetterstation{
    @Override
    public void getWerte_Push(int feuchtigkeit, int temperatur) {
        System.out.println("Feuchtigkeit: " + feuchtigkeit + "%    Temperatur: " + temperatur + "°C");
        System.out.println("------------------------------------------");
    }
}
