//rectnagle and cuboid private and public and many functions
#include <bits/stdc++.h>
using namespace std;
class Rectangle
{
private:
    int length;
    int breadth;

public:
    Rectangle()
    {
        length = 1;
        breadth = 1;
    }
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    Rectangle(Rectangle &r)
    {
        length = r.length;
        breadth = r.breadth;
    }
    void setLength(int l)
    {
        length = l;
    }
    void setBreadth(int b)
    {
        breadth = b;
    }
    int getLength()
    {
        return length;
    }
    int getBreadth()
    {
        return breadth;
    }
    int area()
    {
        return length * breadth;
    }
    int perimeter()
    {
        return 2 * (length + breadth);
    }
};
class Cuboid : public Rectangle
{
private:
    int height;

public:
    Cuboid(int h)
    {
        height = h;
    }
    void setHeight(int h)
    {
        height = h;
    }
    int getHeight()
    {
        return height;
    }
    int volume()
    {
        return getLength() * getBreadth() * height;
    }
};
int main()
{
    Cuboid c(5);
    cout << c.volume() << endl;
    Cuboid c1(20);
    c1.setLength(3);
    c1.setBreadth(4);
    cout << c1.volume() << endl;
    return 0;
}