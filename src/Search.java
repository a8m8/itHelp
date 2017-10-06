import java.util.Arrays;
import java.util.Random;

public class Search {

    private int [] intArray;

    public int[] getIntArray() {
        return this.intArray;
    }

    Search(int i)  {
        this.intArray = init(i);
    }

    private int[] init(int i) throws  NegativeArraySizeException {
        int [] array = new int [i];
        for (int j=0; j < array.length - 1; j++) {
            array[j] = new Random().nextInt(Integer.MAX_VALUE);
        }
        Arrays.sort(array);
        return array;
    }

    public boolean binarySearch(int[] intArray, int value) {
        if (intArray == null) {
            System.out.println("Enter not null value");
            return false;
        }
        int n = intArray.length / 2;
        while (true) {
            if (n >= intArray.length) {
                return false;
            }
            if (value <= intArray[n]) {
                if (value == intArray[n]) {
                    System.out.println(n);
                    return true;
                }
                if (n==0) {
                    return  false;
                }

/*                if (n % 2 !=0) {
                    n = n/2+1;
                } else {*/
                //               n = n / 2;
//                }
            } else if (value >= intArray[n]) {
                n = n+n/2;
            }

        }
    }
}