package com.epidata.onedrive.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epidata.onedrive.model.Drive;
import com.sun.jersey.api.client.Client;

import java.util.LinkedList;

import javax.ws.rs.core.MediaType;

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
	public String getDrive() throws Exception {
		return (String) this.oneDriveCore.doGetAPI( MediaType.APPLICATION_JSON, API_PATH_DRIVE,
				new Drive());
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDrives() throws Exception {
		return (String) this.oneDriveCore.doGetAPI( MediaType.APPLICATION_JSON, API_PATH_DRIVES,
				new LinkedList<Drive>());
	}

	
}
