#include <iostream>
using namespace std;

void pointerOps(const int & variable, int *pntr)
{
    cout << "value of x = " << variable << endl;
    cout << "address of x = " << &pntr << endl;
    cout << "memory location pointed to by px = " << &pntr << endl;
    cout << "value obtained by deferencing px = " << *pntr << endl;
    cout << "value obtained by taking the address of the deferenced value of px = " << &*pntr << endl;
    cout << "value obtained by deferencing the address of px = " << *&pntr << endl;
    cout << "memory location pointed to after incrementing px by 1 = " << &(pntr+=1) << endl;
}
/* a)For part a, i believe the value is correct since it is just printing the value in x(variable)
   b)For part b, this is also correct since pntr points ot he value of variable and we are obtaining the 
   memory address of pntr which is in turn the momeory address of variable.
   c)For part c, it is correct since it should return the same value as part b
   d)For part d, it is correct since deferencing the value pointed by px(pntr) is the value stored in x(variable) because px points to px
   e)For part e, it will give the memory address of the number 10 and not the location of variable which is pointed to by pntr
   f)for part f, it will give the same output as part e since its dereferencing the value of the address of px which is the pointer
    to x and not the value of x itself
   g)For part g, we are getting the same answer as part c, even after incrememnting px by 1. 
*/
int main()
{
    int x=10;
    int *px;
    *px=x;
    pointerOps(x,px);
}