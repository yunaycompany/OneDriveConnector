package com.epidata.onedrive.core;




public interface OneDriveApi {



	/**
     * Get drive details.
     *
     * @return drive json holding drive details
     * @throws Exception
     */
	String getDrive() throws Exception;
	
	/**
     * Get list of drive 
     *
     * @return drive list 
     * @throws Exception
     */
	String getDrives() throws Exception;
	
	 
}
