package gr11;
import java.util.*;
class TWOD_ARRAY
{
    private int M[][];
    private int m,n;
    public TWOD_ARRAY()
    {
        this.m=this.n=0;
        this.M=null;
    }

    public TWOD_ARRAY (int r, int c)
    {
        this.m=r;
        this.n=c;
        this.M=new int[this.m][this.n];
    }

    public void accept()
    {
        Scanner sc=new Scanner (System.in);
        int rows=0,columns=0;
        if (M==null)
        {
            System.out.println("Enter no. of rows");
            rows=sc.nextInt();
            System.out.println("Enter no. of columns");
            columns=sc.nextInt();
            M=new int[rows][columns];
        }
        for (int i=0;i<M.length;++i)
        {   
            for (int j=0;j<M[i].length;++j)
            {
                M[i][j]=sc.nextInt();
            }
        }
    }

    public void display()
    {
        for (int i=0;i<M.length;++i)
        {   
            String k="";
            for (int j=0;j<M[i].length;++j)
            {
                k=M[i][j]+" ";
            }
            System.out.println(k);
        }
    }

    public int maxnum()
    {
        int max=0;
        for (int i=0;i<M.length;++i)
        {   
            for (int j=0;j<M[i].length;++j)
            {
                if (M[i][j]>max)
                    max=M[i][j];
            }
        }
        return max;
    }

    public int minnum()
    {
        int min=M[0][0];
        for (int i=0;i<M.length;++i)
        {   
            for (int j=1;j<M[i].length;++j)
            {
                if (M[i][j]<min)
                    min=M[i][j];
            }
        }
        return min;
    }

    public void Search(int x)
    {
        boolean chk=false;
        for (int i=0;i<M.length;++i)
        {   
            for (int j=0;j<M[i].length;++j)
            {
                if (x==M[i][j])
                {
                    chk=true;
                    System.out.println(x+" found in row no."+i+" and column no."+j);
                }
            }
        } 
        if (chk==false)
        System.out.println("Number not found");
    }

    public int leftdiag()
    {
        int l_diag=0;
        for (int i=0,x=0,y=n-1;i<M.length;++i,++x,--y)
        {
            for (int j=0;j<M.length;++j)
            {
                if (i==j)
                    l_diag+=M[i][j];
            }
        }
        return l_diag;
    }

    public int rightdiag()
    {
        int r_diag=0;
        for (int i=0,x=0,y=n-1;i<M.length;++i,++x,--y)
        {
            for (int j=0;j<M.length;++j)
            {
            }
            r_diag+=M[x][y];
        }
        return r_diag;
    }

    public TWOD_ARRAY Trans()
    {

        TWOD_ARRAY obj= new TWOD_ARRAY (this.m,this.n);
        for(int i=0;i < this.M.length;i++)
        {
            for(int j=0; j< this.M[i].length;j++)
            {
                obj.M[i][j]= this.M[j][i];
            }
        }
        return obj;
    }

    public void add(TWOD_ARRAY N1, TWOD_ARRAY N2)
    {
        if (N1.m==N2.m && N1.n==N2.n)
        {
            for (int i=0;i<this.M.length;++i)
            {   
                for (int j=0;j<this.M[i].length;++j)
                {
                    this.M[i][j]=N1.M[i][j]+N2.M[i][j];
                }
            } 
        }
        else
            System.out.println("Rows or/and columns are not equal");
    }

    public TWOD_ARRAY subtract(TWOD_ARRAY N2)
    {
        TWOD_ARRAY obj= new TWOD_ARRAY (this.m,this.n);
        if(this.m==N2.m && this.n == N2.n)
        {
            for(int i=0; i< N2.M.length;i++)
            {
                for(int j=0; j<N2.M[i].length;j++)
                {
                    obj.M[i][j]=this.M[i][j]- N2.M[i][j];
                }
            }
        }
        else
        {
            System.out.println("Rows and columns in the 2 objects must be equal");
        }
        return obj;
    }

    public TWOD_ARRAY multiply(TWOD_ARRAY N2)
    {
        TWOD_ARRAY obj=new TWOD_ARRAY (this.m ,N2.n);

        if(this.n == N2.m)
        {

            int a=0,b=0;
            for(int i=0; i < this.M.length;i++)
            {
                for(int x=0;x< N2.M.length;x++)
                {
                    int s=0;
                    int f=0;
                    for ( int y=0; y< N2.M[x].length;y++,f++)
                    {
                        s+= this. M[i][f]* N2.M[y][x];
                    }
                    if(b>obj.n-1){
                        a++; b=0;
                        obj.M[a][b]=s;
                    }
                    else
                        obj.M[a][b++]=s;
                }
            }

        }
        else
            System.out.println("Number of rows in 1st matrix must be equal to number of columns in 2nd matrix");
        return obj;
    }
     public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows and Columns for 1st Matrix");
        int r= sc.nextInt();
        int c=sc.nextInt();
        TWOD_ARRAY obj1= new TWOD_ARRAY(r,c);
        System.out.println("Enter Number of Rows and Columns for 2nd Matrix");
        r= sc.nextInt();
        c=sc.nextInt();
        TWOD_ARRAY obj2= new TWOD_ARRAY(r,c);

        obj1.accept();
        obj2.accept();
        obj1.display();
        System.out.println(obj1.maxnum());
        System.out.println(obj1.minnum());
        System.out.println("Enter a number you want to search in the 1st Matrix");
        int x= sc.nextInt();
        obj1.Search(x);
        System.out.println(obj1.leftdiag());
        System.out.println(obj1.rightdiag());
        TWOD_ARRAY obj3= obj1.Trans();
        obj3.add(obj1,obj2);
        obj3 = obj1.subtract(obj2);
        obj3 = obj1.multiply(obj2);
    }
}