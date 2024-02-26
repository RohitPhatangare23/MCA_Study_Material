#include <iostream>
#define max 5
using namespace std;
class CircularQ
{
public:
    int cq[max];
    int front, rear;
    CircularQ();
    void enqueue();
    void dequeue();
    void display();
};
CircularQ::CircularQ()
{
    front = rear = -1;
}
void CircularQ::enqueue()
{
    int num;
    // checking overflow
    if (front == (rear + 1) % max) // user if(front==0 && rear==max-1)
    {
        cout << "Queue is full\n";
        return;
    }
    else
    {
        cout << "enter number::";
        cin >> num;
        // queue is empty
        if (front == -1)
            rear = front = 0;
        else
            rear = (rear + 1);
    }
    cq[rear] = num;
    cout << num << "is inserted..";
}
void CircularQ::dequeue()
{
    int num;
    if (front == -1)
        cout << "Queue is empty";
    else
    {
        num = cq[front];
        cout << "deleted item is::" << num;
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1);
    }
}
void CircularQ::display()
{
    int i;
    if (front == -1)
        cout << "Queue is empty";
    else
    {
        cout << "\n queue elements are:: \n";
        for (i = front; i <= rear; i++)
            cout << cq[i] << "\t";
    }
    if (front > rear)
    {
        for (i = front; i < max; i++)
            cout << cq[i] << "t";
        for (i = 0; i <= rear; i++)
            cout << cq[i] << "\t";
    }
}
int main()
{
    CircularQ c;
    int choice;
    while (1)
    {
        cout << "\n ---- Circular Queue Operation---\n";
        cout << "\n 1. Enqueue \n 2. Dequeue \n 3.Display\n 4. Exit";
        cout << "\n Enter the Choice::";
        cin >> choice;
        switch (choice)
        {
        case 1:
            c.enqueue();
            break;
        case 2:
            c.dequeue();
            break;
        case 3:
            c.display();
            break;
        case 4:
            exit(0);
            break;
        default:
            cout << "Wrong Choice";
            break;
        }
    }
    return 0;
}