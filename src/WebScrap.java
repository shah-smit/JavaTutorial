import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class WebScrap {

	public static void main(String[] args) {
		try {
			URL u = new URL("http://app.cudy.co");//May throw MalformedURL
			Scanner s = new Scanner(u.openStream());//May throw IOException
			StringBuilder sb = new StringBuilder();
			HashSet<String> tags = new HashSet<>();
			while(s.hasNext()){
				String foundNewLine = s.nextLine();
				sb.append(foundNewLine);
				tags.addAll(getTags(foundNewLine));
			}
			System.out.println(tags);
			System.out.println(u.getHost());
			FileWriter fw = new FileWriter(u.getHost()+".html");
			fw.write(sb.toString());
			fw.close();
			s.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> getTags(String s){
		ArrayList<String> tags = new ArrayList<>();
		String[] sSpace = s.split(" ");
		for(int i=0; i<sSpace.length; i++){
			if(sSpace[i].startsWith("<") && !sSpace[i].startsWith("</") && !sSpace[i].endsWith("/>")){
				int endAngular = sSpace[i].indexOf('>');
				if(endAngular < 0) endAngular = sSpace[i].length();
				tags.add(sSpace[i].substring(1, endAngular));
			}
		}
		return tags;
	}
	
	

}
