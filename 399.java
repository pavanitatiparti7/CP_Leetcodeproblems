class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> adj_list=new HashMap<>();
        for(int i=0;i<equations.size();i++){
            String u=equations.get(i).get(0);
            String v=equations.get(i).get(1);
            double val=values[i];
            adj_list.put(u, adj_list.getOrDefault(u, new HashMap<>()));
            adj_list.put(v, adj_list.getOrDefault(v, new HashMap<>()));
            adj_list.get(u).put(v, val);
            adj_list.get(v).put(u, 1.0/val);
        }
        double[] res=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String source=queries.get(i).get(0);
            String target=queries.get(i).get(1);
            Set<String> visited=new HashSet<>();
            double w=dfs(adj_list, source, target, visited);
            res[i]=w;
        }
        return res;
    }
    public double dfs(Map<String, Map<String, Double>> adj_list, String source, String target, Set<String> visited){
        if(!adj_list.containsKey(source)||!adj_list.containsKey(target)){
            return -1.0;
        }
        if(adj_list.get(source).containsKey(target)){
            return adj_list.get(source).get(target);
        }
        visited.add(source);
        for(Map.Entry<String, Double> nei:adj_list.get(source).entrySet()){
            String nxtNode=nei.getKey();
            if(!visited.contains(nxtNode)){
                double temp=dfs(adj_list, nxtNode, target, visited);
                if(temp!=-1.0){
                    return temp*nei.getValue();
                }
            }
        }
        return -1.0;
    }
}
