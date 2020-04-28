#include <iostream>

using namespace std;

class Rectangle
{
private:
    int breadth;
    int length;

public:
    void setBreadth(int b)
    {
        if (b > 0)
            breadth = b;
        else
            breadth = 1;    
    }

    void setLength(int l)
    {
        if (l > 0)
            length = l;
        else
            length = 1;    
    }

    int getBreadth()
    {
        return breadth;
    }

    int getLength()
    {
        return length;
    }

    int area()
    {
        return length * breadth;
    }

    int perimeter()
    {
        return 2 * (length + breadth);
    }
};

int main()
{
    Rectangle *r1 = new Rectangle;
    r1->setLength(10);
    r1->setBreadth(5);

    cout << "Area: " << r1->area() << endl;
    cout << "Perimeter: " << r1->perimeter() << endl;

    return 0;
}