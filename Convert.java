package gr11;
import java.util.*;
class Convert
{
    public static String deciBin(long n)
    {
        String bin="";
        long a=n,c;
        if (a==0)
        {
            bin="0"+bin;
            a/=2;
        }
        while(a!=0)
        {
            if(a%2==0)
                bin="0"+bin;
            else
                bin="1"+bin;
            a/=2;
        }
        return bin;
    }

    public static long deciOct(long n)
    {
        long a=n,c;
        long oct=0;
        for(int i=1;a!=0;i*=10)
        {
            oct=(a%8)*i+oct;
            a/=8;
        }
        return oct;
    }

    public static String deciHexa(long n)
    {
        long a=n,c;
        String hexa="";
        if (a==0)
            hexa="0";
        while(a!=0)
        {
            long r=a%16;
            if (r>=0 && r<=9)
                hexa=String.valueOf(r)+hexa;
            else if (r==10)
                hexa="A"+hexa;
            else if (r==11)
                hexa="B"+hexa;
            else if (r==12)
                hexa="C"+hexa;
            else if (r==13)
                hexa="D"+hexa;
            else if (r==14)
                hexa="E"+hexa;
            else if (r==15)
                hexa="F"+hexa;
            a/=16;
        }
        return hexa;
    }

    public static long binDeci(String s)
    {
        long sum=0;
        for (int i=s.length()-1,j=0;i>=0 && j<=s.length()-1;--i,++j)
        {
            int temp=s.charAt(i)-48;
            sum+=temp*(long)Math.pow(2,j);
        }
        return sum;
    }

    public static long binOct(String s)
    {
        long sum=0,temp;
        while(s.length()%3!=0)
        {
            s="0"+s;
        }
        String s1="";
        for (int i=0,j=s.length()-1;j>=0;--j)
        {
            temp=s.charAt(j)-48;
            sum+=temp*(long)Math.pow(2,i);
            if (i==2)
            {
                s1=String.valueOf(sum)+s1;
                sum=0;
                i=0;
            }
            else
                ++i;

        }
        return Long.valueOf(s1);
    }

    public static String binHexa(String s)
    {
        long sum=0,temp;
        while(s.length()%4!=0)
        {
            s="0"+s;
        }
        String s1="";
        for (int i=0,j=s.length()-1;j>=0;--j)
        {
            temp=s.charAt(j)-48;
            sum+=temp*(long)Math.pow(2,i);
            if (i==3)
            {
                if (sum==10)
                    s1="A"+s1;
                else if(sum==11)
                    s1="B"+s1;
                else if(sum==12)
                    s1="C"+s1;
                else if(sum==13)
                    s1="D"+s1;
                else if(sum==14)
                    s1="E"+s1;
                else if(sum==15)
                    s1="F"+s1;
                else
                    s1=String.valueOf(sum)+s1;
                sum=0;
                i=0;
            }
            else
                ++i;

        }
        return s1;
    }

    public static long octDeci(long n)
    {
        long sum=0;
        String s=String.valueOf(n);
        for (int i=s.length()-1,j=0;i>=0 && j<=s.length()-1;--i,++j)
        {
            int temp=s.charAt(i)-48;
            sum+=temp*(long)Math.pow(8,j);
        }
        return Long.valueOf(sum);
    }

    public static String octBin(long n)
    {
        String bin="";
        long a=n,c;
        if (a==0)
            bin="0";
        while(a!=0)
        {
            int j=0;
            if (a%10==0)
            {
                bin="000"+bin;
                j=3;
            }
            c=a%10;

            for(;j<3;++j)
            {

                if(c%2==0)
                    bin="0"+bin;
                else
                    bin="1"+bin;
                c/=2;
            }
            a/=10;
        }
        return bin;
    }

    public static String octHexa(long n)
    {
        String s=String.valueOf(n);
        long sum=0;
        for (int i=s.length()-1,j=0;i>=0 && j<=s.length()-1;--i,++j)
        {
            int temp=s.charAt(i)-48;

            sum+=temp*(long)Math.pow(8,j);

        }

        String hexa="";
        if (sum==0)
            hexa="0";
        while(sum!=0)
        {
            long r=sum%16;
            if (r>=0 && r<=9)
                hexa=String.valueOf(r)+hexa;
            else if (r==10)
                hexa="A"+hexa;
            else if (r==11)
                hexa="B"+hexa;
            else if (r==12)
                hexa="C"+hexa;
            else if (r==13)
                hexa="D"+hexa;
            else if (r==14)
                hexa="E"+hexa;
            else if (r==15)
                hexa="F"+hexa;
            sum/=16;
        }
        return hexa;
    }

    public static String hexaBin(String s)
    {
        String arr[]=new String[s.length()];
        String bin="";
        for (int i=arr.length-1;i>=0;--i)
        {
            char a=s.charAt(i);

            if (a=='0')
            {
                bin="0000"+bin;
                continue;
            }
            else if (a=='A')
                bin="1010"+bin;
            else if (a=='B')
                bin="1011"+bin;
            else if (a=='C')
                bin="1100"+bin;
            else if (a=='D')
                bin="1101"+bin;
            else if (a=='E')
                bin="1110"+bin;
            else if (a=='F')
                bin="1111"+bin;
            else
            {
                int b=s.charAt(i)-48;
                while(b!=0)
                {
                    if(b%2==0)
                        bin="0"+bin;
                    else
                        bin="1"+bin;
                    b/=2;
                }
                while(bin.length()%4!=0)
                {
                    bin="0"+bin;
                }
            }

        }
        return bin;
    }

