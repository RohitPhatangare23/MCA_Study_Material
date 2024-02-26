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
		for(int j=i+1;j<n;j++)
		{
				int temp;
			if(a[j]<a[i])
		    {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
		    }
		}
		for(int k=0;k<n;k++)
		cout<<" "<<a[k];
		cout<<endl;
	}
	cout<<"selection sort is: ";
	for(int i=0;i<n;i++)
	cout<<" "<<a[i];
	return 0;
}
