package dfs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vertex vertexA = new Vertex ("A");
		Vertex vertexB = new Vertex ("B");
		Vertex vertexC = new Vertex ("C");
		Vertex vertexD = new Vertex ("D");
		Vertex vertexE = new Vertex ("E");
		
		vertexA.addNeighbour(vertexB);
		vertexA.addNeighbour(vertexC);
		
		vertexB.addNeighbour(vertexD);
		vertexB.addNeighbour(vertexE);

		
		DFS dfs = new DFS();
		dfs.dfs(vertexA);
	}

}
