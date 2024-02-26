#include <iostream>
#define MAX 20
using namespace std;
class Graph
{
    int adj[MAX][MAX];
    int node, edge;

public:
    Graph()
    {
        int i, j;
        for (int i = 0; i < MAX; i++)
            for (int j = 0; j < MAX; j++)
                adj[i][j] = 0;
        node = 0;
        edge = 0;
    }
    void CreateGraph();
    void display();
};
void Graph::CreateGraph()
{
    int origin, dest, i;
    cout << "Enter the no of nodes:";
    cin >> node;
    cout << "\nEnter the no of edges:";
    cin >> edge;
    for (i = 1; i <= edge; i++)
    {
        cout << "\nEnter Edge:" << i << endl;
        cout << "\nEnter Origin:";
        cin >> origin;
        cout << "\nEnter Dest:";
        cin >> dest;
        adj[origin][dest] = 1;
        adj[dest][origin] = 1;
        cout << endl;
    }
}
void Graph::display()
{
    int i, j;
    for (i = 1; i <= node; i++)
    {
        for (j = 1; j <= node; j++)
            cout << adj[i][j] << " ";
        cout << endl;
    }
}
int main()
{
    Graph g;
    g.CreateGraph();
    g.display();
}