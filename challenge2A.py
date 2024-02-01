
from math import sin,cos

#The following funtion checks if f(x) is very close to x or not
def approx_fixed_point(f,x):
    if abs(f(x)-x)< 1e-15:
        return True
    else:
        return False

#the following function checks and returns the number of steps needed to make f(x) be as close as possible to x
def fixed_point_iteration(f_arg, x=1.0):
    """
    >>> fixed_point_iteration(lambda x: sin(x) + x, 3.0)
    (3.141592653589793, 3)
    >>> print(fixed_point_iteration(lambda x: cos(x), 1.0))
    (0.7390851332151611, 86)
    """
    step=0
    while not approx_fixed_point(f_arg, x):
        x=f_arg(x)
        step+=1
    return x, step 

def newton_find_zero(f, f_prime, x=1.0):
    """ 
    >>> newton_find_zero(lambda x: sin(x) , lambda x: cos(x), 3.0)
    (3.141592653589793, 3)
    >>> newton_find_zero(lambda x: cos(x)-x , lambda x: -sin(x)-1, 1.0)
    (0.7390851332151606, 7)
    """
    count=0
    while not approx_fixed_point(f, x):
        x-=(f(x)/f_prime(x)) #This statement is the basis of newton's method to calculate the number needed in each iteration
        count+=1
    return x, count
    #The above function uses newtons method to calulate the number required, whether it is pi or dottie's number

import doctest
if __name__ == "__main__":
  doctest.testmod(verbose=True)
