#include <iostream>
 
namespace foo
{
	namespace goo
	{
	        int add(int x, int y)
        	{
	            return x + y;
        	}
	}
}
 
int main()
{
	namespace boo = foo::goo; // boo now refers to foo::goo
 
	std::cout << boo::add(4, 6) << '\n'; // This is really foo::goo::add()
 
	return 0;
} // The boo alias ends here