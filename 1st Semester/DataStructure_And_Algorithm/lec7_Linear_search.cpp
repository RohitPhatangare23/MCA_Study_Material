#include <iostream>
using namespace std;
int main()
{
	int n;
	cout << "enter the size of array::";
	cin >> n;
	int a[n];
	for (int i = 0; i < n; i++)
		cin >> a[i];
	cout << "You have enter the following elements in to the array::";
	for (int i = 0; i < n; i++)
		cout << " " << a[i];
	cout << endl;
	cout << "Enter the element you want to search:::";
	int s;
	cin >> s;
	int i;
	for (i = 0; i < n; i++)
	{
		if (a[i] == s)
		{
			cout << "Element is found at index:" << i << endl;
			break;
		}
	}
	if (i == n)
	{
		cout << "Element does not exist" << endl;
		return 0;
	}
}