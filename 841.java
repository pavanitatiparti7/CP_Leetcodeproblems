//using DFS
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited=new HashSet<>();
        visited.add(0);
        dfs(rooms, 0, visited);
        return visited.size()==rooms.size();  
    }
    public void dfs(List<List<Integer>> rooms, int key, Set<Integer> visited){
        for(int ul:rooms.get(key)){
            if(!visited.contains(ul)){
                visited.add(ul);
                dfs(rooms, ul, visited);
            }
        }
    }
 }
//Using set
/*class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        while(!stack.isEmpty()){
            int ul=stack.pop();
            visited.add(ul);
            for(int key:rooms.get(ul)){
                if(!visited.contains(key)){
                    stack.push(key);
                }
            }
        }
        return visited.size()==rooms.size();  
    }
 }*/

//Using boolean array
// class Solution {
//     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//         boolean[] visited=new boolean[rooms.size()];
//         Stack<Integer> stack=new Stack<>();
//         stack.push(0);
//         while(!stack.isEmpty()){
//             int ul=stack.pop();
//             visited[ul]=true;
//             for(int key:rooms.get(ul)){
//                 if(!visited[key]){
//                     stack.push(key);
//                 }
//             }
//         }
//         for(int i=0;i<rooms.size();i++){
//             if(!visited[i]){
//                 return false;
//             }
//         }
//         return true;  
//     }
//  }

