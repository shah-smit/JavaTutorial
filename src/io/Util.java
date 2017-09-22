package io;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Util {

    public static String extractURL(String tag) {

        String host = null;
        tag.trim();
        if (tag.startsWith("<a") || tag.startsWith("<A")) {

            for (int i = 0; i < tag.length();) {
            	
                String sub = tag.substring(i);
                if (sub.startsWith("http://") || sub.startsWith("HTTP://")) {

                    int j = 7;
                    for (; j < sub.length() && sub.charAt(j) != '/'
                            && sub.charAt(j) != '"'; j++)
                        ;
                    
                    host = sub.substring(0, j);
                    i += 7;
                } else
                    i++;
            }
        }
        return host;
    }

    public static ArrayList<String> extractTags(URL u) throws IOException {

        ArrayList<String> tags = new ArrayList<String>();

        Reader r = new BufferedReader(new InputStreamReader(u.openStream()));
        StringBuffer tag = new StringBuffer();

        int c = 0;
        boolean inTag = false;
        while ((c = r.read()) != -1) {

            if (c == '<')
                inTag = true;

            if (inTag)
                tag.append((char) c);

            if (c == '>') {
                tags.add(tag.toString());
                tag = new StringBuffer();
                inTag = false;
            }
        }
        return tags;
    }

    public static void main(String args[]) {

        try {
            URL u = new URL("http://www.gold.ac.uk");

            ArrayList<String> tags = extractTags(u);
            for (int i = 0, n = tags.size(); i < n; ++i) {
                String host = extractURL(tags.get(i));
                if (host != null)
                    System.out.println(host);
            }
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }
}