    public static long hexaDeci(String s)
    {
        long hexi=0;
        for (int i=s.length()-1,j=0;i>=0;--i,++j)
        {
            char ch=s.charAt(i);
            if (ch=='A')
                hexi+=10*(long)Math.pow(16,j);
            else if (ch=='B')
                hexi+=11*(long)Math.pow(16,j);
            else if (ch=='C')
                hexi+=12*(long)Math.pow(16,j);
            else if (ch=='D')
                hexi+=13*(long)Math.pow(16,j);
            else if (ch=='E')
                hexi+=14*(long)Math.pow(16,j);
            else if (ch=='F')
                hexi+=15*(long)Math.pow(16,j);
            else
                hexi+=(ch-48)*(long)Math.pow(16,j);
        }
        return hexi;
    }

    public static long hexaOct(String s)
    {
        String arr[]=new String[s.length()];
        String bin="";
        for (int i=arr.length-1;i>=0;--i)
        {
            char a=s.charAt(i);

            if (a=='0')
            {
                bin="0000"+bin;
                continue;
            }
            else if (a=='A')
                bin="1010"+bin;
            else if (a=='B')
                bin="1011"+bin;
            else if (a=='C')
                bin="1100"+bin;
            else if (a=='D')
                bin="1101"+bin;
            else if (a=='E')
                bin="1110"+bin;
            else if (a=='F')
                bin="1111"+bin;
            else
            {
                int b=s.charAt(i)-48;
                while(b!=0)
                {
                    if(b%2==0)
                        bin="0"+bin;
                    else
                        bin="1"+bin;
                    b/=2;
                }
                while(bin.length()%4!=0)
                {
                    bin="0"+bin;
                }
            }

        }
        long sum=0,temp;
        while(bin.length()%3!=0)
        {
            bin="0"+bin;
        }
        String s1="";
        for (int i=0,j=bin.length()-1;j>=0;--j)
        {
            temp=bin.charAt(j)-48;
            sum+=temp*(long)Math.pow(2,i);
            if (i==2)
            {
                s1=String.valueOf(sum)+s1;
                sum=0;
                i=0;
            }
            else
                ++i;

        }
        return Long.valueOf(s1);
    }

    public static String fracBinDeci(double n)
    {
        int left=(int)n;
        String right=String.valueOf(n).substring(String.valueOf(n).indexOf('.')+1);
        double s=binDeci(String.valueOf(left));
        double sum=0;
        for (int i=0,j=-1;i<right.length() && j>=(right.length()*-1);++i,--j)
        {
            sum+=(right.charAt(i)-48)*Math.pow(2,j);
            System.out.println("sum= "+sum);
        }
        return String.valueOf(s+sum);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner lg=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        int option1=0;
        char option2=' ';
        do
        {
            System.out.println("List of functions:-");
            System.out.println("1.deciBin");
            System.out.println("2.deciOct");   
            System.out.println("3.deciHexa");   
            System.out.println("4.binDeci");   
            System.out.println("5.binOct");   
            System.out.println("6.binHexa");   
            System.out.println("7.octDeci");   
            System.out.println("8.octBin");   
            System.out.println("9.octHexa");   
            System.out.println("10.hexaBin");   
            System.out.println("11.hexaDeci");   
            System.out.println("12.hexaOct");   
            System.out.println("Enter option");
            option1=sc.nextInt();
            if (option1==1)
            {
                System.out.println("Enter number");
                long n=lg.nextLong();
                System.out.println(deciBin(n));
            }
            else if (option1==2)
            {
                System.out.println("Enter number");
                long n=lg.nextLong();
                System.out.println(deciOct(n));
            }
            else if (option1==3)
            {
                System.out.println("Enter number");
                long n=lg.nextLong();
                System.out.println(deciHexa(n));
            }
            else if (option1==4)
            {
                System.out.println("Enter number");
                String n=str.nextLine();
                System.out.println(binDeci(n));
            }
            else if (option1==5)
            {
                System.out.println("Enter number");
                String n=str.nextLine();
                System.out.println(binOct(n));
            }
            else if (option1==6)
            {
                System.out.println("Enter number");
                String n=str.nextLine();
                System.out.println(binHexa(n));
            }
            else if (option1==7)
            {
                System.out.println("Enter number");
                long n=lg.nextLong();
                System.out.println(octDeci(n));
            }
            else if (option1==8)
            {
                System.out.println("Enter number");
                long n=lg.nextLong();
                System.out.println(octBin(n));
            }
            else if (option1==9)
            {
                System.out.println("Enter number");
                long n=lg.nextLong();
                System.out.println(octHexa(n));
            }
            else if (option1==10)
            {
                System.out.println("Enter number");
                String n=str.nextLine();
                System.out.println(hexaBin(n));
            }
            else if (option1==11)
            {
                System.out.println("Enter number");
                String n=str.nextLine();
                System.out.println(hexaDeci(n));
            }
            else if (option1==12)
            {
                System.out.println("Enter number");
                String n=str.nextLine();
                System.out.println(hexaOct(n));
            }
            else
            {
                System.out.println("Error! Please try again.");
            }
            System.out.println("Do you wish to continue?(Enter yes or no)");
            option2=str.nextLine().toLowerCase().charAt(0);
        }
        while(option2!='n');
    }
}
