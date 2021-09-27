//virtual destructor
#include <bits/stdc++.h>
using namespace std;
class base
{
public:
    base()
    {
        cout << "constructor of base" << endl;
    }
    virtual ~base()
    {
        cout << "destructor of base" << endl;
    }
};
class derived : public base
{
public:
    derived()
    {
        cout << "constructor of derived" << endl;
    }
    ~derived()
    {
        cout << "destructor of derived" << endl;
    }
}; 
int main()
{
    derived d;
    base* b = new derived();
    delete b;
    return 0;
}