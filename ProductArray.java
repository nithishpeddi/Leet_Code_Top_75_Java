import java.util.Arrays;

public class ProductArray {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr1 = { -1, 1, 0, -3, 3 };
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int product = 1;
            for (int j = 0; j < arr1.length; j++) {
                if (i == j) {
                    continue;
                }
                product *= arr1[j];
            }
            result[i] = product;
        }
        System.out.println("Product result" + Arrays.toString(result));
    }
}
