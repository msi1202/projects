#include <iostream>
#include <string>
#include "ShoppingCart.h"
using namespace std;

void PrintMenu(ShoppingCart currCart)
{
    cout << "MENU" << endl;
    cout << "a - Add item to cart" << endl;
    cout << "d - Remove item from cart" << endl;
    cout << "c - Change item quantity" << endl;
    cout << "i - Output items' descriptions" << endl;
    cout << "o - Output shopping cart" << endl;
    cout << "q - Quit" << endl;
    cout << endl;
    cout << "Choose an option:" << endl;

} 

int main()
{
    cout << "Enter customer's name:" << endl;
    string cust_name;
    getline(cin, cust_name);
    cout << "Enter today's date:" << endl;
    string date;
    getline(cin, date);
    cout << endl;
    cout << "Customer name: " << cust_name << endl;
    cout << "Today's date: " << date << endl;
    cout << endl;

    ShoppingCart cart(cust_name, date);

    char option;
    PrintMenu(cart);
    while(cin >> option)
    {
        while (option!='a' && option!='d' && option!='c' && option!='i' && option!='o' && option!='q')
        {
            cout << "Choose an option:" << endl;
            cin >> option;
        }

        if (option=='q')
            break;
        if(option=='o')
        {
            cout << "OUTPUT SHOPPING CART" << endl;
            cart.PrintTotal();
        }
        else if(option=='i')
        {
            cout << "OUTPUT ITEMS' DESCRIPTION" << endl;
            cart.PrintDescriptions();
        }
        else if(option=='a')
        {
            cout << "ADD ITEM TO CART" << endl;
            cout << "Enter the item name:" << endl;
            string i_name;
            getline(cin, i_name);
            cout << "Enter the item description:" << endl;
            string i_description;
            getline(cin, i_name);
            cout << "Enter the item price:" << endl;
            int i_price;
            cin >> i_price;
            cout << "Enter the item quantity:" << endl;
            int i_quantity;
            cin >> i_quantity;
            cout << endl;

            ItemToPurchase currItem(i_name,i_description,i_price,i_quantity);
            cart.AddItem(currItem);
        }
        else if(option=='d')
        {
            cout << "REMOVE ITEM FROM CART";
            cout << "Enter name of item to remove";
            string i_name;
            getline(cin, i_name);
            cart.RemoveItem(i_name);
        }
        else if(option=='c')
        {
            cout << "CHANGE ITEM QUANTITY" << endl;
            cout << "Enter the item name:" << endl;
            string i_name;
            getline(cin, i_name);
            cout << "Enter the new item quantity:" << endl;
            int i_quantity;
            cin >> i_quantity;
            
            ItemToPurchase currItem;
            currItem.SetName(i_name);
            currItem.SetQuantity(i_quantity);
            cart.ModifyItem(currItem);
        }
        PrintMenu(cart);
    }
    return 0;
}