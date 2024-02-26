#include <iostream>
#include <cstdlib>  // Instead of <stdlib.h>
#define TABLE_SIZE 10

using namespace std;

int h[TABLE_SIZE] = {NULL};

void insert()
{
    int key, index, i, flag = 0, hkey;
    cout << "Enter element to be inserted:";
    cin >> key;
    hkey = key % TABLE_SIZE;
    for (i = 0; i < TABLE_SIZE; i++)
    {
        index = (hkey + i) % TABLE_SIZE;  // Corrected index calculation
        if (h[index] == NULL)
        {
            h[index] = key;  // Corrected assignment statement
            break;
        }
    }
    if (i == TABLE_SIZE)
        cout << "\nElement cannot be inserted!\n";
}

void search()
{
    int key, index, i, flag = 0, hkey;
    cout << "Enter the element to be searched:";
    cin >> key;
    hkey = key % TABLE_SIZE;
    for (i = 0; i < TABLE_SIZE; i++)
    {
        index = (hkey + i) % TABLE_SIZE;
        if (h[index] == key)
        {
            cout << "Value is found at index:" << index;
            break;
        }
    }
    if (i == TABLE_SIZE)
        cout << "Value is not Found.";
}

void display()
{
    int i;
    cout << "\nElements in the hash table are";
    for (i = 0; i < TABLE_SIZE; i++)
        cout << "\nAt index " << i << "\tValue: " << h[i];
}

int main()
{
    int opt, i, j;
    while (1)
    {
        cout << "\n1.Insert\n2.Display\n3.Search\n4.Exit\nEnter the Choice: ";
        cin >> opt;
        switch (opt)
        {
        case 1:
            insert();
            break;
        case 2:
            display();
            break;
        case 3:
            search();
            break;
        case 4:
            exit(0);
        default:
            cout << "Enter correct option\n";
        }
    }
    return 0;
}
