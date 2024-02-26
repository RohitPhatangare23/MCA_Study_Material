#include <iostream>
using namespace std;
#include <bits/stdc++.h>
struct Node
{
    int data;
    struct Node *next;
};
struct Node *insertInEmpty(struct Node *last, int new_data)
{
    if (last != NULL)
        return last;
    struct Node *temp = new Node;
    temp->data = new_data;
    last = temp;
    last->next = last;
    return last;
}
struct Node *insertAtBegin(struct Node *last, int new_data)
{
    // if list is empty then add the node by calling insertInEmpty
    if (last == NULL)
        return insertInEmpty(last, new_data);
    // else create a new node
    struct Node *temp = new Node;
    // set new data to node
    temp->data = new_data;
    temp->next = last->next;
    last->next = temp;
    return last;
}
struct Node *insertAtEnd(struct Node *last, int new_data)
{
    if (last == NULL)
        return insertInEmpty(last, new_data);
    struct Node *temp = new Node;
    temp->data = new_data;
    temp->next = last->next;
    last->next = temp;
    last = temp;
    return last;
}
void traverseList(struct Node *last)
{
    struct Node *p;
    if (last == NULL)
    {
        cout << "Circular linked List is empty." << endl;
        return;
    }
    p = last->next;
    do
    {
        cout << p->data << "==>";
        p = p->next;
    } while (p != last->next);
    if (p == last->next)
        cout << p->data;
    cout << "\n\n";
}
void deleteNode(Node **head, int key)
{
    // If linked list is empty retun
    if (*head == NULL)
        return;
    if ((*head)->data == key && (*head)->next == *head)
    {
        free(*head);
        *head = NULL;
    }
    Node *last = *head, *d;
    if ((*head)->data == key)
    {
        while (last->next != *head)
            last = last->next;
        last->next = (*head)->next;
        free(*head);
        *head = last->next;
    }
    while (last->next != *head && last->next->data != key)
    {
        last = last->next;
    }
    if (last->next->data == key)
    {
        d = last->next;
        last->next = d->next;
        cout << "The node with data " << key << " deleted from the list" << endl;
        free(d);
        cout << endl;
        cout << "Circular linked list after deleting " << key << " is as follows:" << endl;
        traverseList(last);
    }
    else
        cout << "The node with data " << key << " not found in the list" << endl;
}
int main()
{
    int size, val, ch;
    struct Node *last = NULL;
    cout << "=======MENU======";
    cout << "\n1.Insert In EmptyList\n2.Insert at Begin\n3.Insert at End\n4.Display\n5.Delete\n6.Exit";
    while (1)
    {
        cout << "\nEnter your choice: ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            cout << "\nInsert element in EmptyList: ";
            cin >> val;
            last = insertInEmpty(last, val);
            break;
        case 2:
            cout << "\nInsert element At begin: ";
            cin >> val;
            last = insertAtBegin(last, val);
            break;
        case 3:
            cout << "\nInsert element At End: ";
            cin >> val;
            last = insertAtBegin(last, val);
            break;
        case 4:
            cout << "\nThe circular linked list created is as follows:" << endl;
            traverseList(last);
            break;
        case 5:
            cout << "\nEnter an element to delete: ";
            cin >> val;
            deleteNode(&last, val);
            break;
        case 6:
            exit(0);
        default:
            cout << "Invalid Choice";
        }
    }
    return 0;
}