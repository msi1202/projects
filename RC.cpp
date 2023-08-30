#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

double f=60;
double Vo=120;
double R=1000;
double C=1.e-6;
double nstep=20;
const double pi=3.14159265;

double TotalCurrent(double t)
{
    return ((Vo/R)/sqrt(1+pow((1/(2*pi*f*R*C)),2)))*sin((2*pi*t)-atan(-1/(R*C*2*pi*f)));
}

double ResistorVoltage(double t)
{
    R*TotalCurrent(t);
}

double CapacitorVoltage(double t);
{
    return ((-1*((Vo/R)/sqrt(1+pow((1/(2*pi*f*R*C)),2))))/(C*2*pi*f))*cos((2*pi*t)-atan(-1/(R*C*2*pi*f)));
}

int main()
{
    cout << "Enter the applied voltage amplitude(V): " << endl;
    cin >> Vo;
    cout << "Enter the AC line frequency(hertz or Hz): " << endl;
    cin >> f;
    cout << "Enter the Resistor Value(ohms): " << endl;
    cin >> R;
    cout << "Enter the Capacitor Value(Farads): " << endl;
    cin >> C;
    cout << "#pts/AC period: " << endl;
    cin >> nstep;

    double T=1.0/f;
    double delta_t=T/nstep;
    cout << "k \tt_k \tI \tV_i \tV_R \tV_C \tKVL" << endl;
    for (int k=0;k<=nstep;++k)
    {
        double t_k=(k-1)*delta_t;
        double V_i=Vo*sin(2*pi*f*t_k);
        double I = TotalCurrent(t_k);
        double V_R = ResistorVoltage(t_k);
        double V_C = CapacitorVoltage(t_k);
        double KVL = V_i - V_R - V_C;
    
        cout << k << "\t" << setprecision(3) 
            << t_k << "\t" << setprecision(3)
             << V_i << "\t" << setprecision(3)
             << I << "\t" << setprecision(3) 
             << V_R << "\t" << setprecision(3) 
             << V_C << "\t" << setprecision(3) 
             << KVL << endl;
    }

    return 0;
}

