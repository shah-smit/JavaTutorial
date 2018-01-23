package com.ada.lab.three;

import java.util.HashSet;
import java.util.ArrayList;

public class graph
{
		double [] [] adj; 
		graph (double [] [] a) 
		{
				adj= new double [a.length][a.length]; 
				for (int i=0;i<a.length;i++)
					for (int j=0;j<a.length;j++) 
						adj[i][j]=a[i][j];
		}
		
		public HashSet <Integer> neighbours(int v) {
			HashSet <Integer> h = new HashSet <Integer> () ; 
			for (int i=0;i<adj.length;i++) if (adj[v][i]!=0) h.add(i); 
			
			return h;
		}

		public HashSet <Integer> vertices() {
			HashSet <Integer> h = new HashSet <Integer>(); for (int i=0;i<adj.length;i++) h.add(i);
			return h;
		}
		
		@SuppressWarnings("unchecked")
		// returns a new path with i at the end of path
		ArrayList <Integer> addToEnd (int i, ArrayList <Integer> path) 
		{ 
			ArrayList <Integer> k;
			k = (ArrayList<Integer>) path.clone() ; 
			k.add(i);
			return k;
		}

		public HashSet <ArrayList <Integer>> shortestPaths1 ( HashSet <ArrayList <Integer>> sofar, HashSet <Integer> visited, int end)
		{
			System.out.println("Inside Shortest Path 1: ");
			HashSet <ArrayList <Integer>> more = new HashSet <ArrayList <Integer>>(); 
			HashSet <ArrayList <Integer>> result = new HashSet <ArrayList <Integer>>(); 
			@SuppressWarnings("unchecked")
			HashSet <Integer> newVisited = (HashSet <Integer>) visited.clone();
			boolean done = false;
			boolean carryon = false;
				for (ArrayList <Integer> p: sofar)
				{
					System.out.println("Sofar Array List: "+p);
					for (Integer z: neighbours(p.get(p.size()-1))) {
						System.out.println("Neighbours List: "+z);
						if (!visited.contains(z)) {
							carryon=true;
							newVisited.add(z);
							if (z==end) {
								done=true; 
								result.add(addToEnd(z,p));
							} else more.add(addToEnd(z,p));
						} 
					}
				}
				if (done) return result; 
				else
					if (carryon) 
						return shortestPaths1(more,newVisited,end);
					else 
						return new HashSet <ArrayList <Integer>>(); 
				}


		public HashSet <ArrayList <Integer>> shortestPaths(int first, int end) 
		{
			HashSet <ArrayList <Integer>> sofar = new HashSet <ArrayList <Integer>>(); 
			HashSet <Integer> visited = new HashSet <Integer>();
			ArrayList <Integer> starting = new ArrayList <Integer>();
			starting.add(first);
			sofar.add(starting);
				if (first==end) 
					return sofar; 
			visited.add(first);
			return shortestPaths1(sofar,visited,end);
		}


		public static void main(String [] args) {
			double [ ] [] a = {
					{0.0, 1.0, 1.0, 0.0},
					{0.0, 0.0, 1.0, 1.0}, 
					{0.0, 1.0, 0.0, 1.0}, 
					{0.0, 1.0, 1.0, 0.0}
			};
			graph g = new graph(a);
			int i=0;
			int j=1;
			System.out.println(i + " to " + j +": "+g.shortestPaths(1,j));
//			for (int i=0;i<a.length;i++)
//			{ 
//				for (int j=0;j<a.length;j++)
//					if (i!=j) System.out.println(i + " to " + j +": "+g.shortestPaths(i,j)); 
//			}
		} 
}
