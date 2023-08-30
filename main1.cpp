#include <iostream>
#include "ItemToPurchase.h"
#include <string>
using namespace std;

int main()
{
    cout << "Item 1" << endl;
    cout << "Enter the item name:" << endl;
    string i_name;
    getline(cin, i_name);
    cout << "Enter the item price:" << endl;
    int i_price;
    cin >> i_price;
    cout << "Enter the item quantity:" << endl;
    int i_quantity;
    cin >> i_quantity;

    cout << endl;

    ItemToPurchase obj1;
    obj1.SetName(i_name);
    obj1.SetPrice(i_price);
    obj1.SetQuantity(i_quantity);

    cin.ignore();

    cout << "Item 2" << endl;
    cout << "Enter the item name:" << endl;
    getline(cin, i_name);
    cout << "Enter the item price:" << endl;
    cin >> i_price;
    cout << "Enter the item quantity:" << endl;
    cin >> i_quantity;

    ItemToPurchase obj2;
    obj2.SetName(i_name);
    obj2.SetPrice(i_price);
    obj2.SetQuantity(i_quantity);

    cout << endl;
    
    cout << "TOTAL COST" << endl;
    cout << obj1.GetName() << " " << obj1.GetQuantity() << " @ $" << obj1.GetPrice() << " = $" << obj1.GetQuantity()*obj1.GetPrice() << endl;
    cout << obj2.GetName() << " " << obj2.GetQuantity() << " @ $" << obj2.GetPrice() << " = $" << obj2.GetQuantity()*obj2.GetPrice() << endl;
    cout << endl;
    cout << "Total: $" << (obj1.GetQuantity()*obj1.GetPrice())+(obj2.GetQuantity()*obj2.GetPrice());
    cout << endl;
    return 0;
}