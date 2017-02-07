package com.epidata.onedrive.core;

import java.io.IOException;
import java.util.HashMap;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class OneDriveCore {
	private static final Logger logger = LoggerFactory.getLogger(OneDriveCore.class);

	public static final String API_PARAM_ACCESS_TOKEN = "access_token";
	public static final String API_PARAM_CLIENT_ID = "client_id";
	public static final String API_PARAM_CLIENT_SECRET = "client_secret";
	public static final String API_PARAM_RESPONSE_TYPE = "response_type";
	public static final String API_PARAM_REDIRECT_URI = "redirect_uri";
	public static final String API_PARAM_SCOPE = "scope";

	private Client client;
	private OneDriveSession oneDriveSession;

	// private static final ObjectMapper objectMapper = new
	// ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
	// false);
	/**
	 * OneDriveAPICore constructor
	 *
	 * @param client
	 *            HTTP client
	 * @param oneDriveSession
	 *            holding the credentials
	 */
	public OneDriveCore(Client client, OneDriveSession oneDriveSession) {
		this.client = client;
		this.oneDriveSession = oneDriveSession;
	}

	/**
	 * This method is used for get API calls.	
	 * @param path
	 *            path in the URL	
	 * @return response result object
	 */
	public Object doGetAPI(String path) throws Exception {
		long startTime = System.currentTimeMillis();
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		String mediaType = MediaType.APPLICATION_JSON;
		String jsonResult = "";

		WebResource webResource = client.resource(this.oneDriveSession.getApiUrl() + path);

		queryParams.add(API_PARAM_ACCESS_TOKEN, this.oneDriveSession.getAccessToken());
		ClientResponse clientResponse = webResource.queryParams(queryParams).accept(mediaType)
				.get(ClientResponse.class);

		jsonResult = clientResponse.getEntity(String.class);
		long elapsedTime = System.currentTimeMillis() - startTime;

		return jsonResult;

	}
	
	/**
     * This method is used for performing API POST calls.
     *
     * @param queryParams one or more parameters to be send with the POST call
     * @param mediaType media type to accept
     * @param path path in the URL
     * @param resultObject object holding the response or result of the POST call
     * @return response result object
     */
    public Object doPostAPI(String path,Object params) throws IOException {
    	WebResource webResource = client.resource(this.oneDriveSession.getApiUrl() + path);
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        

		String mediaType = MediaType.APPLICATION_JSON;
		queryParams.add(API_PARAM_ACCESS_TOKEN, this.oneDriveSession.getAccessToken());
        ClientResponse clientResponse = webResource.queryParams(queryParams).type(mediaType).accept(mediaType).post(ClientResponse.class, params);

       return clientResponse.getEntity(String.class);
    }
	
	
	public OneDriveSession getOneDriveSession() {
		return oneDriveSession;
	}

	public void setOneDriveSession(OneDriveSession oneDriveSession) {
		this.oneDriveSession = oneDriveSession;
	}

}
