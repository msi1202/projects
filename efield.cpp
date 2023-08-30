#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

//Global variable declaration and intializations
 const double& Q=1.e-9;
 const double& k_e=9*pow(10,9);
 const double& r_min=0;
 const double& r_max=100;

 double Efield(double r, const double &a=50)
 {

    if (r<a)
        return k_e*Q*(r/pow(a,3));
    else
        return (k_e*Q)/pow(r,2);
 }

 int main()
 {
    cout << "Total Charge in Sphere, " << Q << "C" << endl;
    cout << "Radius of Sphere, a = 50 m" << endl;
    cout << "r, m" << setw(10) << "E, N/C" << endl;
    int n=static_cast<int>(r_max)-static_cast<int>(r_min)+1;
    for (int i=0;i<=n;++i)
    {
        cout << i << setw(15) << Efield(i) << endl;
    }
    return 0;
 }