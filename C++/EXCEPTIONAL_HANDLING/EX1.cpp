//try catch throw
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int x = 9, y = 2, z;
    try
    {
        if (y == 0)
            throw 0;
        z = x / y;
        cout << z << endl;
    }
    catch (int c)
    {
        cout << "catch block  " << c << endl;
    }
    cout << "Bye " << endl;
    return 0;
}