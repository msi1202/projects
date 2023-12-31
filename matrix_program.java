package gr12;
import java.util.*;
public class matrix_program
{
    int A[][];
    public matrix_program()
    {
        A=new int[0][0];
    }

    public matrix_program(int len)
    {
        if (len>2 && len<21)
            A=new int[len][len];
    }
    public matrix_program(int arr[][])
    {
        this.A=arr;
    }
    public void option1()
    {
        int val=2;
        for(int i =0;i<this.A.length;++i)
        {
            for(int j =0;j<this.A.length;)
            {
                int count=0;
                for (int a=1;a<val;++a)
                {
                    if (val%a==0)
                        ++count;
                }
                if (count==1)
                {
                    this.A[i][j]=val;
                    ++j;
                }
                ++val;
            }
        }
    }
    
    public void display()
    {
       for(int i =0;i<this.A.length;++i)
       {
            String k="";
            for(int j =0;j<this.A.length;++j)
            k+=this.A[i][j]+" ";
            System.out.println(k.trim());
       }
    }
    
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");
        for(int i =0;i<this.A.length;++i)
        {
            for(int j =0;j<this.A.length;++j)
            this.A[i][j]=sc.nextInt();
        }
    }
    public int[][] option3()
    {
        int arr[][]=new int[this.A.length][this.A.length];
        for(int i =0;i<this.A.length;++i)
        {
            for(int j =0;j<this.A.length;++j)
            {
                if (j==i)
                arr[i][j]=0;
                else
                arr[i][j]=this.A[i][j];
            }
        }
        return arr;  
    }
    public void option4()
    {
        int a=this.A.length-1;
        for(int i =0;i<this.A.length;++i)
        {
            String k="";
            for(int j =0;j<this.A.length;++j)
            {
                if (j<a)
                k+=" "+this.A[i][j];
                else
                k+=" "+"0";
            }
            System.out.println(k.trim());
            --a;
        }
    }
    public void option5()
    {
       for (int i=0,j=0;i<this.A.length;++i,j=i)
        {
            for (;j<this.A.length;++j)
            {
               int temp=A[i][j];
               A[i][j]=A[j][i];
               A[j][i]=temp;
            }
        } 
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner ab=new Scanner(System.in);
        char option=' ';
        int choice=0;
        System.out.println("Enter dimension for square matrix");
        int N=sc.nextInt();
        matrix_program obj1=new matrix_program(N);
        do
        {
           System.out.println("1.Fill the matrix with prime numbers from 1 to N^2 ");
           System.out.println("2.Display the input matrix "); 
           System.out.println("3.Store the numbers on either side of the Left Diagonal"); 
           System.out.println("(principal diagonal) in another matrix and display the same as shobwn below.  "); 
           System.out.println("4.Display the numbers above the right diagonal, the numbers on the top left hand corner ."); 
           System.out.println("5.Transpose the matrix in place without creating a second matrix and display it. "); 
           System.out.println("6.Exit");
           System.out.println("Enter choice");
           choice=sc.nextInt();
           switch (choice)
           {
               case 1:
               obj1.option1();
               break;
               case 2:
               obj1.display();
               break;
               case 3:
               int arr[][]=obj1.option3();
               matrix_program obj2=new matrix_program(arr);
               obj2.display();
               break;
               case 4:
               obj1.option4();
               break;
               case 5:
               obj1.option5();
               obj1.display();
               break;
               case 6:
               System.exit(0);
               break;
               default:
               System.out.println("Error! Incorrect choice");
               break;
           }
           System.out.println("To continue type yes otherwise type no");
           option=Character.toLowerCase(ab.nextLine().charAt(0));
        }
        while(option=='y');
    }
}