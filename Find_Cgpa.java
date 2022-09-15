import java.util.Scanner;

//Author--Yashodip Beldar
//Date--13.09.2022
//Purpose--To find CGPA of subjects.
class Find_Cgpa {
    public static void main(String[] args) {
        System.out.println("\nHi My is Yashodip Beldar.\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 Subject");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = sc.nextInt();
        float e = sc.nextInt();
        // float f = sc.nextInt();
        float cgpa = (a + b + c + d + e ) / 50;
        System.out.println("Your CGPA is "+cgpa);

    }
}