package Observer_Wetterstation;

public class Farbsignalgeber implements Wetterstation{
    @Override
    public void getWerte_Push(int feuchtigkeit, int temperatur) {
        if((temperatur >= 35) || (temperatur <= -10)) {
            System.out.println("Rot");
            System.out.println("------------------------------------------");
        }
        else if((temperatur >= 20) || (temperatur < 0)) {
            System.out.println("Gelb");
            System.out.println("------------------------------------------");
        }
        else if(temperatur >= 0) {
            System.out.println("Grün");
            System.out.println("------------------------------------------");
        }
    }
}
