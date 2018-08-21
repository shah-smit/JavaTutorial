package com.tutorial.recursion;

public class StringReverse 
{
    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    
    public String reverse1(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return str.charAt(str.length()-1) + reverse1(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) 
    {
        StringReverse obj=new StringReverse();
        String str = "StudentsInn";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse1(str)+"\'");    
    }    
}