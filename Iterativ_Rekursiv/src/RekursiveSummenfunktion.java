public class RekursiveSummenfunktion {

    static long sum2(int n){

        if(n>=0)
        {
            return n+sum2(n-1);
        }
        else
        {
            return 0;
        }
    }

    static long sum(int n){
        n -= 1;
        return sum2(n);
    }

}
