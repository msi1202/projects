#include <iostream>
#include <ctime>
#include <iomanip>
#include <cstdlib>
using namespace std;

int main()
{
    int d1,d2,sum;
    time_t seed=time(0);
    srand(seed);

    bool again;

    do
    {
        d1=rand()%6 + 1;
        d2=rand()%6 + 1;
        sum=d1+d2;

        cout << "Die 1: " << d1 << "\t" << "Die 2: " << d2 << "\t" << "Total: " << sum << endl;
        if (sum==7 || sum==9 || sum==11)
        {
            cout << "You're a WINNER!" << endl;
            cout << "Game over." << endl;
            break;
        }
        else if (sum==2 || sum==3 || sum==5)
        {
            cout << "You LOST!!" << endl;
            cout << "Game over." << endl;
            break;
        }
        else
        {
            cout << "Lets's roll again...\n" << endl;
            again=true;
        }
    } while (again);
    
    return 0;
}
    

    