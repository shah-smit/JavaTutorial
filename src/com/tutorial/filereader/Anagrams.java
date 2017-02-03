package com.tutorial.filereader;

public class Anagrams {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagramm","marganaa"));
	}
	
	static boolean isAnagram(String a, String b) {
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        if(a.length() != b.length())
	        {
	            return false;
	        }
	        
	        else
	        {
	            char[] aChar = a.toCharArray();
	            char[] bChar = b.toCharArray();
	            
	            for(int i=0; i<aChar.length; i++)
	            {
	                for(int j=0; j<bChar.length; j++)
	                {
	                    if(aChar[i] == bChar[j])
	                    {
	                        aChar[i] = '\0';
	                        bChar[j] = '\0';
	                    }
	                }
	            }
	            
	            for(int i=0; i<aChar.length; i++)
		        {
		        	if(aChar[i] != '\0')
		        	{
		        		return false;
		        	}
		        }
	            return true;
	        }
	        
	        
	        
	}
}
