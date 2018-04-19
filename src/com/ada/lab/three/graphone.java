package com.ada.lab.three;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;

public class graphone {
	double[][] adj;

	graphone(double[][] a) {
		adj = new double[a.length][a.length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++)
				adj[i][j] = a[i][j];
	}

	public HashSet<Integer> neighbours(int v) {
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < adj.length; i++)
			if (adj[v][i] != 0)
				h.add(i);

		return h;
	}

	public HashSet<Integer> vertices() {
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < adj.length; i++)
			h.add(i);
		return h;
	}

	@SuppressWarnings("unchecked")
	// returns a new path with i at the end of path
	ArrayList<Integer> addToEnd(int i, ArrayList<Integer> path) {
		ArrayList<Integer> k;
		k = (ArrayList<Integer>) path.clone();
		k.add(i);
		return k;
	}

	public HashSet<ArrayList<Integer>> shortestPaths1(HashSet<ArrayList<Integer>> sofar, HashSet<Integer> visited,
			int end) {
		HashSet<ArrayList<Integer>> more = new HashSet<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
		@SuppressWarnings("unchecked")
		HashSet<Integer> newVisited = (HashSet<Integer>) visited.clone();
		boolean done = false;
		boolean carryon = false;
		for (ArrayList<Integer> p : sofar) {
			for (Integer z : neighbours(p.get(p.size() - 1))) {
				if (!visited.contains(z)) {
					carryon = true;
					newVisited.add(z);
					if (z == end) {
						done = true;
						result.add(addToEnd(z, p));
					} else{
						more.add(addToEnd(z, p));
					}
				}
			}
		}
		if (done)
			return result;
		else if (carryon)
			return shortestPaths1(more, newVisited, end);
		else
			return new HashSet<ArrayList<Integer>>();
	}

	public HashSet<ArrayList<Integer>> shortestPaths(int first, int end) {
		HashSet<ArrayList<Integer>> sofar = new HashSet<ArrayList<Integer>>();
		HashSet<Integer> visited = new HashSet<Integer>();
		ArrayList<Integer> starting = new ArrayList<Integer>();
		starting.add(first);
		sofar.add(starting);
		if (first == end)
			return sofar;
		visited.add(first);
		return shortestPaths1(sofar, visited, end);
	}

	int findSmallest(HashMap<Integer, Double> t) {
		Object[] things = t.keySet().toArray();
		double val = t.get(things[0]);
		int least = (int) things[0];
		Set<Integer> k = t.keySet();
		for (Integer i : k) {
			if (t.get(i) < val) {
				least = i;
				val = t.get(i);
			}
		}
		return least;
	}

	public ArrayList<Integer> dijkstra(int start, int end) {
		int N = adj.length;
		HashMap<Integer, Double> Q = new HashMap<Integer, Double>();
		ArrayList<Integer>[] paths = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			if(i != start) Q.put(i, Double.POSITIVE_INFINITY);
			
			paths[i] = new ArrayList<Integer>();
			paths[i].add(start);
		}
		
		HashSet<Integer> S = new HashSet<Integer>();
		S.add(start);
		Q.put(start, 0.0);
		
		while (!Q.isEmpty()) {
			int v = findSmallest(Q);
			if (v == end && Q.get(v) != Double.POSITIVE_INFINITY)
				return paths[v];// equivalent to end.
			
			double w = Q.get(v);
			S.add(v);
			
			for (int u : neighbours(v))
				if (!S.contains(u)) {
					double w1 = adj[v][u] + w;
					if (w1 < Q.get(u)) {
						Q.put(u, w1);
						paths[u] = addToEnd(u, paths[v]);
					}
				}
			Q.remove(v);
		}
		return new ArrayList<Integer>();
	}

	public static void main(String[] args) {
		double[][] a = { { 0.0, 1.0, 1.0, 0.0 }, { 0.0, 0.0, 1.0, 1.0 }, { 0.0, 1.0, 0.0, 1.0 },
				{ 0.0, 1.0, 1.0, 0.0 } };
		graphone g = new graphone(a);
		 for (int i=0;i<a.length;i++)
		 {
		 for (int j=0;j<a.length;j++)
			 if (i!=j) System.out.println(i + " to " + j +":"+g.shortestPaths(i,j));
		 }
	}
}
