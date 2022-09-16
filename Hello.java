import java.util.Scanner;
//Author--Yashodip Beldar
//Date--14-09-2022
//Purpose--Greeting program in java
public class Hello {
        public static void main(String[] args) {
        System.out.println("\nHi My name is Yashodip Beldar\n");
        System.out.println("What is your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello! "+name+ ", Have a good day.");
    }    
}
