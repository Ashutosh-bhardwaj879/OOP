//base class pointer derived class object'
//can call only functions of base class 
#include <bits/stdc++.h>
using namespace std;
class Base
{
public:
    void fun1()
    {
        cout << "fun1 base" << endl;
    }
};
class Derived : public Base
{
public:
    void fun2()
    {
        cout << "fun2 derived" << endl;
    }
};
int main()
{
    Derived d1;
    d1.fun1();
    d1.fun2();
    Base *b = new Derived();
    b->fun1();
    //b->fun2();
}