package com.epidata.onedrive.core;

import java.io.IOException;

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
	 * This method is used for performing API calls.
	 *	
	 * @param mediaType
	 *            media type of the call
	 * @param path
	 *            path in the URL
	 * @param resultObject
	 *            object holding the response or result of the GET call
	 * @return response result object
	 */
	public Object doGetAPI(String mediaType, String path, Object resultObject) throws Exception {
		long startTime = System.currentTimeMillis();
		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonResult = "";		

		WebResource webResource = client.resource(this.oneDriveSession.getApiUrl() + path);
		
		queryParams.add(API_PARAM_ACCESS_TOKEN, this.oneDriveSession.getAccessToken());
		ClientResponse clientResponse = webResource.queryParams(queryParams).accept(mediaType).get(ClientResponse.class);

		if (clientResponse.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
			jsonResult = clientResponse.getEntity(String.class);			
		} else {
//			try {
				resultObject = objectMapper.readValue(clientResponse.getEntity(String.class).toString(),
						resultObject.getClass());
				jsonResult = objectMapper.writeValueAsString(resultObject);
				long elapsedTime = System.currentTimeMillis() - startTime;
				logger.debug("Executed " + webResource.getURI() + " in " + elapsedTime + " ms");
//			} catch (UnrecognizedPropertyException ex) {
//				jsonResult = ex.getLocation().getSourceRef().toString();
//			}
		}
		
		return jsonResult;

	}
	
	/**
     * This method is used for performing API PUT calls.
     *
     * @param mediaType media type to accept
     * @param path path in the URL
     * @param resultObject object holding the response or result of the POST call
     * @return response result object
     */
    public Object doPutAPI(String mediaType, String path, Object resultObject) throws IOException {
        WebResource webResource = client.resource(this.oneDriveSession.getApiUrl() + path);
        String jsonResult = "";
        ObjectMapper objectMapper = new ObjectMapper();        
        MultivaluedMap<String, String> queryParams=new MultivaluedMapImpl();
        queryParams.add(API_PARAM_ACCESS_TOKEN,  this.oneDriveSession.getAccessToken());
        ClientResponse clientResponse = webResource.queryParams(queryParams).type(mediaType).accept(mediaType).put(ClientResponse.class, resultObject);

        if (clientResponse.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
        	jsonResult = clientResponse.getEntity(String.class);
        } else {
        	resultObject = objectMapper.readValue(clientResponse.getEntity(String.class).toString(),resultObject.getClass());
            jsonResult = objectMapper.writeValueAsString(resultObject);
        }
        return jsonResult;
    }

	public OneDriveSession getOneDriveSession() {
		return oneDriveSession;
	}

	public void setOneDriveSession(OneDriveSession oneDriveSession) {
		this.oneDriveSession = oneDriveSession;
	}

}
