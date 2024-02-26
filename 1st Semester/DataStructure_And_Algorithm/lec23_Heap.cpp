#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
class Heap
{
private:
    vector<int> heap;
    void heapify(int index)
    {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < heap.size() && heap[left] > heap[largest])
        {
            largest = left;
        }
        if (largest != index)
        {
            swap(heap[index], heap[largest]);
            heapify(largest);
        }
    }

public:
    void insert(int value)
    {
        heap.push_back(value);
        int index = heap.size() - 1;
        while (index > 0 && heap[(index - 1) / 2] < heap[index])
        {
            swap(heap[index], heap[(index - 1) / 2]);
            index = (index - 1) / 2;
        }
    }
    void buildHeap()
    {
        for (int i = heap.size() / 2 - 1; i >= 0; i--)
        {
            heapify(i);
        }
    }
    void heapSort()
    {
        buildHeap();
        for (int i = heap.size() - 1; i > 0; i--)
        {
            swap(heap[0], heap[i]);
            heapify(0);
        }
    }
    void deleteMax()
    {
        if (heap.empty())
        {
            cout << "Heap is Empty cannot delete" << endl;
            return;
        }
    }
    void display()
    {
        for (int value : heap)
        {
            cout << value << " ";
        }
        cout << endl;
    }
};
int main()
{
    Heap maxHeap;
    int choice, value;
    do
    {
        cout << "\n========MENU=========\n";
        cout << "1. Insert\n";
        cout << "2. Build Heap\n";
        cout << "3. Heap Sort\n";
        cout << "4. DeleteMax\n";
        cout << "5. Display\n";
        cout << "6. Exit\n";
        cout << "Enter your Choice:";
        cin >> choice;
        switch (choice)
        {
        case 1:
            cout << "Enter value to insert:";
            cin >> value;
            maxHeap.insert(value);
            break;
        case 2:
            maxHeap.buildHeap();
            cout << "Heap Created using heapify method" << endl;
            break;
        case 3:
            maxHeap.heapSort();
            cout << "Heap Sort Completed." << endl;
            break;
        case 4:
            maxHeap.deleteMax();
            cout << "Maximum Value deleted from the heap." << endl;
            break;
        case 5:
            cout << "Heap:";
            maxHeap.display();
            break;
        case 6:
            cout << "Exiting Program.\n";
            break;
        default:
            cout << "\nInvalid Choice, Please enter a valid option.\n";
        }
    } while (choice != 6);
    return 0;
}