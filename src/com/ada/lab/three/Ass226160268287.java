package com.ada.lab.three;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Ass226160268287 {

	static int N = 3000;
	static double[][] edges = new double[N][N];
	static TreeMap<Integer, String> airportNames = new TreeMap<Integer, String>();

	static ArrayList<String> convert(ArrayList<Integer> m) {
		ArrayList<String> z = new ArrayList<String>();
		for (Integer i : m)
			z.add(airportNames.get(i));
		return z;
	}

	static HashSet<ArrayList<String>> convert(HashSet<ArrayList<Integer>> paths) {
		HashSet<ArrayList<String>> k = new HashSet<ArrayList<String>>();
		for (ArrayList<Integer> p : paths)
			k.add(convert(p));
		return k;
	}

	static ArrayList<Integer> firstElement(HashSet<ArrayList<Integer>> s) {
		return (ArrayList<Integer>) s.toArray()[0];
	}

	static double realDistance(double lat1, double lon1, double lat2, double lon2) {
		int R = 6371;
		double dLat = (lat2 - lat1) * Math.PI / 180;
		double dLon = (lon2 - lon1) * Math.PI / 180;

		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(lat1 * Math.PI / 180)
				* Math.cos(lat2 * Math.PI / 180) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double d = R * c;
		return d;
	}

	public static void main(String[] args) throws Exception {
		String airportFileName = "";
		String airports_lon_latFileName = "";
		String randomGraphFileName = "";
		long startTime = System.currentTimeMillis();
		try {
			airportFileName = args[0];
			airports_lon_latFileName = args[1];
			randomGraphFileName = args[2];
		} catch (Exception ex) {
		}
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				edges[i][j] = 0.0;
		Scanner s = new Scanner(new FileReader(randomGraphFileName));
		String z = s.nextLine();
		double[][] edgesWithWeight = new double[N][N];
		while (s.hasNext()) {
			z = s.nextLine();
			String[] results = z.split(",");
			edges[Integer.parseInt(results[0])][Integer.parseInt(results[1])] = 1.0;
			edges[Integer.parseInt(results[1])][Integer.parseInt(results[0])] = 1.0;
			edgesWithWeight[Integer.parseInt(results[1])][Integer.parseInt(results[0])] = Double
					.parseDouble(results[2]);
			edgesWithWeight[Integer.parseInt(results[0])][Integer.parseInt(results[1])] = Double
					.parseDouble(results[2]);
		}
		s = new Scanner(new FileReader(airportFileName));
		z = s.nextLine();
		while (s.hasNext()) {
			z = s.nextLine();
			String[] results = z.split(",");
			airportNames.put(Integer.parseInt(results[0]), results[1]);
		}

		System.out.println("Name: Smit Shah");
		System.out.println("Student ID: 160268287");
		Ass226160268287 as = new Ass226160268287();
		graph G = as.new graph(edges);

		// Question 1: Finding the shortest path between the 880 and 1027.
		int st_fin_count = convert(G.shortestPaths(880, 2017)).size();
		System.out.println("Question 1: " + st_fin_count);

		// Question 2: Nested loops to retrieve the highest number of the
		// shortest paths.
		// The initial position starts from 0, however if there are no airports
		// with that ID, it will not configure its result.
		int airportOne = 0;
		int airportTwo = 0;
		int highestShortPaths = Integer.MIN_VALUE;
		HashSet<ArrayList<String>> isHighest = new HashSet<ArrayList<String>>();
		for (int i = 0; i < edges.length; i++) {
			for (int j = 0; j < edges.length; j++) {
				if (i != j && airportNames.get(i) != null && airportNames.get(j) != null) {
					HashSet<ArrayList<String>> HAS = convert(G.shortestPaths(i, j));
					if (highestShortPaths < HAS.size()) {
						isHighest = HAS;
						highestShortPaths = HAS.size();
						airportOne = i;
						airportTwo = j;
					}

				}
			}
		}
		// Displaying out the airport code of the highest shortest path.
		System.out.println("Question 2: " + airportOne + " " + airportTwo);

		// Displaying the count of the airport code of the highest shortest
		// paths.
		System.out.println("Question 3: " + highestShortPaths);

		ArrayList<String> path = (ArrayList<String>) isHighest.toArray()[0];
		System.out.println("Question 4: " + path.size());

		// Question 5: Yet to complete.
		ArrayList<HashSet<ArrayList<Integer>>> aha = new ArrayList<HashSet<ArrayList<Integer>>>();
		int furtherestAwayFromLAX = 0;
		for (int i = 0; i < edges.length; i++) {
			int j = 2435;
			if (i != j && airportNames.get(i) != null && airportNames.get(j) != null) {
				HashSet<ArrayList<Integer>> HAS = G.shortestPaths(i, j);
				if (HAS.size() > 0) {
					ArrayList<Integer> fe = firstElement(HAS);
					if (fe.size() > furtherestAwayFromLAX) {
						furtherestAwayFromLAX = fe.size();
					}
					aha.add(HAS);
				}
			}
		}
		System.out.print("Question 5: ");
		for (int i = 0; i < aha.size(); i++) {
			ArrayList<Integer> fe = firstElement(aha.get(i));
			if (fe.size() == furtherestAwayFromLAX)
				System.out.print(fe.get(0) + " ");
		}
		System.out.println("");

		// Question 6 - It requires to calculate based on the weighted graph.
		// Such that it requires to re-instailize the graph with weighted edges.
		G = as.new graph(edgesWithWeight);
		System.out.println("Question 6: " + G.dijkstra(2638, 997).size());

		// Question 7 - It requires to calculate based on the distance graph and
		// not weighted nor just (no. of stops). Such that it requires to read
		// from the file named airport lat long.
		HashMap<Integer, String> ts = new HashMap<Integer, String>();
		s = new Scanner(new FileReader(airports_lon_latFileName));
		while (s.hasNextLine()) {
			z = s.nextLine();
			String[] results = z.split(",");
			ts.put(Integer.parseInt(results[0]), results[1] + "," + results[2]);
		}
		for (HashMap.Entry<Integer, String> entry : ts.entrySet()) {
			Integer key = entry.getKey();
			String iLonLat = entry.getValue();
			for (HashMap.Entry<Integer, String> jEntry : ts.entrySet()) {
				Integer jKey = jEntry.getKey();
				String jLonLat = jEntry.getValue();
				double iLon = Double.parseDouble(iLonLat.split(",")[0]);
				double iLat = Double.parseDouble(iLonLat.split(",")[1]);
				double jLon = Double.parseDouble(jLonLat.split(",")[0]);
				double jLat = Double.parseDouble(jLonLat.split(",")[1]);
				edges[key][jKey] = realDistance(iLat, iLon, jLat, jLon);
			}
		}
//		for (int i = 0; i < edges.length; i++) {
//			String iLonLat = ts.get(i);
//			if (iLonLat == null)
//				continue;
//			for (int j = 0; j < edges.length; j++) {
//				String jLonLat = ts.get(j);
//				if (iLonLat != null && jLonLat != null) {
//					double iLon = Double.parseDouble(iLonLat.split(",")[0]);
//					double iLat = Double.parseDouble(iLonLat.split(",")[1]);
//					double jLon = Double.parseDouble(jLonLat.split(",")[0]);
//					double jLat = Double.parseDouble(jLonLat.split(",")[1]);
//					edges[i][j] = realDistance(iLat, iLon, jLat, jLon);
//				} else {
//					edges[i][j] = Double.MAX_VALUE;
//				}
//			}
//		}
		G = as.new graph(edges);
		System.out.println("Question 7: " + G.dijkstra(2281, 1110).size());
		System.out.println("Total Time Taken: " + ((System.currentTimeMillis() - startTime) / 100) + " seconds");
		s.close();
	}

	public class graph {
		double[][] adj;

		graph(double[][] a) {
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
						} else {
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
				if (i != start)
					Q.put(i, Double.POSITIVE_INFINITY);

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
	}
}