import java.util.Stack;

public class PYPRan {

	public static void main(String[] args) {
		int[] a = {5,6,7,9}; //5,6,7,19
		int[] m = new int[4]; //5,11,18,19

		m[0] = a [0];
		char c = 55;
		for (int i=0; i <a.length-1; i++){

		m [i+1] = Math.max (m[i] + a [i+1], a[i+1]);
			

		}
		strVar("HellO");
		strVar("There is a quite mouse");
		revStr("I am happy");
	}
	
	public static void strVar(String input){
		char[] a = input.toCharArray();
		int countV = 0, countC = 0;
		for(int i=0; i<a.length; i++){
			
			if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' | a[i] == 'o' || a[i] == 'u' || a[i] == 'y') countV++;
			else if(a[i] == ' ') continue;
			else countC++; 
		}
		System.out.println(countV);
		System.out.println(countC);
	}
	
	public static void revStr(String input){
		Stack<Character> s = new Stack<>();
		for(int i=0; i<input.length(); i++){
			s.add(new Character(input.charAt(i)));
		}
		System.out.println(s);
	}
	
	

}
