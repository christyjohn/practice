#include <algorithm>
#include <array>
#include <iostream>
 
int main()
{
  std::array arr{ 13, 90, 99, 5, 40, 80 };
 
  // Pass greater to std::sort
  std::sort(arr.begin(), arr.end(), std::greater{});
 
  for (int i : arr)
  {
    std::cout << i << ' ';
  }
 
  std::cout << '\n';
 
  return 0;
}