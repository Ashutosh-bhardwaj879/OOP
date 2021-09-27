//friend function and classes
#include <bits/stdc++.h>
using namespace std;
class your;
class my
{
private:
    int a;

protected:
    int b;

public:
    int c;
    friend your;
};
class your
{
public:
    my m;
    void fun()
    {
        m.a = 10;
        cout << m.a << endl;
        m.b = 20;
        cout << m.b << endl;
        m.c = 30;
        cout << m.c << endl;
    }
};
class test
{
private:
    int a;

protected:
    int b;

public:
    int c;
    friend void fun();
};
void fun()
{
    test t;
    t.a = 10;
    cout << t.a << endl;
    t.b = 20;
    cout << t.b << endl;
    t.c = 30;
    cout << t.c << endl;
}
int main()
{
    fun();
    your y;
    y.fun();
    return 0;
}