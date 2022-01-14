import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int result= fact(n);
        System.out.println(result);
    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int result=n*fact(n-1);
         
        return result;

    }
    
}
