#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
    Node()
    {
        data = 0;
        next = NULL;
    }
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
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
            cout << temp->data << " ";
            temp = temp->next;
        }
    }
    void deleteNode(int index)
    {
        Node *temp = head;
        if (head == NULL)
        {
            cout << "List is empty";
            return;
        }
        Node *previous;
        while (index != 0)
        {
            previous = temp;
            temp = temp->next;
            index--;
        }
        previous->next = temp->next;
    }
};
int main()
{
    int ch;
    Linkedlist ll;
    cout << "1.Insert\n2.Display\n3.Delete\n4.Exit";
    while (1)
    {
        cout << "\nEnter Your Choice: ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            int size, val;
            cout << "Enter size of the LinkedList ";
            cin >> size;
            for (int i = 0; i < size; i++)
            {
                cout << "\nInsert element-" << i + 1 << " ";
                cin >> val;
                ll.insertNode(val);
            }
            break;
        case 2:
            cout << "\nElements of LinkedList are: ";
            ll.printList();
            break;
        case 3:
            int indx;
            cout << "\nEnter the index of node to delete: ";
            cin >> indx;
            ll.deleteNode(indx);
            cout << "\nElements of LinkedList after deletion: ";
            ll.printList();
            break;
        case 4:
            exit(0);
            break;
        default:
            cout << "Invalid Choice";
        }
    }
}