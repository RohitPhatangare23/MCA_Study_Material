#include <iostream>
using namespace std;
int binarySearch(int arr[], int l, int r, int x)
{
	while (l <= r)
	{
		int mid = l + r / 2;
		if (arr[mid] == x)
		{
			return mid;
		}
		else if (arr[mid] < x)
		{
			l = mid + 1;
		}
		else
		{
			r = mid - 1;
		}
	}
	return -1;
}
int main()
{
	int n;
	cout << "Enter the number of elements in the array: ";
	cin >> n;
	cout << "Enter the elements in the array:" << endl;
	int arr[n];
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	int x;
	cout << "Enter the element to search for: ";
	cin >> x;
	int result = binarySearch(arr, 0, n - 1, x);
	if (result == -1)
	{
		cout << "Element not found" << endl;
	}
	else
		cout << "Element found at index " << result << endl;
	return 0;
}