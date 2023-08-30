#include <iostream>
#include <iomanip>
using namespace std;

void arrayPointers(double arr[], const double * pntr);

int main()
{
    double myarray[20]={0.};
    double *pA=&myarray[0]; //pointer to array

    cout << "Value of initialized values of pA = " << pA << endl;
    cout << "Value of initialized value of myarray = " << myarray << endl;
    cout << endl;
    arrayPointers(myarray, pA); //Calling of function

    return 0;
}

void arrayPointers(double arr[], const double * pntr)
{
    cout << "Store values by array index references" << endl;
    
    cout << setw(20) << "Index" << fixed
         << setw(20) << setprecision(10) << "Value in myarray"
         << setw(20) << "Address of elements in myarray" << endl; 
    
    //The following for loop is storing values into the 
    //and displaying them along with their memory address using
    //array indexing and usage of the reference operator '&' 
    for (int i=0;i<20;++i)
    {
        arr[i]=i;
        cout << setw(20) << i << fixed
         << setw(20) << setprecision(10) << arr[i]
         << setw(20) << &arr[i] << endl; 
    }

    cout << endl;

    cout << "Store values by array index references" << endl;

    cout << setw(20) << "Index" << fixed
         << setw(20) << setprecision(10) << "Value obtained by deferencing pointer"
         << setw(20) << "Value of pointer" << endl; 

    //The following for loop is used to display values by
    //using the deferencing operator '*' and displaying their 
    //memory address using the pointer variable
    for (int i=0; i<20; ++i)
    {
        cout << setw(20) << i << fixed
         << setw(20) << setprecision(10) << *(pntr+i)
         << setw(20) << (pntr+i) << endl; 
    }
}
