#include <iostream>
using std::cout;

#include <bitset>
 
int main()
{
	cout << (std::bitset<4>{ 0b0001 } & std::bitset<4>{ 0b0011 }
             & std::bitset<4>{ 0b0111 }) << '\n';
 
	return 0;
}