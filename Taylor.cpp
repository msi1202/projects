#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

//Defining global variables
const double &PI=22.0/7.0;
const double &TOL=1.e-6;
const size_t &WIDTH=5;
const size_t &PREC=4;

double factorial(const int &num)
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

double degreesToRadians(const double &angle_deg)
{
    return angle_deg*(PI/180);
}

double mySine(const double& x, int i, double &result)
{
    result=pow(x,((2*i)-1))/(1.0*factorial(((2*i)-1)));
    double sum_old=0;
    double sum_new=0;
    int k=1;
    while ((fabs(sum_new-sum_old) <= TOL)==false)
    {
        //result=pow(x,((2*i)-1))/factorial(((2*i)-1));
        sum_old=sum_new;
        double term=pow(x,((2*k)-1))/(1.0*factorial(((2*k)-1)));
        if (k%2==0)
            term*=-1;
        sum_new+=term;
        ++k;
    }
    return sum_new;
}

double myCosine(const double& x, int i, double &result)
{
    result=pow(x,((2*i)-2))/(1.0*factorial(((2*i)-2)));
    double sum_old=0;
    double sum_new=0;
    int k=1;
    while ((fabs(sum_new-sum_old) <= TOL)==false)
    {
        sum_old=sum_new;
        double term=pow(x,((2*k)-2))/(1.0*factorial((2*k)-2));
        if (k%2==0)
            term*=-1;
        sum_new+=term;
        ++k;
    }
    return sum_new;
}

int main()
{
    cout << fixed << setw(WIDTH);
    cout << "Degrees";
    cout << "    " << "Radians";
    cout << "    " << "sin()";
    cout << "    " << "cos()" << endl; 
    for (int i=-45;i<=540;i+=15)
    {
        double seriesTerm=0;
        double angle=degreesToRadians(i);
        double sineValue = mySine(angle, 3, seriesTerm);
        double cosineValue = mySine(angle, 3, seriesTerm);
        cout << i;
        cout << "    " << angle;
        cout << "    " << sineValue;
        cout << "    " << cosineValue;
        cout << endl;
    }
    return 0;
}