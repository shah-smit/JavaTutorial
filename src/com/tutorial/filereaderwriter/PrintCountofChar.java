package com.tutorial.filereaderwriter;



public class PrintCountofChar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		FileReader fr = new FileReader("marks.txt");
//		BufferedReader sc = new BufferedReader(fr);
//		int alChar = 0;
//		while(alChar != -1)
//		{
//			alChar = sc.read();
//			
//		}
		String s ="rise for vote, sir!";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		int[] a = {1,2,3,4,5};
		boolean result = linearSearch(a,5);
		System.out.println(result);
	}
	
	static boolean linearSearch(int[] a, int thing)
	{
		int i=0;
		for(i=0; i<a.length&&a[i]!=thing; i++);
		return (a[i-1]==thing);
	}

}
