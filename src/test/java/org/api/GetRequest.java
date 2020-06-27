package org.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetRequest {

	public static void main(String[] args) throws IOException {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("GET");
		int responseCode = openConnection.getResponseCode();
		System.out.println("Response code is:"+responseCode);
		String responseMessage = openConnection.getResponseMessage();
		System.out.println("Response Message is:"+responseMessage);
		InputStream inputStream = openConnection.getInputStream();
		InputStreamReader input=new InputStreamReader(inputStream);
		BufferedReader br=new BufferedReader(input);
		String line;
		//StringBuffer buff=new StringBuffer();
		while ((line = br.readLine())!=null) {
			System.out.println(line);
			
		}
		
	}

}
