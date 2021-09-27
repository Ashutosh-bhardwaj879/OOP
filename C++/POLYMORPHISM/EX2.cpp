//virtual + polymorphism + function overriding + dynamic maethod dispatch
// no constructor used
#include <bits/stdc++.h>
using namespace std;

class Base
{
public:
    virtual void fun()
    {
        cout << "fun of base" << endl;
    }
};
class Derived : public Base
{
public:
    void fun()
    {
        cout << "fun of derived" << endl;
    }
};
int main()
{
    Base b1;
    b1.fun();
    Derived d1;
    d1.fun();
    Base *b = new Derived();
    b->fun(); // fun of base --->before using virtual
    //after using virtual
    b->fun(); //fun of derived
    return 0;
}