#include <iostream>
#include <cmath>
using namespace std;


/*int cubeIt(int num)
{
    return pow(num,3);
}*/

int cubeIt(const int &num)
{
    return pow(*&num,3);
}

int cubeIt(int *num)
{
    return pow(*num,3);
}

int main()
{
    int x=10;
    //cout << "return from cubeIt(int) = " << cubeIt(x) << endl;
    cout << "return from cubeIt(const int &) = " << cubeIt(&x) << endl;
    cout << "return value from cubeIt(int *) = " << cubeIt(x) << endl;
    return 0;
}
