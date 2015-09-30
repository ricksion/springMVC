package com.spring.mvc.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.beans.response.OauthResponse;
import com.spring.mvc.utils.JacksonUtil;


@RestController
public class OauthController {
	private static final Logger logger = LoggerFactory.getLogger(OauthController.class);
	
	@RequestMapping(value="/getTokenScrect")
	public OauthResponse getTokenScrect(HttpServletRequest request) throws IOException{
		String url = "http://10.199.166.172/api/oauth/token/get?access_token="+request.getParameter("access_token");
		URL realUrl = new URL(url); 
		HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
		connection.connect();
		StringBuilder sb = new StringBuilder(); 
		InputStreamReader reader = new InputStreamReader(connection.getInputStream());
		int ch;
		while((ch = reader.read())!=-1)
		{ 
			sb.append((char)ch);
		}
        logger.info("=====");
        OauthResponse oauthResponse = JacksonUtil.readValue(sb.toString(), OauthResponse.class);
       
		
		return oauthResponse;
	}
	

}
