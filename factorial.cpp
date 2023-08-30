#include <iostream>
using namespace std;

int factorial(const int &num)
{
    if (num<0)
        return -1;
    if (num==0 || num==1)
        return 1;
    int product=1;
    for (int i=1;i<=num;++i)
        product*=i;
    return product;

}

int main()
{
    int factorialValue=factorial(-1);
    if (factorialValue==-1)
    {
        cout << "Error: factorial value for negative number is not defined" << endl;
        return 1;
    }
    cout << "Factorial: " << factorialValue << endl;    
}