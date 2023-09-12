import java.util.*;
class Example{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        while(n>=1){
            if(n%2==0){
                n=n/2;
                sum=sum+n;
            }
            else{
                n=(n/2)+1;
                sum=sum+n;
            }

        }
        System.out.println(sum);
        sc.close();
    }
}