//simple example ing=heritance
#include <bits/stdc++.h>
using namespace std;

class Base
{
public:
    int x;
    void show()
    {
        cout << x << " ";
    }
};
class Derived : public Base
{
public:
    int y;
    void display()
    {
        cout << x << " " << y << "  ";
    }
};
int main()
{
    Base b;
    b.x = 25;
    b.show();
    cout << endl;
    Derived d;
    d.x = 22;//alag se dena padega derived ko x
    d.y = 16;
    d.show();
    cout << endl;
    d.display();
    return 0;
}