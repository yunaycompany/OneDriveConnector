package com.epidata.onedrive;




import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;

import org.mule.api.annotations.Processor;

import org.mule.api.annotations.oauth.OAuthProtected;

import com.epidata.onedrive.config.ConnectorConfig;



@Connector(name = "one-drive", schemaVersion = "1.0.0",friendlyName = "OneDrive")
public class OneDriveConnector {

	@Config
	ConnectorConfig config;

	@OAuthProtected
	@Processor
    public String getDrive() throws Exception {
		return config.getOneDriveAPI().getDrive();	
	}
	
	@OAuthProtected
	@Processor
    public String getDrives() throws Exception {
		return config.getOneDriveAPI().getDrives();	
	}
	
	

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}