//Author--Yashodip Beldar
//Date--19-14-2022
//Purpose--Methods in java
import java.util.Scanner;
public class LearnMethods{
    String nam;
    Scanner sc=new Scanner(System.in);
     void nameDalo()
    {
        System.out.println("Enter your good name: ");
         nam=sc.nextLine();
    }
     void myname()
    {
        System.out.println("Hello "+nam+" I am Your Marvel");
    }

    public static void main(String[] args) {
        LearnMethods name=new LearnMethods();
        name.nameDalo();
        System.out.println();
        name.myname();       
    }
}