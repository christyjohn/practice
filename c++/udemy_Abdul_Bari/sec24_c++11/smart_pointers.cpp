#include <iostream>
#include <memory>

using namespace std;

class Rectangle
{
    int length;
    int breadth;
public:
    Rectangle(int l, int b)
    {
        length = l;
        breadth  = b;
    }

    int area()
    {
        return length * breadth;
    }
};

int main() 
{
    unique_ptr<Rectangle> ptr(new Rectangle(10, 5));
    cout << ptr->area() << endl;

    //unique_ptr<Rectangle> ptr2 = ptr;
    //unique_ptr<Rectangle> ptr2(ptr);
    unique_ptr<Rectangle> ptr2;
    ptr2 = move(ptr);
    cout << ptr2->area() << endl;
    //cout << ptr->area() << endl; // Segmentation fault (core dumped). ptr has become null

    cout << "\n\n<------------------------------->\n\n";
    shared_ptr<Rectangle> ptr3(new Rectangle(13, 12));
    cout << ptr3->area() << endl;
    shared_ptr<Rectangle> ptr4;
    ptr4 = ptr3;
    cout << ptr4->area() << endl;
    cout << ptr3->area() << endl;
    cout << ptr3.use_count() << endl;

    cout << "\n\n<------------------------------->\n\n";



	return 0;
} 