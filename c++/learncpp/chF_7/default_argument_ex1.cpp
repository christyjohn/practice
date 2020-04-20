#include <iostream>

void printValues(int x, int y=10) {
    std::cout << "x: " << x << '\n';
    std::cout << "y: " << y << '\n';
}

int main() {
    printValues(1);
    printValues(3, 5);
}