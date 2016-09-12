import java.util.Scanner;

/**
 * Created by santca on 2016/9/9.
 */
public class java8 {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 8, 4, 6, 2};
        int temp = 0;
        for (int index = 0; index < intArray.length; index++) {
            for (int index1 = index + 1; index1 < intArray.length; index1++) {
                if (intArray[index] > intArray[index1]) {
                    temp = intArray[index];
                    intArray[index] = intArray[index1];
                    intArray[index1] = temp;
                }
            }
        }
        for (int i = 0;i < intArray.length;i++) {
            System.out.print(intArray[i]);
        }
    }
}
