//catch throew function
#include <bits/stdc++.h>
using namespace std;
int division(int x, int y)
{
    if (y == 0)
        throw 1;

    else
        return x / y;
}
int main()
{
    int x = 9, y = 5, z;
    try
    {
        // if (y == 0)
        //     throw 0;
        z = division(x, y);
        cout << z << endl;
    }
    catch (int c)
    {
        cout << "catch block  " << c << endl;
    }
    cout << "Bye " << endl;
    return 0;
}