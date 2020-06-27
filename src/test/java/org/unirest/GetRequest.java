package org.unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

public class GetRequest {
	public static void main(String[] args) throws Throwable {
		HttpRequest getRequest = Unirest.get("http://dummy.restapiexample.com/api/v1/employees");
		HttpResponse<JsonNode> json = getRequest.asJson();
		int status = json.getStatus();
		System.out.println("The status code is:"+status);
		String text = json.getStatusText();
		System.out.println("The staus code is:"+text);
		JsonNode body = json.getBody();
		System.out.println(body);
	}
	
}
