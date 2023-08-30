#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    //Declaring variables
    int i,copy,nrows,x,a,step,exponent;
    double l_10,l_2,l_e;

    //Accepting the number of rows
    cout << "Enter the number of table rows: ";
    cin >> nrows;

    cout << "x" << setw(10) << "log10(x)" << setw(10)<< "log2(x)" << setw(10)<< "ln(x)" << endl;
    //Generating log table  
    x=1;
    for (i=1;i<=nrows;++i)
    {
        exponent=log10(x);
        step=pow(10,exponent);
        l_10=log10(x);
        l_2=log2(x);
        l_e=log(x);
        cout << x << setw(10) << l_10 << setw(10) << l_2 << setw(10) << l_e << endl;
        x+=step;
    }
   return 0; 
}