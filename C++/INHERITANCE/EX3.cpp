//constructorin inheritance
#include <bits/stdc++.h>
using namespace std;

class Base
{
public:
    Base()
    {
        cout << "non param base" << endl;
    }
    Base(int x)
    {
        cout << "param of base " << x << endl;
    }
};
class Derived : public Base
{
public:
    Derived()
    {
        cout << "non param of der " << endl;
    }
    Derived(int x)
    {
        cout << "param of deri  " << x << endl;
    }
    Derived(int x,int y) : Base(x)
    {
        cout << "param 2 der " << y << endl;
    }
};
int main()
{
    Derived d1;
    Derived d2(10);
    Derived d3(20,30);
    return 0;
}