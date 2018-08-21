package com.tutorial.hackerrank;

public class CoinChangeDynamicProgramming {
	public static void main(String[] args){
		int total = 1020;
		total = total + 1;
		int[] coins = {10, 1, 8};
		int[] minCoin = new int[total];
		int[] minCoinIndex = new int[total];
		
		for(int i=0; i<total; i++) minCoin[i] = Integer.MAX_VALUE;
		for(int i=0; i<total; i++) minCoinIndex[i] = -1;
		
		minCoin[0] = 0;
		
		for(int i=0; i<coins.length; i++){
			int currCoinValue = coins[i];
			for(int j=currCoinValue; j<total; j++){
				int currCoinCount = minCoin[j];
				int m = Math.min(currCoinCount, minCoin[j-currCoinValue]+1);
				if(m != currCoinCount) {
					minCoin[j] = m;
					minCoinIndex[j] = i;
				}
			}
		}
		
//		for(int i=0; i<total; i++) System.out.println("Coin Count"+i+" is:"+minCoin[i]);
		System.out.println(minCoin[total-1]);
	}
}
