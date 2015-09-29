package com.spring.mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;










import com.spring.mvc.beans.response.OauthResponse;
import com.spring.mvc.utils.JacksonUtil;


@Controller
public class OauthController {
	
	@RequestMapping(value="/getTokenScrect")
	public OauthResponse getTokenScrect(HttpServletRequest request) throws IOException{
		String url = "http://10.199.166.172/api/oauth/token/get"+"?"+request.getParameter("access_token");
		StringBuilder result = new StringBuilder();
		URL realUrl = new URL(url); 
		URLConnection connection = realUrl.openConnection();
		connection.connect();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line);
        }
        bufferedReader.close();
        
        OauthResponse oauthResponse = JacksonUtil.readValue(result.toString(), OauthResponse.class);
       
		
		return oauthResponse;
	}
	

}
