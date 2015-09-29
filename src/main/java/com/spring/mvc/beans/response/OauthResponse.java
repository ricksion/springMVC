package com.spring.mvc.beans.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class OauthResponse {
	private int code;
	private String msg ;
	private Result result;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result{
		private String access_token;
		private String access_token_secret;
		private String app_client_id;
		private String client_ip;
		private String create_at;
		private String expires_in;
		private String expires_time;
		public String getAccess_token() {
			return access_token;
		}
		public void setAccess_token(String access_token) {
			this.access_token = access_token;
		}
		public String getAccess_token_secret() {
			return access_token_secret;
		}
		public void setAccess_token_secret(String access_token_secret) {
			this.access_token_secret = access_token_secret;
		}
		public String getApp_client_id() {
			return app_client_id;
		}
		public void setApp_client_id(String app_client_id) {
			this.app_client_id = app_client_id;
		}
		public String getClient_ip() {
			return client_ip;
		}
		public void setClient_ip(String client_ip) {
			this.client_ip = client_ip;
		}
		public String getCreate_at() {
			return create_at;
		}
		public void setCreate_at(String create_at) {
			this.create_at = create_at;
		}
		public String getExpires_in() {
			return expires_in;
		}
		public void setExpires_in(String expires_in) {
			this.expires_in = expires_in;
		}
		public String getExpires_time() {
			return expires_time;
		}
		public void setExpires_time(String expires_time) {
			this.expires_time = expires_time;
		}
		public String getOpen_id() {
			return open_id;
		}
		public void setOpen_id(String open_id) {
			this.open_id = open_id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getUser_ip() {
			return user_ip;
		}
		public void setUser_ip(String user_ip) {
			this.user_ip = user_ip;
		}
		private String open_id;
		private String status;
		private String user_id;
		private String user_ip;
	}
}
