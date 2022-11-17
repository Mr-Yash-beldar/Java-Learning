import java.util.*;

//Author--Yashodip Beldar
//Date--17-09-2022
//Purpose--Using array in java

public class array_in_java {
    public static void main(String[] args) {
        System.out.println("\nHi My name is Yashodip Beldar\n");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter limit of array");
        n = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of array are as follows");
        for(int i=0;i<n;i++)
        {
           System.out.println(arr[i]);
        }
    }
}