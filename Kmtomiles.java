import java.util.Scanner;

//Author--Yashodip Beldar
//Date--16-09-2022
//Purpose--Covert Kilometer to miles

public class Kmtomiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nHi My name is Yashodip Beldar\n");
        System.out.println("Enter Distance in KM to convert in mile");
        float km,mile;
        km=sc.nextFloat();
        mile=km*0.621f;
        System.out.println(km+" KM is equal to "+mile+ " Miles");
        sc.close();
    }
}
