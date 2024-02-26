#include <iostream> 
using namespace std;
#define MSize 5
int stack[MSize];
int top=-1;
void push()
{
	int item;
	if(top==MSize-1)
	{
		cout<<"\n STACK IS FULL";
		
	}
	else
	{
		cout<<"\n Enter the value to be inserted:";
		cin>>item;
		stack[++top]=item;
		
	}
}
void pop()
{
	int item;
	if(top==-1)
	{
		cout<<"\n EMPTY STACK"<<endl;
	}
		else
		{
			 item= stack[top];
			 top = top-1;
			 cout<<"Deleted Elements:"<<item;
		}
	}

	void traverse()
	{
	 if(top==-1)
	 {
		 
	 cout<<"\n EMPTY STACK"<<endl;
}
	 else
	 {
	 	cout<<"Values in Stack:"<<endl;
	 }
	 	for(int i=top;i>=0;i--)
	 	{
		 
	 	cout<<"\t" <<stack[i];
}
	 
	}
	int main()
	{
		int choice;
	   char ch;
	   do{
	   	cout<<"*** Stack Operation ***\n\n";
		cout<<"1- Push Value\n\n2- Pop Value\n\n3- Traverse\n\n4- Exit\n";
		cin>>choice;
		switch(choice)
		{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				traverse();
				break;
			default:
				cout<<"\n Invalid Choice";
				
					}
				cout<<"\n Enter (Y/y) to Continue::::";
				cin>>ch;
				
		
	   }
	   while(ch=='Y'|| ch=='y');
	   return 0;
	}
