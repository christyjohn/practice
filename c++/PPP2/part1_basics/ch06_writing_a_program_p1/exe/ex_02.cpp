#include "../../lib_files/std_lib_facilities.h"

//------------------------------------------------------------------------------

class Token
{
    public:
        char kind;              // what kind of token
        double value;           // for numbers: a value 
        Token(char ch)
            :kind(ch), value(0) { }
        Token(char ch, double val)
            :kind(ch), value(val){ }        // make a Token from a char and a double
};

//------------------------------------------------------------------------------

class Token_stream
{
        public:
            Token_stream();     // make a Token_stream that reads from cin
            Token get();        // get a Token (get() is defined elsewhere)
            void putback(Token t);  // put a Token back
        private:
            bool full {false};  // is there a Token in the buffer? 
            Token buffer = { 0 };       // here is where we keep a Token put back using putback()
};

//------------------------------------------------------------------------------

// The constructor just sets full to indicate that the buffer is empty:
Token_stream::Token_stream()
:full(false), buffer(0)    // no Token in buffer
{
}

//------------------------------------------------------------------------------

void Token_stream::putback(Token t)
{
    if (full)
        error("putback() into full buffer");
    buffer = t;         // copy t to buffer
    full = true;        // buffer is now full
}

//------------------------------------------------------------------------------

Token Token_stream::get()
{
    if (full)           // do we already have a Token ready?
    {
        full = false;   // remove Token from buffer
        return buffer;
    }
    char ch;
    cin >> ch;          // note that >> skips whitespace (space, newline, tab, etc.)
    switch (ch)
    {
        case ';':       // for print
        case 'q':       // for quit
        case '(': case ')': case '{': case '}':
        case '+': case '-': case '*': case '/':
            return Token(ch);   // let each character represent itself
        case '.':
        case '0': case '1': case '2': case '3': case '4':
        case '5': case '6': case '7': case '8': case '9':
        {
            cin.putback(ch);      // put digit back into the input stream
            double val;
            cin >> val;         // read a floating-point number
            return Token{'8', val};    // let ‘8’ represent “a number”
        }
        default:
            error("Bad token");
    }
}

//------------------------------------------------------------------------------

Token_stream ts;        // provides get() and putback() 

//------------------------------------------------------------------------------

double expression();    // declaration so that primary() can call expression()

//------------------------------------------------------------------------------

double term();        // read and evaluate a Term

//------------------------------------------------------------------------------

double primary()        // deal with numbers and parentheses
{
    Token t = ts.get();
    switch (t.kind)
    {
        case '(':   // handle '(' expression ')'
        {
            double d = expression();
            t = ts.get();
            if (t.kind != ')')
                error("')' expected");
            return d;
        }
        case '{':    // handle '{' expression '}'
        {
            double d = expression();
            t = ts.get();
            if (t.kind != '}')
                error("'}' expcted");
            return d;
        }

        case '8':               // we use '8' to represent a number
            return t.value;     // return the number's value
        case '-':
            return -primary();
        case '+':
            return primary();
        default:
            error("primary expected");
    }
}

//------------------------------------------------------------------------------

// deal with + and -
double expression()
{
    double left = term();       // read and evaluate a Term
    Token t = ts.get();      // get the next token
    while (true)
    {
        switch (t.kind)
        {
            case '+':
                left +=term();  // evaluate Term and add
                t = ts.get();
                break;
            case '-':
                left -=term();  // evaluate Term and subtract
                t = ts.get();
                break;
            default:
                ts.putback(t); // put t back into the token stream
                return left;    // finally: no more + or –; return the answer
        }
    }
}

//------------------------------------------------------------------------------

// deal with *, /, and %
double term()
{
    double left = primary();
    Token t = ts.get();         // get the next token from token stream
    while (true)
    {
        switch (t.kind)
        {
            case '*':
                left *= primary();
                t = ts.get();
                break;
            case '/':
            {
                double d = primary();
                if (d == 0)
                    error ("divide by zero");
                left /= d;
                t = ts.get();
                break;
            }
            default:
                ts.putback(t);      // put t back into the token stream
                return left;
        }
    }
}

//------------------------------------------------------------------------------

int main()
{
    cout << "Welcome to our simple calculator.\n"
         <<  "Please enter expressions using floating-point numbers.\n";
    cout << " +, -, * and / are available" << endl;
    try
    {
        while (cin) {
            cout << "> ";
            Token t = ts.get();
            while (t.kind == ';') 
                t=ts.get();    // eat ';'
            if (t.kind == 'q') {
                keep_window_open();
                return 0;
            }
            ts.putback(t);
            cout << "= " << expression() << endl;
        }
        keep_window_open();
        return 0;
    }
    catch (exception& e) {
        cerr << "error: " << e.what() << '\n'; 
        keep_window_open();
        return 1;
    }
    catch (...) {
        cerr << "Oops: unknown exception!\n"; 
        keep_window_open();
        return 2;
    }
}
//------------------------------------------------------------------------------