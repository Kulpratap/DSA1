#include<iostream>
using namespace std;
int main(){
    int a=3,b=4,c;
    char x;
    cout<<"Choose Operator +,-,*,%"<<endl;
    cin>>x;
    switch (x)
    {
    case '+':
        c = a+b;
        cout<<"The sum of a and b is "<<c<<endl;
        break;
    case '-':
    c=a-b;
    cout<<"The diffrence of a and b is "<<c<<endl;
    break;
   
    case '*':
    c=a*b;
    cout<<"The Product of a and b is "<<c<<endl;
    break;
    
    case '%':
    c=a%b;
    cout<<"The mod of a and b is "<<c<<endl;
    break;
    
    default:
    cout<<"Wrong Operator "<<endl;
        break;
    }
    return 0;
}