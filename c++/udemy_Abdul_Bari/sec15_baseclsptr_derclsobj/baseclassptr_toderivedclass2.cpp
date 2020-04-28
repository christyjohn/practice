#include <iostream>
using namespace std;

class Rectangle 
{
public:
    void area()
    {
        cout << "Area of Rectangle" << endl;
    }

};

class Cuboid : public Rectangle
{
public:
    void volume()
    {
        cout << "Volume o Cuboid" << endl;
    }
};

int main()
{
    Cuboid c;
    c.area();
    c.volume();
    cout << "<------------>" << endl;
    Rectangle *p = &c;
    p->area();
    //p->volume();
    cout << "<------------>" << endl;
    Rectangle r;
    //Cuboid *q = &r;
    return 0;
}