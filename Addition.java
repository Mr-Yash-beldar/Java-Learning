import java.util.Scanner;
//Author--Yashodip Beldar
//Date--12.09.2022
//Purpose--Addition of two numbers in Java by Taking User input

class Addition {
     public static void main(String[] args) {
     System.out.println("\nHi My Name is Yash\n");
     Scanner input= new Scanner(System.in);
     System.out.println("Enter First number :");
     int a;
     a=input.nextInt();
     int b;
     System.out.println("Enter Second number :");
     b=input.nextInt();
     System.out.print("The Sum Of Numbers is : ");
     int c;
     c=a+b;
     System.out.println(c);
     input.close();
    }

}
