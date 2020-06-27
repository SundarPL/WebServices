package org.unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;

public class PostRequest {

	public static void main(String[] args) throws Throwable {
		HttpRequestWithBody body = Unirest.post("http://dummy.restapiexample.com/api/v1/create");
		HttpResponse<JsonNode> asJson = body.body("{\"name\":\"Raja\",\"salary\":\"50000\",\"age\":\"25\"}").asJson();
		int status = asJson.getStatus();
		System.out.println("The status is:"+status);
		String text = asJson.getStatusText();
		System.out.println("The Status Message is:"+text);
		JsonNode body2 = asJson.getBody();
		System.out.println(body2);

	}

}
