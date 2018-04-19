package com.ada.lab.three;

import java.io.FileReader;
import java.util.Scanner;

class testDijk {
	public static void main(String[] args) throws Exception {
		int N = 1000;
		double edges[][] = new double[N][N];
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				edges[i][j] = 0.0;
		
		Scanner s = new Scanner(new FileReader("randomGraph"));
		String z;
		
		while (s.hasNext()) {
			z = s.nextLine();
			String[] results = z.split(",");
			edges[Integer.parseInt(results[0])][Integer.parseInt(results[1])] = Double.parseDouble(results[2]);
		}
		
		graphone G = new graphone(edges);
//		for(int i=0; i<N; i++)
//			for(int j=0; j<N; j++)
//				if(i != j) System.out.println(G.dijkstra(i, j));
		
		int x = 0;
		int y = 999;
		if(args.length > 0 && args != null){
			
			if(args.length == 1 && args[0] != null){
				x = Integer.parseInt(args[0]);
			}
			if(args.length == 2 && args[1] != null){
				y = Integer.parseInt(args[1]);
			}
		}
		System.out.println(G.dijkstra(x, y));
		s.close();
	}
}
