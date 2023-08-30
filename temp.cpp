#include <iostream>
using namespace std;

int multiply(int x, int y) 
{
    return x*y;
}

double divide(int x, int y) 
{
    return static_cast<double>(x)/static_cast<double>(y);
}

int add(int x, int y) 
{
    return x+y;
}

int subtract(int x, int y) 
{
    return x-y;
}

int main() { 
    char op='c'; 
    int x, y;

    while(op!='e') 
    {
        cout << "What operation would you like to perform: add(+), subtract(-), divide(/), multiply(*), [e]xit?";
		cin >> op;
    	switch(op) 
        {
            case '+': // addition
                cout << "Enter first operand: ";
                cin >> x;
                cout << "Enter second operand: ";
                cin >> y;

                cout << x << "+" << y << "="
                << add(x,y) <<  endl; // fill in at blank        

                break; // fill in at blank
            case '-': // subtraction
                cout << "Enter first operand: ";
                cin >> x;
                cout << "Enter second operand: ";
                cin >> y;
                cout << x << "-" << y << "="
                << subtract(x,y) << endl; // fill in at blank

                break; // fill in at blank


            case '/': //division
                cout << "Enter first operand: ";
                cin >> x;
                cout << "Enter second operand: ";
                cin >> y;
                cout << x << "/" << y << "="
                << divide(x,y) << endl; // fill in at blank;

                break; // fill in at blank

            case '*': // multiplication
                cout << "Enter first operand: ";
                cin >> x;
                cout << "Enter second operand: ";
                cin >> y;
                cout << x << "*" << y << "="
                << multiply(x,y) << endl; // fill in at blank

                break; // fill in at blank


            default: // fill in at blank

		    cout << "Sorry, try again" << endl;
        }
    }

    return 0; // fill in at blank

}
