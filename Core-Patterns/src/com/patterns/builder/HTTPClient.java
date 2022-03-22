package com.patterns.builder;

public class HTTPClient {

	public HTTPClient(HttpClientBuilder httpClientBuilder) {
		this.method = httpClientBuilder.method;
		this.url = httpClientBuilder.url;
		this.uname = httpClientBuilder.uname;
		this.password = httpClientBuilder.password;
		this.header = httpClientBuilder.header;
		this.body = httpClientBuilder.body;
	}

	private String method;
	private String url;
	private String uname;
	private String password;
	private String header;
	private String body;

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}

	public String getUname() {
		return uname;
	}

	public String getPassword() {
		return password;
	}

	public String getHeader() {
		return header;
	}

	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "HTTPClient [method=" + method + ", url=" + url + ", uname=" + uname + ", password=" + password
				+ ", header=" + header + ", body=" + body + "]";
	}

	public static class HttpClientBuilder {

		private String method;
		private String url;
		private String uname;
		private String password;
		private String header;
		private String body;

		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttpClientBuilder secure(String uname, String password) {
			this.uname = uname;
			this.password = password;
			return this;
		}

		public HttpClientBuilder header(String header) {
			this.header = header;
			return this;
		}

		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}

		public HTTPClient build() {
			return new HTTPClient(this);
		}

	}

}
