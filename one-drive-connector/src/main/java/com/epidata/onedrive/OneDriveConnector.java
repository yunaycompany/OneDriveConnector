package com.epidata.onedrive;




import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;

import org.mule.api.annotations.Processor;

import org.mule.api.annotations.oauth.OAuthProtected;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

import com.epidata.onedrive.config.ConnectorConfig;


@Connector(name = "one-drive", schemaVersion = "1.0.0",friendlyName = "OneDrive")
public class OneDriveConnector {

		
	@Config
	ConnectorConfig config; 
  
	@OAuthProtected
	@Processor
    public String getDrive(@Optional String driverId) throws Exception {
		return config.getOneDriveAPI().getDrive(driverId);	
	}
	
	
	@OAuthProtected
	@Processor
    public String getDrives() throws Exception {
		return config.getOneDriveAPI().getDrives();	
	}
	
	/**
	 * Get recently used files
	 * 
	 * @return A json with recently used files
	 * @throws Exception
	 *             Comment for Exception
	 */
	@OAuthProtected
	@Processor
    public String getRecentUsedFiles() throws Exception {
		return config.getOneDriveAPI().getRecentUsedFiles();	
	}
	
	@OAuthProtected
	@Processor
	public String createFolder(String itemId,String newFolderName) throws Exception {
		
		return config.getOneDriveAPI().createFolder(itemId,newFolderName);
	}
	
	@OAuthProtected
	@Processor
	public String getCustomFacets(@Default("name") String selectValues,@Optional String itemId,@Default("id%20desc")String orderBy, boolean expand) throws Exception {
		return config.getOneDriveAPI().getCustomFacets(selectValues,itemId,orderBy,expand);
	}
	
	@OAuthProtected
	@Processor
	public String getByURL(String url) throws Exception {
		return config.getOneDriveAPI().getByURL(url);
	}

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}