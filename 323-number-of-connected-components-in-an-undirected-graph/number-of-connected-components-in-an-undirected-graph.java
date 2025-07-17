class Solution {
    public int countComponents(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        for(int i=0;i<edges.length;i++){
            int edge[] = edges[i];
            uf.union(edge[0],edge[1]);
        }
        Set<Integer> uniqueroots = new HashSet<>();
        for(int i=0;i<n;i++){
            uniqueroots.add(uf.find(i));
        }
        return uniqueroots.size();
    }

    class UnionFind{
        int[] parent;
        int[] rank;

        public UnionFind(int n){
            parent= new int[n];
            rank = new int[n];

            for(int i=0;i<n;i++){
                parent[i]=i;
                rank[i]=1;
            }
        }
        public int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }
        public boolean union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);

            if(rootX==rootY){
                return false;
            }
              if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }

            return true;
        }

    }
}