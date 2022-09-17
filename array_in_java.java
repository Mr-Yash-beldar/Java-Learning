import java.util.Scanner;

//Author--Yashodip Beldar
//Date--17-09-2022
//Purpose--Using array in java

public class array_in_java {
    public static void main(String[] args) {
        System.out.println("\nHi My name is Yashodip Beldar\n");
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter limit of array");
        n = input.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Elements of array are as follows");
        for(int i=0;i<n;i++)
        {
           System.out.println(arr[i]);
        }
    }
}