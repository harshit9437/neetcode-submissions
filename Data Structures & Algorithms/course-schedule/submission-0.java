class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList=new ArrayList<>();
        Boolean[] visited=new Boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            adjList.get(edge[0]).add(edge[1]);
        }
        for (int course = 0; course < numCourses; course++) {
            if (hasCycle(course, adjList, new HashSet<>(), visited)) {
                return false;
            }
        }

        return true;
    }
    private boolean hasCycle(int course, List<List<Integer>> adjList, Set<Integer> prereqs, Boolean[] visited) {
        
        if (visited[course] != null) {
            return visited[course];
        }

        if (!prereqs.add(course)) {
            return true;
        }

        for (int prereq : adjList.get(course)) {
            if (hasCycle(prereq, adjList, prereqs, visited)) {
                visited[course] = true;
                return true;
            }
        }

        prereqs.remove(course);
        visited[course] = false;

        return visited[course];
    }
}
