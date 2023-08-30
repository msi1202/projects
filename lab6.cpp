
#include <iostream>
#include <string>
#include <algorithm>
#include <cmath>

using namespace std;

///////////////////////////////////////////////////////////////////////////
// Function definitions get pasted below
///////////////////////////////////////////////////////////////////////////
 
// calculator implementation...
   bool calculate(int iselect, double x, double y, double & result) 
   {
         
      if (iselect==1)
         result=x+y;
      else if (iselect==2)
         result=x-y;
      else if (iselect==3)
         result=x*y;
      else if (iselect==4)
      {
         if (y!=0)
         {
            result=x/y;
            return true;
         }
         return false;
      }
      return true;
   } // end of function


// whichQuadrant implementation...
int whichQuadrant (const double & x, const double & y) 
{
    if (x==0.0 && y==0.0)
        return 0;
    else if (x>0 && y>0)
        return 1;
    else if (x<0 && y>0)
        return 2;
    else if (x<0 && y<0)
        return 3;
    else if (x>0 && y<0)
        return 4;
    else if (y==0 && x>0)
        return 100;
    else if (x==0 && y>0)
        return -100;
} // end of function



// determineSubstance implementation...
string determineSubstance(const double &input_boilingpoint) 
{
   if ((100*0.95)<=input_boilingpoint && input_boilingpoint<=(100*1.05))
      return "Water";
   else if ((357*0.95)<=input_boilingpoint && input_boilingpoint<=(357*1.05))
      return "Mercury";
   else if ((1187*0.95)<=input_boilingpoint && input_boilingpoint<=(1187*1.05))
      return "Copper";
   else if ((2193*0.95)<=input_boilingpoint && input_boilingpoint<=(2193*1.05))
      return "Silver";
   else if ((2660*0.95)<=input_boilingpoint && input_boilingpoint<=(2660*1.05))
      return "Gold";
   else
      return "Unknown Substance";
} //end of function 


// compareDelta implementation...
bool compareDelta(const double &number1, const double &number2, const double &delta) 
{
   cout << "Number1: " << number1 << endl;
   cout << "Number2: " << number2 << endl;
   cout << "Delta: " << delta << endl;

   double abs_val=fabs(number1-number2);
   if (-delta<abs_val && abs_val<delta)
      return true;
   else 
      return false;
} // end of function


int main(void)
{
   char ch;
      do
      {
         double output,num1, num2;
         int option;
         cout << "MENU" << endl;
         cout << "\t\t1. Add" << endl;
         cout << "\t\t2. Subtract" << endl;
         cout << "\t\t3. Multiply" << endl;
         cout << "\t\t4. Divide" << endl;
         cout << "\t\tEnter your choice: " << endl;
         cin >> option;
         cout << "Enter your two numbers: " << endl;
         cin >> num1;
         cin >> num2;
         
         if (calculate(option, num1, num2, output)==false)
            cout << "Invalid number(s)" << endl;
         else
         {
            cout << "Result: " << output << endl;
            cout << "Continue? " << endl;
            cin >> ch;
         }
      }while (ch=='y');
}