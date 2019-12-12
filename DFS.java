package dfs;


public class DFS {
	
	
	public void dfs(Vertex vertex) {
		

		System.out.println(vertex + " ");
		
		for(Vertex v: vertex.getAdjaceniesList()) {
			if(!v.isVisited()) {
				v.setVisited(true);
				v.setPredecessor(vertex);
				dfs(v);
				}
			}
		}
}
