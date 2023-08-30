#include <string>
#include <vector>
#include <iostream>
#include "ShoppingCart.h"
using namespace std;

ShoppingCart::ShoppingCart()
{
    customerName="none";
    currentDate="January 1, 2016";
}

ShoppingCart::ShoppingCart(string cN, string cD)
{
    customerName=cN;
    currentDate=cD;
}

string ShoppingCart::GetCustomerName()
{
    return customerName;
}

string ShoppingCart::GetDate()
{
    return currentDate;
}

void ShoppingCart::AddItem(ItemToPurchase item)
{
    cartItems.push_back(item);
}

void ShoppingCart::RemoveItem(string iN)
{
    for (unsigned int i=0;i<cartItems.size();++i)
    {
        if (cartItems.at(i).GetName()==iN)
        {
            ItemToPurchase temp;
            cartItems.at(i)=temp;
            return;
        }
        else
            continue;
    }
    cout << "Item not found in cart. Nothing removed." << endl;
}

void ShoppingCart::ModifyItem(ItemToPurchase item)
{
    for (unsigned int i=0;i<cartItems.size();++i)
    {
        if (cartItems.at(i).GetName()==item.GetName())
        {
            if (item.GetDescription()!="none" && item.GetPrice()!=0 && item.GetQuantity()!=0)
                cartItems.at(i).SetQuantity(item.GetQuantity());
        }
        else
            continue;
    }
    cout << "Item not found in cart. Nothing modified." << endl;
}

int ShoppingCart::GetNumItemsInCart()
{
    int sum=0;
    for (unsigned int i=0;i<cartItems.size();++i)
        sum+=cartItems.at(i).GetQuantity();
    return sum;
}

int ShoppingCart::GetCostOfCart()
{
    int cost=0;
    for (unsigned int i=0;i<cartItems.size();++i)
        cost+=(cartItems.at(i).GetQuantity()*cartItems.at(i).GetPrice());
    return cost;
}

void ShoppingCart::PrintTotal()
{
    cout << customerName << "'s Shopping Cart - " << currentDate << endl;
    cout << "Number of Items: " << GetNumItemsInCart() << endl;
    cout << endl;
    if (cartItems.size()==0)
    {
        cout << "SHOPPING CART IS EMPTY" << endl;
    }
   
    for (unsigned int i=0;i<cartItems.size();++i)
        cartItems.at(i).PrintItemCost();
    cout << endl;
    cout << "Total: $" << GetCostOfCart() << endl;
    cout << endl;
}

void ShoppingCart::PrintDescriptions()
{
     cout << customerName << "'s Shopping Cart - " << currentDate << endl;
     cout << endl;
     cout << "Item Descriptions:" << endl;
     for (unsigned int i=0;i<cartItems.size();++i)
        cartItems.at(i).PrintItemDescription();
}