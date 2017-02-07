package com.epidata.onedrive.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;

public class OneDrive implements OneDriveApi {
	private static final Logger logger = LoggerFactory.getLogger(OneDrive.class);

	private static final String API_PATH_DRIVE = "drive";
	private static final String API_PATH_DRIVES = "drives";

	private OneDriveCore oneDriveCore;
	private OneDriveSession oneDriveSession;
	private Client client;

	/**
	 * Construct the OneDriveAPI API with the oneDriveSession as argument.
	 *
	 * @param oneDriveSession
	 *            containing tokens, client identification, client secret.
	 */
	public OneDrive(OneDriveSession oneDriveSession) {
		this.client = new Client();
		this.oneDriveSession = oneDriveSession;
		this.oneDriveCore = new OneDriveCore(this.client, this.oneDriveSession);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDrive(String driverId) throws Exception {
		String path = driverId == null ? API_PATH_DRIVE : API_PATH_DRIVES + "/" + driverId;
		return (String) this.oneDriveCore.doGetAPI(path);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDrives() throws Exception {
		return (String) this.oneDriveCore.doGetAPI(API_PATH_DRIVES);
	}

	@Override
	public String getRecentUsedFiles() throws Exception {
		String path = API_PATH_DRIVE + "/view.recent";
		return (String) this.oneDriveCore.doGetAPI(path);
	}

	@Override
	public String createFolder(String parentId, String newFolderName) throws Exception {
		String path = API_PATH_DRIVE + "/items/" + parentId + "/children";
		String params = "{" + "\"name\": \"" + newFolderName + "\"," + "  \"folder\": { }" + "}";

		return (String) this.oneDriveCore.doPostAPI(path, params);

	}

	@Override
	public String getCustomFacets(String selectValues,String itemId,String orderBy,boolean expand) throws Exception {		
		selectValues="select="+selectValues;
		String path = itemId == null ? API_PATH_DRIVE+"/root" : API_PATH_DRIVE + "/items/"+itemId ;
		if(expand){
			path+="?expand=children("+selectValues+")";
		}else{
			path+="?"+selectValues;
		}
		if(orderBy!=null){
			path+="&orderby="+orderBy;
		}
		
		
		return (String) this.oneDriveCore.doGetAPI(path);
	}
	


	@Override
	public String getByURL(String url) throws Exception {
		return (String) this.oneDriveCore.doGetAPI(url);
	}

}
