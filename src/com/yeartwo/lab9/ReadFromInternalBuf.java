package com.yeartwo.lab9;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromInternalBuf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub//
		String textMsg = "dfsdf sdfsdfsdf +65445 +65 90902979 gdfgtgdf";
		if(textMsg.matches("^[0-9]*$") || textMsg.contains("+")){
            String[] textMsgArr = textMsg.split(" ");
            for (int i=0; i<textMsgArr.length; i++){
                if(textMsgArr[i].matches("^[0-9]*$") || textMsgArr[i].contains("+")){
                    StringBuilder builder = new StringBuilder();
                    for(String s : textMsgArr[i].split("")) {
                        builder.append(s+" ");
                    }
                    textMsgArr[i] = builder.toString();
                }
            }
            
            StringBuilder builderTwo = new StringBuilder();
            for(String s : textMsgArr) {
            	builderTwo.append(s+" ");
            }
            textMsg = builderTwo.toString();
        }
		System.out.println(textMsg);
		
		
		DataInputStream DIS = null;//
		try {
			DIS = new DataInputStream(new FileInputStream("test.txt"));
			BufferedInputStream isr = new BufferedInputStream(DIS);
			while(isr.available() > 0){
				System.out.println((char)isr.read());
			}
		} finally {
			DIS.close();
		}
	}

}

