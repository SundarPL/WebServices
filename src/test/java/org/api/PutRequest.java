package org.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PutRequest {

	public static void main(String[] args) throws Throwable {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/update/96");
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("PUT");
		openConnection.setRequestProperty("Content-Type", "application/json");
		openConnection.setDoOutput(true);
		String json="{\"name\":\"Raja\",\"salary\":\"550000\",\"age\":\"25\",\"id\":\"96\"}";
		byte[] bytes = json.getBytes();
		OutputStream outputStream = openConnection.getOutputStream();
		outputStream.write(bytes);
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
