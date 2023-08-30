import random
def main():
 min=int(input("Enter the minimum number you wish to keep for the dice"))
 max=int(input("Enter the maximum number you wish to keep for the dice"))
 option=True
 while option==True:
     print("Number generated: "+str(generate(min,max+1)))
     option=input("Do you wish to roll the dice again(Enter yes/no)").strip()
     if option.casefold()=="yes":
         option=True
     elif option.casefold()=="no":
         option=False
     else:
         print("Incorrect input")
 else:
     print("The program has ended")
     
def generate(min_para,max_para):
    return random.randrange(min_para,max_para)
