#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main(){
    //Declaring variables
    double verDist,walk_s,walk_d;
    double time1, time2, time_diff;
    const double epsilon =0.01;
    const double cD=0.0012;
    const int g=32;
    int k;

    //Accepting inputs
    cout << "How far away is your friend(feet)? " << endl;
    cin >> verDist;
    cout << "How fast are they walking(feet/sec)? " << endl;
    cin >> walk_s;
    cout << "How high are you before dropping your balloon(feet)? " << endl;
    cin >> walk_d;

    time1=walk_d/walk_s;
    double vk,p_vk=0.0, xk,p_xk=0.0;
    for (k=0;!(xk>=verDist);++k)
    {
        vk=p_vk-(cD*p_vk-g)*0.001;
        xk=p_xk+vk*0.001;

        //Updating the v and x value
        p_vk=vk;
        p_xk=xk;
    }
    
    //Calculating time for friend to reach the point
    time2=xk/vk;

    //Calculating time difference;
    time_diff=fabs(time1-time2);

    cout << setprecision(2);
    cout << "It will take " << time1 << " seconds for them to reach the balloon point" << endl;
    cout << "It will take " << time2 << " seconds for your balloon to travel to the ground" << endl;


    if (time_diff<=epsilon)
        cout << "Bingo, you hit your friend successfully" << endl;
    else if (time1>time2)
        cout << "If you wait " << time_diff << " seconds, you will hit them" << endl;
    else
        cout << "It is too late to drop your balloon" << endl;

    return 0;
}