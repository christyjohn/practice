#include <iostream>

using namespace std;

class Rectangle
{
private:
    int breadth;
    int length;

public:
    Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    Rectangle(int l, int b)
    {
        setLength(l);
        setBreadth(b);
    }

    // copy constructor
    Rectangle(Rectangle &r)
    {
        setLength(r.getLength());
        setBreadth(r.getBreadth());
    } 
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
    Rectangle r1(10, 15);

    cout << "Area: " << r1.area() << endl;
    cout << "Perimeter: " << r1.perimeter() << endl;

    Rectangle r2(r1);
    cout << "Area: " << r2.area() << endl;
    cout << "Perimeter: " << r2.perimeter() << endl;

    return 0;
}