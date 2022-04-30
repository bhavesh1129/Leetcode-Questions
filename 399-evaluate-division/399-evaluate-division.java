class Solution {
    
    public double dfs(HashMap<String, HashMap<String, Double>> map, String s, String d, double ans, HashSet<String> visited){
        if(!map.containsKey(s) || !map.containsKey(d)){
            return -1.0;
        }
        if(map.get(s).containsKey(d)){
            return ans*map.get(s).get(d);
        }
        visited.add(s);
        for(String edge: map.get(s).keySet()){
            if(!visited.contains(edge)){
                double temp = map.get(s).get(edge);
                double small = dfs(map, edge, d, ans*temp, visited);
                if(small != -1)
                    return small;
            }
        }
        return -1.0;
    }
    
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        for(int i=0;i<values.length;i++){
            if(map.containsKey(equations.get(i).get(0))){
                HashMap<String, Double> temp = map.get(equations.get(i).get(0));
                temp.put(equations.get(i).get(1),values[i]);
            }else{
                HashMap<String, Double> temp = new HashMap<String,Double>();
                temp.put(equations.get(i).get(1),values[i]);
                map.put(equations.get(i).get(0), temp);
            }
            if(map.containsKey(equations.get(i).get(1))){
                HashMap<String, Double> temp = map.get(equations.get(i).get(1));
                temp.put(equations.get(i).get(0),1/values[i]);
            }else{
                HashMap<String, Double> temp = new HashMap<String,Double>();
                temp.put(equations.get(i).get(0),1/values[i]);
                map.put(equations.get(i).get(1), temp);
            }
        }
        double ans[] = new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String s  = queries.get(i).get(0);
            String d = queries.get(i).get(1);
            HashSet<String> visited = new HashSet<>();
            ans[i] = dfs(map, s, d, 1.0, visited);
        }
        return ans;
    }
}