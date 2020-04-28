#include <iostream>

using namespace std;

class ComplexNumber
{
    private:
        int real;
        int imaginary;

    public:
        ComplexNumber(int real = 0, int imaginary = 0)
        {
            this->real = real;
            this->imaginary = imaginary;
        }

        int getReal()
        {
            return real;
        }

        int getImaginary()
        {
            return imaginary;
        }

       friend ComplexNumber operator+(ComplexNumber c1, ComplexNumber c2);
};

ComplexNumber operator+(ComplexNumber c1, ComplexNumber c2)
{
    ComplexNumber temp;
    temp.real = c1.real + c2.real;
    temp.imaginary = c1.imaginary + c2.imaginary;

    return temp;
}

int main() 
{
    ComplexNumber c1(5, 10), c2(10, 5), c3;
    c3 = c1+c2;

    cout << "c3 real: "  << c3.getReal() << ", c3.imaginary; " << c3.getImaginary() << endl;;
	return 0;
} 