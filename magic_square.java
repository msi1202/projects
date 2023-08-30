package gr12;
import java.util.*;
class magic_square
{
    public static void main()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n for a square matrix");
        int n=sc.nextInt();
        if (n%2==0)
            System.out.println("Error! Please enter an odd number");
        else
        {
            int arr[][]=new int[n][n];
            int Z=1,a=0,b=n/2;
            arr[a][b]=Z;
            while (++Z<=(n*n))
            {
                --a;
                ++b;
                if (a<0 && b!=n)
                {
                    a=n-1;
                }
                else if(a>=0 && b==n)
                {
                    b=0;
                }
                else if((a<0 && b==n) || arr[a][b]!=0)
                {
                    a+=2;
                    --b;
                }
                arr[a][b]=Z;
            }
            for (int i=0;i<arr.length;++i)
            {
                String k="";
                for (int j=0;j<arr.length;++j)
                k+=arr[i][j]+"\t";
                System.out.println(k.trim());
            }
        }
    }
}