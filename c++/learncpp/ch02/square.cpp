#include "square.h"

// actual definitions of the functions declared in square.h

int getSquareSides()
{
    return 4;
}

int getSquarePerimeter(int sideLength) 
{
    return sideLength * getSquareSides();
}