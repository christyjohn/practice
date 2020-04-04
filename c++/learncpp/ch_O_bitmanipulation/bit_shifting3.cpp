#include <iostream>
using std::cout;

#include <bitset>
 
int main()
{
	std::bitset<4> x{ 0b0110 };
 
	cout << x << 1 << '\n'; // print value of x (0110), then 1
	cout << (x << 1) << '\n'; // print x left shifted by 1 (1100)
 
	return 0;
}