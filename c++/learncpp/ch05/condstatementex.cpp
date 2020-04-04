#include <iostream>
using std::cout;

int main()
{
    bool inBigClassroom { false };
    const int classSize { inBigClassroom ? 30 : 20 };
    cout << "The class size is: " << classSize << "\n";

    return 0;
}