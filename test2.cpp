#include <iostream>

#include <vector>

using namespace std;

 

ostream &operator<<(ostream &output, vector<int> x) {

      if (x.size() == 0) {

            x.resize(5);

            for(unsigned i=0; i<x.size(); i++){

            cout << x.at(i)+2*i << ":";

      } 
      }else {

                       for(unsigned i=0; i<x.size(); i++)

                          cout << x.at(i) << " ";

      }


}

 

int main() {

            vector<int> y;

            cout << y;

}