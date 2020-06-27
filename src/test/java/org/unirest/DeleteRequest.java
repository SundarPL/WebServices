package org.unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;

public class DeleteRequest {

	public static void main(String[] args) throws Throwable {
		HttpRequestWithBody delete = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/1");
		HttpResponse<JsonNode> json = delete.body("{\"name\":\"Tiger Nixon\",\"salary\":\"320800\",\"age\":\"61\"}").asJson();
		int status = json.getStatus();
		System.out.println("The status is:"+status);
		String text = json.getStatusText();
		System.out.println("The Status Message is:"+text);
		JsonNode body2 = json.getBody();
		System.out.println(body2);
	}

}
