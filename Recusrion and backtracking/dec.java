
import java.util.*;
public class dec {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int n=in.nextInt();
        printdecreasing(n);

    }
    public static void printdecreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printdecreasing(n-1);
    }
    
}
