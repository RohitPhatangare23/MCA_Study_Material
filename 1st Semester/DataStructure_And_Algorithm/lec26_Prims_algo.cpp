#include <iostream>
#include <bits/stdc++.h>
using namespace std;
const int MAX = -1;
#define MAX 20
int parent[MAX];
int find(int a)
{
    while (parent[a] != a)
    {
        parent[a] = parent[parent[a]];
        a = parent[a];
    }
    return a;
}
void union_(int a, int b)
{
    int d = find(a);
    int e = find(b);
    parent[d] = parent[e];
}
int main()
{
    int vertices, edges;
    cout << "Number of Vertices:" << endl;
    cin >> vertices;
    cout << "Number of Edges:" << endl;
    cin >> edges;
    vector<pair<int, pair<int, int>>> adj;
    //{weight,{source,destination}};
    for (int i = 0; i < edges; i++)
    {
        int weight, src, destination;
        cin >> weight >> src >> destination;
        adj.push_back({weight, {src, destination}});
    }
    sort(adj.begin(), adj.end());
    for (int i = 0; i < MAX; i++)
    {
        parent[i] = i;
    }
    vector<pair<int, int>> tree_edges;
    int totalweight = 0;
    for (auto x : adj)
    {
        int a = x.second.first;
        int b = x.second.second;
        int cost = x.first;
        if (find(a) != find(b))
        {
            totalweight += cost;
            union_(a, b);
            tree_edges.push_back({a, b});
        }
    }
    cout << "Edges are:" << endl;
    for (auto x : tree_edges)
    {
        cout << x.first << " " << x.second << endl;
    }
    cout << "Total Weight of MST:";
    cout << totalweight << endl;
    return 0;
}