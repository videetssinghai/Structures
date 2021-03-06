package com.graph;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

import com.graphs.DepthFirstSearch;
import com.graphs.Graph;

import junit.framework.TestCase;

public class DFSTest extends TestCase {

	private Graph graph;
	public void setUp() {
		Scanner scn = null;
		try {
			URL url = this.getClass().getClassLoader().getResource("tinyGraph.txt");
			scn = new Scanner(new File(url.getFile()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.graph = new Graph(scn);
		
	}
	
	/*
	 *  1. Is the given graph is connected?
	 *  2. Is there any path between source vertex and given vertex.
	 */
	public void testDFSQueries() {
		DepthFirstSearch dfs = new DepthFirstSearch(graph, 0);
	}
}
