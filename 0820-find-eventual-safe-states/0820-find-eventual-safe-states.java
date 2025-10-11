class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        int n = graph.length;

        boolean []vis = new boolean[n];
        boolean []rec = new boolean[n];
        int []arr = new int[n];

        for(int i=0;i<n;i++){
           if(!vis[i]){
                dfs(graph,i,vis,rec,arr);
           }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) list.add(i);
        }


        return list;
    }
    public boolean dfs(int[][]graph,int curr,boolean[]vis,boolean[]rec,int[]arr){
        vis[curr] = true; 
        rec[curr] = true;       
        for(int i=0;i<graph[curr].length;i++){
            if(!vis[graph[curr][i]]){
                if(dfs(graph,graph[curr][i],vis,rec,arr)) return true;
            }else if(rec[graph[curr][i]]) return true;
        }
        arr[curr] = 1;
        rec[curr] = false;
        return false;
    }
}