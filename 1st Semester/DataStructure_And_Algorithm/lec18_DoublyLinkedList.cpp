#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
    Node *prev;
    Node()
    {
        data = 0;
        next = NULL;
        prev = NULL;
    }
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
        this->prev = NULL;
    }
};
class Linkedlist
{
    Node *head;

public:
    Linkedlist()
    {
        head = NULL;
    }
    void insertNode(int data)
    {
        Node *newNode = new Node(data);
        if (head == NULL)
        {
            head = newNode;
            return;
        }
        Node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
        newNode->prev = temp;
    }
    void printList()
    {
        Node *temp = head;
        if (head == NULL)
        {
            cout << "List empty" << endl;
            return;
        }
        while (temp != NULL)
        {
            cout << temp->data << "<-->";
            temp = temp->next;
        }
        cout << "null";
    }
    void deleteNode(int index)
    {
        Node *temp = head;
        if (head == NULL)
        {
            cout << "List is empty";
            return;
        }
        if (temp->next == NULL)
        {
            head = NULL;
            return;
        }
        Node *previous;
        Node *nextNode;
        while (index != 0)
        {
            previous = temp;
            temp = temp->next;
            nextNode = temp->next;
            index--;
        }
        previous->next = temp->next;
        nextNode->prev = previous;
        free(temp);
        return;
    }
};
int main()
{
    int ch, val, indx;
    Linkedlist ll;
    cout << "\n1.Insert\n2.Delete\n3.DisplayList\n4.Exit";
    while (1)
    {
        cout << "\nEnter your choice: ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            int size, val;
            cout << "Enter size of the LinkedList ";
            cin >> size;
            for (int i = 0; i < size; i++)
            {
                cout << "\nInsert element-" << i + 1 << ": ";
                cin >> val;
                ll.insertNode(val);
            }
            break;
        case 2:
            cout << "\nEnter the index of node to delete: ";
            cin >> indx;
            ll.deleteNode(indx);
            cout << "\nElements after deletion: ";
            ll.printList();
            break;
        case 3:
            ll.printList();
            break;
        case 4:
            exit(0);
            break;
        default:
            cout << "Invalid Input";
        }
    }
}