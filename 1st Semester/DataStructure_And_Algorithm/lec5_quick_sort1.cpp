#include<iostream>
using namespace std;
int partition(int arr[],int low,int high)
{
	int pivot=arr[high];
	int i = low -1;
	for(int j= low;j<high;j++)
	{
		if(arr[j]<pivot)
		{
			i++;
			swap(arr[i],arr[j]);
		}
	}
		swap(arr[i+1],arr[high]);
		return i+1;
	}


//Function to perform quicksort
void quickSort(int arr[],int low,int high)
{
	if(low<high)
	{
		int pivotIndex = partition(arr,low,high);
			quickSort(arr,low,pivotIndex -1);
			quickSort(arr,pivotIndex + 1,high);
			}
}

int main()
{
	int n;
	cout<<"enter the number of elements::: ";
	cin>>n;
	
	int arr[n];
	cout<<"enter " << n << "elements : ";
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	
	quickSort(arr,0,n-1);
	cout<<"Sorted array Through Quick Sort : ";
	for(int i=0;i<n;i++)
	{
		cout<< arr[i]<<" ";
	}
	return 0;
}