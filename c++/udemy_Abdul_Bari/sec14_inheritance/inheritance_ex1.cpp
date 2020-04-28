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

class Cuboid : public Rectangle 
{
    private:
        int height;

    public:
        Cuboid(int l = 0, int b = 0, int h = 0)
        {
            height = l;
            setLength(l);
            setBreadth(b);
        }

        void setHeight(int h)
        {
            height = h;
        }

        int getHeight()
        {
            return height;
        }

        int volume()
        {
            return getLength() * getBreadth() * height;
        }

};

int main()
{
    Cuboid c(10, 5, 3);
    cout << c.getLength() << endl;
    cout << c.getBreadth() << endl;
    cout << c.getHeight() << endl;
    cout << c.volume() << endl;

    return 0;
}