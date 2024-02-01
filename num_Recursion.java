package gr11;
class num_Recursion
{
    public static long power(int x, int y)
    //A function that returns x raised to the power of y
    {
        if (y!=1)
            return x * power(x,--y);
        else
            return x * 1;
    }

    public static int factorial(int x)
    //A function that returns the factorial of the given number.
    {
        if (x!=0)
            return x * factorial(--x);
        else
            return 1;
    }

    public static int sumoffactors(int n, int f)
    //A function that returns the sum of the factors of the given number n, 
    //beginning from 2, where f=2
    {
        if (n%f==0 && f<=n)
            return f + sumoffactors(n,f+1);
        else if (n%f!=0 && f<=n)
            return sumoffactors(n,f+1);
        else
            return 0;
    }

    public static boolean prime(int n, int m)//m=2
    //A function that checks if the given number “n“ is a prime number, by 
    //checking if it has any factors starting from m, which is 2. The function
    //returns true if there are no factors and false otherwise.
    {
        if (n==0 || n==1)
            return false;
        else if (m<n)
        {
            if (n%m==0 && n!=2)
                return false;
            else if (n==2)
                return true;
            prime(n,++m);
        }
        return true;
    }

    public static int sumofdigits(int n)
    //A functions that returns the sum of the digits of n
    {
        if (n!=0)
            return (n%10)+sumofdigits(n/=10);
        else 
            return 0;
    }

    public static int hcf(int x, int y)
    //A function that returns the Highest Common Factor of x and y
    {
        if (y==0)
            return x;
        return hcf(y,x%y);
    }
    // public static int krish(int n)
    // //A function that returns the sum of the factorial of its digits.
    // //Hint: call the factorial function
        public static int krish(int n)
    {
        if(n==0)
            return 0;
        return factorial(n%10) + krish(n/10);
    }

    public static int fibo(int n) //nth term
    {

        if((n==1)||(n==2))
            return n-1;
        return fibo(n-1) + fibo(n-2);
    }
}

