
import java.util.Scanner;

//Date--03-09-2022
//Purpose--printing sum of n even numbers

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = scan.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            if (i % 2 == 0)
                sum += i;
                i++;
        }
        System.out.printf("The sum of %d even numbers is %d", n, sum);
        scan.close();
    }
}
