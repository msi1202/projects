package gr11;
import java.util.*;
public class main_Myarray
{

    int N[];
    int len;

    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter n number of elements");
        int n=sc.nextInt();
        Myarray obj1=new Myarray(n);

        System.out.println("Enter the number of elements in integer array m");
        int n1=sc.nextInt();
        int []m= new int[n1];
        System.out.println("Enter the elements in integer array m");
        for(int i=0;i<m.length;i++)

            m[i]=sc.nextInt();
        Myarray obj2=new Myarray(m);

        Myarray obj3=new Myarray(obj2);
        Myarray obj4=new Myarray();
        obj1.Display();
        System.out.println("Enter the mth location and nth location");
        int o=sc.nextInt();
        int u=sc.nextInt();
        obj1.Display(o,u);
        System.out.println("Enter 0 for sorting the array in ascending order or 1 for descending order");
        int a=sc.nextInt();
        obj1.Bsort(a);
        System.out.println("Enter 0 for sorting the array in ascending order or 1 for descending order");
        int f=sc.nextInt();
        obj1.Selsort(f);
        System.out.println("Enter 0 for sorting the array in ascending order or 1 for descending order");
        int h=sc.nextInt();
        obj1.Ins_sort(h);
        System.out.println("Enter the elment to be search");
        int t=sc.nextInt();
        System.out.println(obj1.Bsearch(t));
        System.out.println("Enter the number of elements in integer array o");
        int o1=sc.nextInt();
        int []w= new int[o1];
        System.out.println("Enter the elements in integer array o");
        for(int i=0;i<w.length;i++)

            w[i]=sc.nextInt();
        obj1.Acopy(w);
        System.out.println(obj1.equals(obj2));
        int k[]=obj1.Intersect(obj2).N;
        for (int i=0;i<k.length;i++)
        {
            System.out.println(k[i]);
        }
        int mer[]=obj1.Merge(obj2).N;
        for (int i=0;i<mer.length;i++)
        {
            System.out.println(mer[i]);
        }

    }
}