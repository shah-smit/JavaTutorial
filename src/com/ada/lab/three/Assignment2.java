package com.ada.lab.three;

import java.io.*;
import java.util.*;

class Assignment2 {
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
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				edges[i][j] = 0.0;
		Scanner s = new Scanner(new FileReader("randomGraphSimple"));
		String z = s.nextLine();
		while (s.hasNext()) {
			z = s.nextLine();
			String[] results = z.split(",");
			edges[Integer.parseInt(results[0])][Integer.parseInt(results[1])] = 1.0;
			edges[Integer.parseInt(results[1])][Integer.parseInt(results[0])] = 1.0;
		}
		s = new Scanner(new FileReader("airports"));
		z = s.nextLine();
		while (s.hasNext()) {
			z = s.nextLine();
			String[] results = z.split(",");
			airportNames.put(Integer.parseInt(results[0]), results[1]);
		}
		
		
		System.out.println("Name: Smit Shah");
		System.out.println("Student ID: 160268287");
		graphone G = new graphone(edges);
		int st = Integer.parseInt("880");
		int fin = Integer.parseInt("1027");
		int st_fin_count = convert(G.shortestPaths(st, fin)).size();
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

		System.out.println("Question 6: " + G.dijkstra(2638, 997).size());

		System.out.println("Question 7: " + G.dijkstra(2281, 1110).size());

	}
}
