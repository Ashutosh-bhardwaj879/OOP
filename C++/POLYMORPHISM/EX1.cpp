//simple exampple of polymorphims
//function overriding
#include <bits/stdc++.h>
using namespace std;
class Parent
{
public:
    void display()
    {
        cout << "display of parent" << endl;
    }
};
class Child : public Parent
{
public:
    void display()
    {
        cout << "display of child" << endl;
    }
};
int main()
{
    Child c;
    c.display();
    Parent p;
    p.display();
    Parent *p1 = new Child();
    p1->display();
    return 0;
}