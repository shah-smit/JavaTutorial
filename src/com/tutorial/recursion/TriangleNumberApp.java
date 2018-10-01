package com.tutorial.recursion;

/* Recursion - Display Triangular Numbers */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
 
public class TriangleNumberApp {
     
    public static void main(String[] args) {
         
        int tNumber = 0;
         
        TriangleNumberApp tna = new TriangleNumberApp();
        System.out.print("Enter a number : ");
        tNumber = tna.getInput();
        int tNumberValue = tna.findTriangleNumber(tNumber);
        System.out.println("The Triangle Number is :"+tNumberValue);        
    }
     
    public int findTriangleNumber(int tnumber) {
        if (tnumber == 1) {
            return 1;
        }
        else {
            return (tnumber + findTriangleNumber(tnumber - 1));
        }
    }
     
    public int getInput() {     
        String inputStr = "";
        try {
            InputStream tempInput = System.in;
            InputStreamReader isr = new InputStreamReader(tempInput);
            BufferedReader br = new BufferedReader(isr);
            inputStr = br.readLine();           
        }
        catch(Exception e) {
            System.out.println("Exception in main() "+e);
        }
        return Integer.parseInt(inputStr);
    }
 
}
