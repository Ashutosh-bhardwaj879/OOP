//destructor
#include <bits/stdc++.h>
using namespace std;

class demo
{
public:
    demo()
    {
        cout << "constructor" << endl;
    }
    ~demo()
    {
        cout << "destructor" << endl;
    }
};
int main()
{
    demo d2;
    demo *d1 = new demo();
    delete d1;
    return 0;
}