#include <iostream>
#include <vector>
#include <list>
#include <forward_list>
#include <set>

using namespace std;

int main() 
{
    vector<int> v = { 2, 4, 6, 8, 10 };
    v.push_back(20);
    v.push_back(30);

    for (int x : v)
        cout << x << " ";
    cout << endl;

    v.pop_back();

    for (int x : v)
        cout << x << " ";
    cout << endl;

    cout << "<-------------------->" << endl;
    cout << "Using iterator\n";

    vector<int>::iterator itr;
    for( itr = v.begin(); itr != v.end(); ++itr )
        cout << *itr << " ";
    cout << endl;

    cout << "<-------------------->" << endl;

    cout << "<======== List =========>" << endl;

    list<int> l = { 2, 4, 6, 8, 10 };
    l.push_back(20);
    l.push_back(30);

    for (int x : l)
        cout << x << " ";
    cout << endl;

    l.pop_back();

    for (int x : v)
        cout << x << " ";
    cout << endl;

    cout << "<-------------------->" << endl;
    cout << "Using iterator\n";

    list<int>::iterator itr2;
    for( itr2 = l.begin(); itr2 != l.end(); ++itr2 )
        cout << *itr2 << " ";
    cout << endl;

    cout << "<-------------------->" << endl;

    cout << "<======== Forward List =========>" << endl;

    forward_list<int> fl = { 2, 4, 6, 8, 10 };
    fl.push_front(20);
    fl.push_front(30);

    for (int x : fl)
        cout << x << " ";
    cout << endl;

    fl.pop_front();

    for (int x : fl)
        cout << x << " ";
    cout << endl;

    cout << "<-------------------->" << endl;
    cout << "Using iterator\n";

    forward_list<int>::iterator itr3;
    for( itr3 = fl.begin(); itr3 != fl.end(); ++itr3 )
        cout << *itr3 << " ";
    cout << endl;

    cout << "<-------------------->" << endl;


    cout << "<======== Set =========>" << endl;

    set<int> s = { 2, 4, 6, 8, 10 };
    s.insert(20);
    s.insert(30);

    for (int x : s)
        cout << x << " ";
    cout << endl;

    s.erase(20);

    for (int x : s)
        cout << x << " ";
    cout << endl;

    cout << "<-------------------->" << endl;
    cout << "Using iterator\n";

    set<int>::iterator itr4;
    for( itr4 = s.begin(); itr4 != s.end(); ++itr4 )
        cout << *itr4 << " ";
    cout << endl;

    cout << "<-------------------->" << endl;

	return 0;
} 