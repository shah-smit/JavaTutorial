package io;

import java.net.*;

public class HostInfo {
	
	public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getByName(args[0]);
            System.out.println(inetAddress.getHostName() + "\t"
                    + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }

}
