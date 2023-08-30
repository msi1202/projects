package gr12;
import java.util.*;
class special_charcter_matrix
{
    
    public static void fillingCharacters(char arr[][], char char_1, char char_2, char char_3)
    {
        for (int i=0;i<arr.length;++i)
        {
            for (int j=0;j<arr.length;++j)
            {
                if (j==i || (i+j)==(arr.length-1))
                arr[i][j]=char_3;
            }
        }
        for (int i=0;i<arr.length;++i)
        {
            char temp[]=arr[i];
                String s=String.valueOf(temp);
                int first=s.indexOf(char_3);
                int last=s.lastIndexOf(char_3);
            for (int j=0;j<arr.length;++j)
            {
                
                if (j>first && j<last)
                arr[i][j]=char_1;
                else if(j!=first && j!=last)
                arr[i][j]=char_2;
            }
        }
    }
    public static void display(char arr[][])
    {
        for (int i=0;i<arr.length;++i)
        {
            String k="";
            for (int j=0;j<arr.length;++j)
            {
               k+=arr[i][j]+" "; 
            }
            System.out.println(k);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimension for a square matrix");
        int n=sc.nextInt();
        char array[][]=new char[n][n];
        if (n>10)
        {
        System.out.println("Error! Maximum possible size for array is 10");
        System.exit(0);
    }
        System.out.println("Enter character 1");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter character 2");
        char ch2=sc.next().charAt(0);
        System.out.println("Enter character 3");
        char ch3=sc.next().charAt(0);
        fillingCharacters(array,ch1,ch2,ch3);
        display(array);
    }
}