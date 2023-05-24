package Umschlaege;

public class UmschlaegeFactory {
    public static Briefumschlaege getUmschläge(String type, String groesse, double gewicht){
        if("Umschlaege.A4".equalsIgnoreCase(type)){
            return new A4(groesse, gewicht);
        }else if("Umschlaege.A5".equalsIgnoreCase(type)){
            return new A4(groesse, gewicht);
        }else if("Umschlaege.A6".equalsIgnoreCase(type)){
            return new A4(groesse, gewicht);
        }
        return null;
    }
}
