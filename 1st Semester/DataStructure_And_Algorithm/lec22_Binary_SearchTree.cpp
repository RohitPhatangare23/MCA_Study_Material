#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *left;
    Node *right;
};
Node *createNode(int value)
{
    Node *newNode = new Node;
    newNode->data = value;
    newNode->left = newNode->right = nullptr;
    return newNode;
}
Node *insertNode(Node *root, int value)
{
    if (root == nullptr)
        return createNode(value);
    if (value < root->data)
        root->left = insertNode(root->left, value);
    else if (value > root->data)
        root->right = insertNode(root->right, value);
    return root;
}
Node *findMinValueNode(Node *node)
{
    Node *current = node;
    while (current && current->left != nullptr)
        current = current->left;
    return current;
}
Node *deleteNode(Node *root, int value)
{
    if (root == nullptr)
        return root;
    if (value < root->data)
        root->left = deleteNode(root->left, value);
    else if (value > root->data)
        root->right = deleteNode(root->right, value);
    else
    {
        if (root->left == nullptr)
        {
            Node *temp = root->right;
            delete root;
            return temp;
        }
        else if (root->right == nullptr)
        {
            Node *temp = root->left;
            delete root;
            return temp;
        }
        Node *temp = findMinValueNode(root->right);
        root->data = temp->data;
        root->right = deleteNode(root->right, temp->data);
    }
    return root;
}
int findHeight(Node *root)
{
    if (root == nullptr)
        return 0;
    else
    {
        int leftHeight = findHeight(root->left);
        int rightHeight = findHeight(root->right);
        return max(leftHeight, rightHeight) + 1;
    }
}
void inorderTraversal(Node *root)
{
    if (root != nullptr)
    {
        inorderTraversal(root->left);
        cout << root->data << " ";
        inorderTraversal(root->right);
    }
}
void preorderTraversal(Node *root)
{
    if (root != nullptr)
    {
        cout << root->data << " ";
        preorderTraversal(root->left);
        preorderTraversal(root->right);
    }
}
void postorderTraversal(Node *root)
{
    if (root != nullptr)
    {
        postorderTraversal(root->left);
        postorderTraversal(root->right);
        cout << root->data << " ";
    }
}
int findMaxValue(Node *root)
{
    if (root == nullptr)
        return -1;
    while (root->right != nullptr)
        root = root->right;
    return root->data;
}
Node *buildBST()
{
    Node *root = nullptr;
    int n, value;
    cout << "Enter number of nodes in BST:";
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        cout << "Enter value for node" << i + 1 << ":";
        cin >> value;
        root = insertNode(root, value);
    }
    return root;
}
int main()
{
    Node *root = buildBST();
    cout << "\nInOrder Traversal:";
    inorderTraversal(root);
    cout << endl;
    cout << "PreOrder Traversal:";
    preorderTraversal(root);
    cout << endl;
    cout << "PostOrder Traversal:";
    postorderTraversal(root);
    cout << endl;
    cout << "Height of BST:" << findHeight(root) << endl;
    cout << "Maximium Value in BST:" << findMaxValue(root) << endl;
    int deleteValue;
    cout << "Enter value to delete from BST:";
    cin >> deleteValue;
    root = deleteNode(root, deleteValue);
    cout << "BST after deleting" << deleteValue << ":";
    inorderTraversal(root);
    return 0;
}