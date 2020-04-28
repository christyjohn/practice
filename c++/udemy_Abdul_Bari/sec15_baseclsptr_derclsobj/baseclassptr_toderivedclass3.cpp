#include <iostream>
using namespace std;

class BasicCar 
{
public:
    void start()
    {
        cout << "Starting the car" << endl;
    }

};

class SportsCar : public BasicCar
{
public:
    void accelarate()
    {
        cout << "Vrooooooooooom!!!!" << endl;
    }
};

int main()
{
    SportsCar s;
    s.start();
    s.accelarate();
    cout << "<------------>" << endl;
    BasicCar *c = &s;
    c->start();
    //s->accelerate();
    cout << "<------------>" << endl;
    BasicCar r;
    //SportsCar *q = &r;
    return 0;
}