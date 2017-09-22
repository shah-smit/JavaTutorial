package io;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class SimpleSpider {

    ArrayList<String> set = new ArrayList<String>();
    
    public void search(String host) {

        try {
            URL u = new URL(host);

            set.add(host);
            
            ArrayList<String> tags = Util.extractTags(u);
            for (int i = 0; i < tags.size(); ++i) {
                
                String nexthost = Util.extractURL(tags.get(i));
                if (nexthost != null && !set.contains(nexthost)) {
                    System.out.println(nexthost);
                    search(nexthost);
                }
            }
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }

    public static void main(String args[]) {

        SimpleSpider spider = new SimpleSpider();
        spider.search("http://www.gold.ac.uk");
    }
}
