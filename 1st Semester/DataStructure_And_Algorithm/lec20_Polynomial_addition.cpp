#include <iostream>
using namespace std;
class Node
{
public:
    int coeff, pow;
    Node *next;
    Node(int c, int p) : coeff(c), pow(p), next(nullptr) {}
};
class Polynomial
{
public:
    Node *head;
    Polynomial() : head(nullptr) {}
    void insertTerm(int coeff, int pow)
    {
        Node *newTerm = new Node(coeff, pow);
        if (!head)
        {
            head = newTerm;
        }
        else
        {
            Node *temp = head;
            while (temp->next)
            {
                temp = temp->next;
            }
            temp->next = newTerm;
        }
    }
    Polynomial add(const Polynomial &other) const
    {
        Polynomial result;
        Node *temp1 = head;
        Node *temp2 = other.head;
        while (temp1 && temp2)
        {
            if (temp1->pow == temp2->pow)
            {
                result.insertTerm(temp1->coeff + temp2->coeff, temp1->pow);
                temp1 = temp1->next;
                temp2 = temp2->next;
            }
            else if (temp1->pow > temp2->pow)
            {
                result.insertTerm(temp1->coeff, temp1->pow);
                temp1 = temp1->next;
            }
            else
            {
                result.insertTerm(temp2->coeff, temp2->pow);
                temp2 = temp2->next;
            }
        }
        while (temp1)
        {
            result.insertTerm(temp1->coeff, temp1->pow);
            temp1 = temp1->next;
        }
        while (temp2)
        {
            result.insertTerm(temp2->coeff, temp2->pow);
            temp2 = temp2->next;
        }
        return result;
    }
    void display() const
    {
        Node *temp = head;
        while (temp)
        {
            cout << temp->coeff << "x^" << temp->pow;
            temp = temp->next;
            if (temp)
            {
                cout << " + ";
            }
        }
        cout << endl;
    }
};
int main()
{
    Polynomial poly1, poly2, result;
    poly1.insertTerm(5, 2);
    poly1.insertTerm(4, 1);
    poly1.insertTerm(2, 0);
    poly2.insertTerm(-5, 1);
    poly2.insertTerm(-5, 0);
    cout << "1st Number: ";
    poly1.display();
    cout << "2nd Number: ";
    poly2.display();
    result = poly1.add(poly2);
    cout << "Added Polynomial: ";
    result.display();
    return 0;
}