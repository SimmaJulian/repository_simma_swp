public class ddsf {

    int binarySearch(char[] array, int x) {

        int low =0;
        int high = array.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        ddsf ob = new ddsf();
        char[] array = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        char x = 'e';
        int result = ob.binarySearch(array, x);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}