import java.util.*;

//Date--5-09-2022
//Purpose--Sum of floating numbers using array.

public class FloatArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = scan.nextInt();
        System.out.printf("Enter %d float numbers :\n", n);
        float[] num;
        num = new float[10];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextFloat();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }
        System.out.printf("The sum of %d float numbers is %.2f ", n, sum);
        scan.close();
    }
}
