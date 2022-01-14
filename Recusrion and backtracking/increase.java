import java.util.*;
public class increase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the base number and the  maximum number");
        int n=in.nextInt();
        int x=in.nextInt();
        increase(n,x);


    }
    public static void increase(int n, int x)
    {
        if(n==x)
        {
            return;
        }
        System.out.println(n);
        increase(n+1, x);
    }
    
}
