#include <iostream>
using namespace std;

class ModeofTransport 
{
  public:
      virtual ~ModeofTransport()
      {

      } 
      virtual void MovesBy() const = 0; 
};


class Airplane : public ModeofTransport 
{
  public:
      Airplane()
      {

      } 

      void MovesBy() const override 
      {
          cout << "An airplane moves by flying" << endl;
      }

      ~Airplane() 
      {
          cout << "Airplane Destructor called..." << endl;
      }
};


class Car : public ModeofTransport 
{
  public:
      Car() 
      {

      } 

      void MovesBy() const override 
      {
          cout << "A car moves by driving on roads" << endl;
      }

      ~Car() 
      {
          cout << "Car Destructor called..." << endl;
      }
};


class Train : public ModeofTransport 
{
  public:
      Train() 
      {

      } 

      void MovesBy() const override 
      {
          cout << "A train moves by running on tracks" << endl;
      }

      ~Train() 
      {
          cout << "Train Destructor called..." << endl;
      }
};

int main() {
  
  ModeofTransport* arr[3];
  
  arr[0] = new Airplane();
  arr[1] = new Car();
  arr[2] = new Train();
  
  for (unsigned int i = 0; i < 3; ++i) 
  {
    arr[i]->MovesBy();
  }
  
  for (unsigned int i = 0; i < 3; ++i) 
  {
    delete arr[i];
  }

  return 0;
}