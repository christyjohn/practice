#include <iostream>
using std::cout;

struct Point3d
{
    double x;
    double y;
    double z;
};

Point3d getZeroPoint()
{
    Point3d temp { 0.0, 0.0, 0.0 };
    return temp;
}

Point3d getZeroPoint2()
{
    Point3d temp { 0.0, 0.0, 0.0 };
    return temp;
}

int main()
{
    Point3d zero{ getZeroPoint() };
 
    if (zero.x == 0.0 && zero.y == 0.0 && zero.z == 0.0)
        cout << "The point is zero\n";
    else
        cout << "The point is not zero\n";
 
    return 0;
}

