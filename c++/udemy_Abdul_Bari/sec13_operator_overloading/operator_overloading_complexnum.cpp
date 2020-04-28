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

        ComplexNumber operator+(ComplexNumber x)
        {
            ComplexNumber temp;
            temp.real = real + x.real;
            temp.imaginary = imaginary + x.imaginary;

            return temp;
        }
};

int main() 
{
    ComplexNumber c1(5, 10), c2(10, 5), c3;
    c3 = c1+c2;

    cout << "c3 real: "  << c3.getReal() << ", c3.imaginary; " << c3.getImaginary() << endl;;
	return 0;
} 