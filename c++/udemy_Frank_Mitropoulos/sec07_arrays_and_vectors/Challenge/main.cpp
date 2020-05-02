#include  <iostream>
#include <vector>
using namespace std;

int main()
{
    vector <int> vector1 {};
    vector <int> vector2 {};
    
    vector1.push_back(10);
    vector1.push_back(20);
    
    cout << vector1.at(0) << endl;
    cout << vector1.at(1) << endl;
    cout << "The size of vector1 is : " << vector1.size() << endl << endl;
    
    vector2.push_back(100);
    vector2.push_back(200);
    
    cout << vector2.at(0) << endl;
    cout << vector2.at(1) << endl;
    cout << "The size of vector2 is : " << vector2.size() << endl << endl;
    
    vector < vector <int> > vector_2d {};
    vector_2d.push_back(vector1);
    vector_2d.push_back(vector2);
    
    cout << "\nfirst row of vector_2d: " << endl;
    cout << vector_2d.at(0).at(0) << " ";
    cout << vector_2d.at(0).at(1) << endl;
    
    
    cout << "second row of vector_2d: " << endl;
    cout << vector_2d.at(1).at(0) << " ";
    cout << vector_2d.at(1).at(1) << endl;
    
    vector1.at(0) = 1000;
    
    cout << "\nDisplaying vector_2d again: " << endl;
    cout << "first row of vector_2d: " << endl;
    cout << vector_2d.at(0).at(0) << " ";
    cout << vector_2d.at(0).at(1) << endl ;
    
    cout << "second row of vector_2d: " << endl;
    cout << vector_2d.at(1).at(0) << " ";
    cout << vector_2d.at(1).at(1) << endl;
    
    
    cout << "\nDisplaying vector1 elements: " << endl;
    cout << vector1.at(0) << " ";
    cout << vector1.at(1) << endl;
    
    return 0;
}