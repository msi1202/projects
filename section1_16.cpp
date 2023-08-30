#include <iostream>
using namespace std;

int main() {
   int userNum;

   cout << "Enter integer:" << endl;
   cin  >> userNum;
   
   cout << "You entered: " << userNum << endl;
   cout << userNum << " squared is " << (userNum*userNum) << endl;
   cout << "And " << userNum << " cubed is " << (userNum*userNum*userNum) << "!!" << endl;
   cout << "Enter another integer:" << endl;
   int userNum2;
   cin >> userNum2;
   cout << "Enter another integer:"<< endl;
   int userNum3;
   cin >> userNum3;
   cout << userNum << " + " << userNum2 << " is " << (userNum+userNum2) << endl;
   cout << userNum << " * " << userNum2 << " is " << (userNum*userNum2) << endl;
   cout << userNum3 << " / " << userNum2 << " is " << (userNum3/userNum2) << endl;
      return 0;
}