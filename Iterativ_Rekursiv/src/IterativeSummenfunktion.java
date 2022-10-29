public class IterativeSummenfunktion {

    static long sum(int n){
        long summe = 0;
        for(int i=0; i<n; i++){
            summe += i;
        }
        return summe;
    }
}


