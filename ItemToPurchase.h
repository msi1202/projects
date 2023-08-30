#include <string>
using namespace std;
class ItemToPurchase 
{
    public:
        ItemToPurchase();
        ItemToPurchase(string itName,string itDescription, int itPrice, int itQuantity);
        void SetName(string s);
        string GetName() const;
        void SetPrice(int p);
        int GetPrice() const;
        void SetQuantity(int p);
        int GetQuantity() const;
        void SetDescription(string s);
        string GetDescription() const;
        void PrintItemCost();
        void PrintItemDescription();
    private:
        string itemName;
        string itemDescription;
        int itemPrice;
        int itemQuantity;
};