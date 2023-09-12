import java.util.*;
public class loops {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int [] marks = new int[10];
    for(int i=0;i<5;i++)
    {
        marks[i]=scan.nextInt();
    }
    // for(int element:marks)
    // {
    //     element=scan.nextInt();
    // }
    for(int element:marks)
    {
        System.out.println(element);
    }
    scan.close();
}  
}
