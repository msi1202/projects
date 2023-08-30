#include <iostream>
#include "ItemToPurchase.h"
using namespace std;

ItemToPurchase::ItemToPurchase()
{

}
ItemToPurchase::ItemToPurchase(string itName,string itDescription, int itPrice, int itQuantity)
{
    itemName=itName;
    itemDescription=itDescription;
    itemPrice=itPrice;
    itemQuantity=itQuantity;
}
void ItemToPurchase::SetName(string s)
{
    itemName=s;
}

string ItemToPurchase::GetName() const
{
    return itemName;
}

void ItemToPurchase::SetPrice(int p)
{
    itemPrice=p;
}

int ItemToPurchase::GetPrice() const
{
    return itemPrice;
}

void ItemToPurchase::SetQuantity(int p)
{
    itemQuantity=p;
}

int ItemToPurchase::GetQuantity() const
{
    return itemQuantity;
}

void ItemToPurchase::SetDescription(string s)
{
    itemDescription=s;
}

string ItemToPurchase::GetDescription() const
{
    return itemDescription;
}

void ItemToPurchase::PrintItemCost()
{
    cout << itemName << " " << itemQuantity << " @ $" << itemPrice << " = $" <<  itemPrice*itemQuantity << endl;
}

void ItemToPurchase::PrintItemDescription()
{
    cout << itemName << ": " << itemDescription << endl;
}
