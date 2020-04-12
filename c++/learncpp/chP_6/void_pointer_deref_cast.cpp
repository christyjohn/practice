#include <iostream>
using std::cout;

enum class Type
{
    INT,
    FLOAT,
    CSTRING,
};

void printValue(void* ptr, Type type)
{
    switch(type)
    {
        case Type::INT:
            cout << *static_cast<int*>(ptr) << '\n'; // cast to int pointer and dereference
            break;
        case Type::FLOAT:
            cout << *static_cast<float*>(ptr) << '\n'; // cast to float pointer and dereference
            break;
        case Type::CSTRING:
            cout << static_cast<char*>(ptr) << '\n'; // cast to char pointer (no dereference)
            // std::cout knows to treat char* as a C-style string
            // if we were to dereference the result, then we'd just print the single char that ptr is pointing to
            break;
    }
}

int main()
{
    int nValue{ 5 };
    float fValue{ 7.5f };
    char szValue[]{ "Mollie" };

    printValue(&nValue, Type::INT);
    printValue(&fValue, Type::FLOAT);
    printValue(szValue, Type::CSTRING);

    return 0;
}