package org.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DeleteRequest {

	public static void main(String[] args) throws Throwable {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/delete/1");
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("DELETE");
		openConnection.setRequestProperty("Content-Type", "application/json");
		String json="{\"name\":\"Tiger Nixon\",\"salary\":\"320800\",\"age\":\"61\"}";
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
