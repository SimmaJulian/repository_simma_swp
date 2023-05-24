package Observer_Wetterstation;

public class Tongeber implements Wetterstation{
    @Override
    public void getWerte_Push(int feuchtigkeit, int temperatur) {
        if((temperatur >= 35)||(feuchtigkeit >=70)){
            System.out.println("Bieeep Bieeeeep BIEEEEEEEEPPP");
            System.out.println("------------------------------------------");
        }else{
            System.out.println("Stille....");
            System.out.println("------------------------------------------");
        }
    }
}
