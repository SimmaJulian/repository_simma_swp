public class Main {
    public static void main(String[] args) {

        IterativeSummenfunktion is = new IterativeSummenfunktion();
        long sIterativ = is.sum(6);
        System.out.println(sIterativ);

        RekursiveSummenfunktion  rs = new RekursiveSummenfunktion();
        long sRekursiv = rs.sum(6);
        System.out.println(sRekursiv);
    }
}