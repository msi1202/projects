""" Four Required questions for Lab 1."""
## Modify this file by adding your salutation and code. 
## Once you pass all the doctests, then 
# you can then submit you program for credit. 


_author_ = "Mohamed Sameer Imam"
_credits_ = ["Your list of helpers"]
_email_ = "imamms@mail.uc.edu" # Your email address

# RQ1
def mult_inverse(x, y):
    """Returns True if the product of x and y is one.

    >>> mult_inverse(-1, 1)
    False
    >>> mult_inverse(1, 2)
    False
    >>> mult_inverse(-2, -1/2)
    True
    """
    if (x*y)==1:
        return True
    else:
        return False    
 
 
## while Loops ##
# RQ2
def not_factor (n):
    """Prints out all of the numbers that do not divide `n` evenly.
 
    >>> not_factor(10)
    9
    8
    7
    6
    4
    3
    """
    a=n
    while a>0:
        if n%a!=0:
            print(a)
        a=a-1
    return
    
 
# RQ3
def lucas(n):
    """Returns the nth Lucas number.
      Lucas numbers form a series similar to Fibonacci series, 
      where each number is the sum of the previous two numbers:
      2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123, 199, 322, 521, 843,...
 
    >>> lucas(0)
    2
    >>> lucas(1)
    1
    >>> lucas(2)
    3
    >>> lucas(100)
    792070839848372253127
    """
    a=2
    b=1
    c=0
    if n==0:
        return 2
    elif n==1:
        return 1
    while n>=2:
        c=a+b
        a=b
        b=c
        n=n-1
    return c
        

#RQ4
def gets_discount(p1, p2, p3):
    """ Returns True if p1 is an adult (age at least 18) and both of p2 and p3 are children (age 12 or below), 
    False otherwise. Do not use an if statement.
    >>> gets_discount(15, 12, 11)
    False
    >>> gets_discount(90, 11, 12)
    True
    """
    return (p1>=18)and(p2<=12)and(p3<=12)
    
import doctest
if __name__ == "__main__":
  doctest.testmod(verbose=True)