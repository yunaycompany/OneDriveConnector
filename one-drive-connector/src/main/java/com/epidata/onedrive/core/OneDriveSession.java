package com.epidata.onedrive.core;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

public class OneDriveSession {
	private String clientId;
	private String clientSecret;
	private String accessToken;
	private String redirectUri;	
	private URI apiUrl;
	
	


	public OneDriveSession(String clientId, String clientSecret,String apiUrl, String apiVersion,String accessToken) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;	
		this.accessToken=accessToken;
		this.apiUrl = UriBuilder.fromPath(apiUrl).path("/{apiVersion}/").build(apiVersion);
			
	}

	

	public URI getApiUrl() {
		return apiUrl;
	}


	public void setApiUrl(String apiUrl,String apiVersion) {
		this.apiUrl = UriBuilder.fromPath(apiUrl).path("/{apiVersion}/").build(apiVersion);
	}
	
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	

}