package com.tutorial.http;
//
//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.*;
//import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;
//
public class QRHttpClient {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try{
//			URL url = new URL("https://axperienceapp.azurewebsites.net/api/question");
//			HttpURLConnection con = (HttpURLConnection) url.openConnection();
//			con.setRequestMethod("GET");
//			con.setRequestProperty("Content-Type", "application/json");
//			
//			BufferedReader in = new BufferedReader(
//					  new InputStreamReader(con.getInputStream()));
//					String inputLine;
//					StringBuffer content = new StringBuffer();
//					while ((inputLine = in.readLine()) != null) {
//					    content.append(inputLine);
//					}
//					JSONParser parser = new JSONParser();
//					Object obj = parser.parse(content.toString());
//					 JSONArray array = (JSONArray)obj;
//					 
//					//create ObjectMapper instance
////					    ObjectMapper objectMapper = new ObjectMapper();
////					System.out.println(q.CategoryName);
////					in.close();
////			out.flush();
////			out.close();
//		}
//		catch(Exception ex){
//			ex.printStackTrace();
//		}
//		
//	}
//	
//	public interface Quiz{
//		public String QuestionId = "";
//		public String CategoryName = "";
//		public String ImageUrl = "";
//		public String Text = "";
//	}
//	
//	public static class ParameterStringBuilder {
//	    public static String getParamsString(Map<String, String> params) 
//	      throws UnsupportedEncodingException{
//	        StringBuilder result = new StringBuilder();
//	 
//	        for (Map.Entry<String, String> entry : params.entrySet()) {
//	          result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
//	          result.append("=");
//	          result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
//	          result.append("&");
//	        }
//	 
//	        String resultString = result.toString();
//	        return resultString.length() > 0
//	          ? resultString.substring(0, resultString.length() - 1)
//	          : resultString;
//	    }
//	}
//
}
