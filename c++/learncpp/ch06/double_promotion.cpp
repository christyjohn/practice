#include <iostream>
#include <typeinfo> // for typeid()
 
 int main()
 {  
    double d { 4.0 };
    short s { 2};

    std::cout << typeid(d + s).name() << ' ' << d + s << '\n';  // show us the type of d + s

    return 0;
 }

