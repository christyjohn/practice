#include <iostream>
 
int foo(int x)
{
	return x;
}
 
int main()
{
	auto fcnPtr{ foo };
	std::cout << fcnPtr(5) << '\n';
 
	return 0;
}