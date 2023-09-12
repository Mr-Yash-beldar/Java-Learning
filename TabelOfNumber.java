import java.util.*;

//Date--03-09-2022
//Purpose--multiplication tabel of any number

public class TabelOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dx%d = %d\n", i, n, (i * n));
        }
        scan.close();
    }
}
