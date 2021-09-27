#include <bits/stdc++.h>
using namespace std;
class Rectangle
{
public:
    void area()
    {
        cout << "rectangle area" << endl;
    }
};
class Cuboid : public Rectangle
{

public:
    void volume()
    {
        cout << "cuboid volume" << endl;
    }
};
int main()
{
    Cuboid c;
    c.area();
    c.volume();
    Rectangle *r = &c;
    r->area();
    return 0;
}