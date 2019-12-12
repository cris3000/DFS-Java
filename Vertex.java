package dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	
	private String name;
	private boolean visited;
	private List<Vertex> adjaceniesList;
	private Vertex predecessor;
	
	
	public Vertex(String name) {
		this.name = name;
		this.adjaceniesList= new ArrayList<Vertex>();
	}
	
	public void addNeighbour(Vertex vertex) {
		this.adjaceniesList.add(vertex);
	}

	/**
	 * @return the visited
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * @param visited the visited to set
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/**
	 * @return the predecessor
	 */
	public Vertex getPredecessor() {
		return predecessor;
	}

	/**
	 * @param predecessor the predecessor to set
	 */
	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	/**
	 * @return the adjaceniesList
	 */
	public List<Vertex> getAdjaceniesList() {
		return adjaceniesList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  " " +this.name;
	}
	
	
}
