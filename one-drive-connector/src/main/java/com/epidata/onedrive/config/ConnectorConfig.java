package com.epidata.onedrive.config;

import org.mule.api.annotations.Configurable;

import org.mule.api.annotations.oauth.OAuth2;
import org.mule.api.annotations.oauth.OAuthAccessToken;

import org.mule.api.annotations.oauth.OAuthConsumerKey;
import org.mule.api.annotations.oauth.OAuthConsumerSecret;
import org.mule.api.annotations.oauth.OAuthPostAuthorization;
import org.mule.api.annotations.oauth.OAuthScope;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

import com.epidata.onedrive.core.OneDrive;
import com.epidata.onedrive.core.OneDriveSession;



@OAuth2(friendlyName = "OAuth 2", 
authorizationUrl = "https://login.live.com/oauth20_authorize.srf", 
accessTokenUrl = "https://login.live.com/oauth20_token.srf",
accessTokenRegex="\"access_token\"[ ]*:[ ]*\"([^\\\"]*)\"",
expirationRegex="\"expires_in\"[ ]*:[ ]*([\\d]*)",
refreshTokenRegex="\"refresh_token\"[ ]*:[ ]*\"([^\\\"]*)\"")
public class ConnectorConfig {

	/**
     * The OAuth access token
     */	
	@OAuthAccessToken
    private String accessToken;
    
	
	 /**
     * The OAuth client id
     */
    @Configurable
    @OAuthConsumerKey
    private String clientId;
	
    /**
     * The OAuth client secret
     */
    @Configurable
    @OAuthConsumerSecret
    private String clientSecret;

    /**
     * The OAuth scopes you want to request
     */
	@Configurable
	@OAuthScope
	@Optional
	@Default("onedrive.readonly")
    private String scope;
	
	/**
     * The API url you want to use
     */
	@Configurable	
	@Optional
	@Default("https://api.onedrive.com")	
    private String apiUrl;
    
	/**
     * The API version you want to use
     */
	@Configurable	
	@Optional
	@Default("v1.0")
    private String apiVersion;

	/**
     * The oneDrive API
     */
	private OneDrive oneDriveAPI;
	
	
	
	
	@OAuthPostAuthorization
    public void postAuthorize() {
		OneDriveSession	oneDriveSession = new OneDriveSession(this.clientId, this.clientSecret, this.apiUrl, this.apiVersion, this.accessToken);
		oneDriveSession.setAccessToken(accessToken);
		
		this.oneDriveAPI= new OneDrive(oneDriveSession);		
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

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	
	public OneDrive getOneDriveAPI() {
		return oneDriveAPI;
	}
	public void setOneDriveAPI(OneDrive oneDriveAPI) {
		this.oneDriveAPI = oneDriveAPI;
	}


}