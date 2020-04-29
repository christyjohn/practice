#include <iostream>
using namespace std;

template<class T>
class Stack
{
private:
    T *stk;
    int top;
    int size;
public:
    Stack(int sz)
    {
        size = sz;
        top = -1;
        stk = new T[size];
    }

    void push(T x);
    T pop();
};

template<class T>
void Stack<T>::push(T x)
{
    if(top == size-1)
        cout << "Stack is full" << endl;
    else
    {
        top++;
        stk[top] = x;
    }    
}

template<class T>
T Stack<T>::pop()
{
    T x = 0;
    if (top == -1)
        cout << "Stack is empty" << endl;
    else
    {
        x=stk[top];
        top--;
    }
    return x;        
}

int main() 
{
    Stack<int> s(10);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(70);
    s.push(80);
    s.push(90);
    s.push(100);
    s.push(110);

    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;

	return 0;
} 