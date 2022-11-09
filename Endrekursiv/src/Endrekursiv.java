public class Endrekursiv {
    public static void main(String[] args) {

        System.out.println(endrekursion(4));
    }
    public static int endrekursion(int n){
        return endrekursion2(1, n);
    }

    public static int endrekursion2(int m, int n) {
        if (n == 0) {
            return m;
        }else {
            return endrekursion2(m * n, n - 1);
        }
    }
}
