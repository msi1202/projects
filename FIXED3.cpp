 /* ================================================================================
 *
 *       Filename:  FIXED3.cpp
 *
 *    Description: use of stream manipulators setprecision
 *                 and fixed
 *                 w/o fixed - total number of digits (incl base)
 *                 is set by value of n in setprecision(n)
 *
 *                 with fixed - n sets no. of digits output
 *                 AFTER decimal point (does not incl base)
 *
 *        Version:  1.0
 *        Created:  02/ 2/2021 10:10:40 AM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Steve Ettorre (), 
 *   Organization:  
 *
 * ================================================================================*/
#include <iostream> 
#include <iomanip> 
  
using namespace std; 
  
int main() { 
// Initializing the floating-pt value... 
    double x = 1.234567890123456789; 
  
// print 4 digits incl base...round last digit
    cout << "without fixed flag: " << setprecision(4)
         << x << endl; // prints 1.235
  
// Using fixed flag...
// print 3 digits after decimal...does NOT incl base...round last digit
    cout << "with fixed flag: " << setprecision(3)
         << fixed << x << endl; // also prints 1.235
  
    return 0; 
} 
