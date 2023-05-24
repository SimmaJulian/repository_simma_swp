package Observer_Wetterstation;

public interface Wetterstation{
    int temperatur = (int)(Math.random() * 50 + -20);
    int feuchtigkeit = (int)(Math.random() * 100 + 0);
    void getWerte_Push(int feuchtigkeit, int temperatur);
}
