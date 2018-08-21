package com.tutorial.hackerrank;

import java.util.*;

/**
 * 
 * @author Smit
 * Input
    10
	1 97
	2
	1 20
	2
	1 26
	1 20
	2
	3
	1 91
	3
 * Output
   26
   91
 */
public class MaximumElement {
    
    public class Node{
        int item;
        int max;
        Node(int n, int m){
            this.item = n;
            this.max = m;
        }
    }

    public class Stack{
        private Node array[];
        private int peekIndex;
    
        Stack(int n){
            array = new Node[n];
            peekIndex = -1;
        }
        
        void push(int n){
            int prev = peekIndex;
            peekIndex++;
            if(prev != -1) array[peekIndex] = new Node(n,Math.max(n,array[prev].max));
            if(prev == -1) array[peekIndex] = new Node(n,n);
        }
        
        int pop(){ 
            int returnval = -1;
            if(peekIndex > -1){
                returnval = array[peekIndex].item;
                peekIndex--;
            }
            return returnval; 
        }
        
        Node peek(){
            return array[peekIndex];
        }
        
        void printMax(){
            System.out.println(peek().max);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        MaximumElement solution = new MaximumElement();
        Stack stack = solution.new Stack(t);
        while(s.hasNext()){
            String ss = s.nextLine();
            String[] breaks = ss.split(" ");
            int type = Integer.parseInt(breaks[0]);
            int te = 0;
            if(type == 1) te = Integer.parseInt(breaks[1]);
            
            if(type == 1) stack.push(te);
            if(type == 2) stack.pop();
            if(type == 3) stack.printMax();
        }
        s.close();
        
    }
}