#include <string>
#include <vector>
#include "ItemToPurchase.h"
using namespace std;
class ShoppingCart
{
    public:
    ShoppingCart();
    ShoppingCart(string cN, string cD);
    string GetCustomerName();
    string GetDate();
    void AddItem(ItemToPurchase item);
    void RemoveItem(string iN);
    void ModifyItem(ItemToPurchase item);
    int GetNumItemsInCart();
    int GetCostOfCart();
    void PrintTotal();
    void PrintDescriptions();
    private:
        string customerName;
        string currentDate;
        vector<ItemToPurchase> cartItems;
};