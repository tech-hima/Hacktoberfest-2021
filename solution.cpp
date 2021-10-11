// C++ program to find the sum, product , difference and division of two given numbers

#include <iostream>

using namespace std;

int main()
{   int a, b;
    a = 10;
    b = 7;
    
    int sum, product, difference;
    float division;
    
    sum = a + b;
    product = a * b;
    difference = a - b;
    division = a / b;
    
    cout << "Sum of a and b is: " << sum << endl;
    cout << "Product of a and b is: " << product << endl;
    cout << "difference of a and b is: " << difference << endl;
    cout << "division of a and b is: " << division << endl;

    return 0;
}