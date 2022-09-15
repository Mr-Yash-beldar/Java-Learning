import java.util.Scanner;

//Author--Yashodip Beldar
//Date--13.09.2022
//Purpose--Addition of three numbers in java

public class Three_sum {
    public static void main(String[] args) {
        System.out.println("\n Hi My name is Yashodip Beldar\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Integer Numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = a + b + c;
        System.out.println("The sum of these numbers is " + d);
    }

}
