import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter number of lines"); 
        n=scan.nextInt();
        while(n!=0) {
            for (int i = 1; i <= n; i++)
            {
                System.out.print("*");
            }
                n--;
                System.out.print("\n");
        }
        scan.close();
    }
}
