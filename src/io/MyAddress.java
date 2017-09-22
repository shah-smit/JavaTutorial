package io;

import java.net.*;

public class MyAddress {
	
	public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }

}
