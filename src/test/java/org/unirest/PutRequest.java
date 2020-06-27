package org.unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;

public class PutRequest {


	public static void main(String[] args) throws UnirestException {
		HttpRequestWithBody put = Unirest.put("http://dummy.restapiexample.com/api/v1/update/21");
		HttpResponse<JsonNode> json = put.body("{\"name\":\"Raja\",\"salary\":\"550000\",\"age\":\"25\",\"id\":\"82\"}").asJson();
		int status = json.getStatus();
		System.out.println("The status code is:"+status);
		String text = json.getStatusText();
		System.out.println("The Status Message is:"+text);
		JsonNode body2 = json.getBody();
		System.out.println(body2);
	}

}
