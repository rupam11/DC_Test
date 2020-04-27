package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	//C.U.R.D :: GET Method
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet httpGet=new HttpGet(url);
		
		CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpGet);
		int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code === "+statusCode);
		
	}
	
	public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException	{
		
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpPost httpPost= new HttpPost(url);
		
		httpPost.setEntity(new StringEntity(entityString)); //for payload
		
		//for headers
		for(Entry<String, String> entry: headerMap.entrySet()) {
			httpPost.addHeader(entry.getKey(),entry.getValue());
		}
		
		CloseableHttpResponse httpResposne=httpClient.execute(httpPost);
		return httpResposne;
	}

}
