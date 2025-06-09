import java.util.*;
public class ZeroCount {
    static int countZero(String s)
    {
        int c=0;
        int z=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                c=c+z;
            }
            else
            {
                z++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result=countZero(s);
        System.out.println(result);
    }
    
}
