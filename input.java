import java.util.*;

//Date--17.09.2022
//Purpose-- Java Program to Take User input

public class input {
    public static void main(String[] args)
    {
    int a;
    double b;
    Scanner input= new Scanner(System.in);
    a=input.nextInt();
    b=input.nextDouble();
    String c=input.nextLine();
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
    input.close();
}
}