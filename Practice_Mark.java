import java.util.Scanner;

class Practice_Mark {
    public static void main(String[] args) {
        System.out.println("\nPercentage of marks by Java\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total marks of each Subject");
        // int tm;
        // tm=input.nextInt();
        float s1, s2, s3, s4, s5, total, per;
        System.out.println("Enter marks of five subjects ");
        s1 = input.nextFloat();
        s2 = input.nextFloat();
        s3 = input.nextFloat();
        s4 = input.nextFloat();
        s5 = input.nextFloat();
        total = s1 + s2 + s3 + s4 + s5;
        per = total / 5;
        System.out.println("Your Percentage is :  ");
        System.out.println(per);
        input.close();
    }
}