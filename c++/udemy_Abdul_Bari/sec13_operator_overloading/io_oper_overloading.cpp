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

       friend ostream & operator<<(ostream &out, ComplexNumber &c);
};

ostream & operator<<(ostream &out, ComplexNumber &c)
{
    cout << c.getReal() << " + i" << c.getImaginary();
    return out;
}

int main() 
{
    ComplexNumber c(5, 10);
    
    //cout << c << endl; 
    operator<<(cout, c) << endl; // can use either
	return 0;
} 