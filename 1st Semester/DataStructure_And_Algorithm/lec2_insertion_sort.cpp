#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"enter size for an array: ";
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	cin>>a[i];
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j>=0;j--)
		{
			int temp;
			if(a[j]<a[j-1])
		    {
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
		    }
		}
		for(int k=0;k<n;k++)
		cout<<" "<<a[k];
		cout<<endl;
	}
	cout<<"sorted array through insertion sort : "<<endl;
	for(int k=0;k<n;k++)
	cout<<" "<<a[k];
	return 0;
}