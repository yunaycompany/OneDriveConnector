package com.epidata.onedrive.core;


public interface OneDriveApi {



	/**
     * Get drive details.
     *
     * @return drive json holding drive details or drive with driverId
     * @param driverId id of driver to get 
     * @throws Exception
     */
	String getDrive(String driverId) throws Exception;
	
	/**
     * Get list of drive 
     *
     * @return drive list 
     * @throws Exception
     */
	String getDrives() throws Exception;
	
	
	/**
     * Recently used files
     *
     * @return The response is a collection of Item resources. They are ordered by most recently used first.
     * @throws Exception
     */
	String getRecentUsedFiles() throws Exception;
	
	/**
     * Create a new folder in a specified parent item or parent path.
     * @param parentId id of parent of created folder
     * @param newFolderName new name of folder 
     * @return The response object is truncated for clarity. All default properties will be returned from the actual call.
     * @throws Exception
     */	
	String createFolder(String parentId,String newFolderName) throws Exception;

	/**
     * Provide a way for you to store your own metadata on items. 
     * @param selectValues string parameter to provide a comma-separated list of properties to return on Items.  
     * @param itemId item Id
     * @param expand use for expanded children collection
     * @param orderBy
     * @return List the facet names explicitly in the select
     * @throws Exception
     */	
	String getCustomFacets(String selectValues,String itemId,String orderBy,boolean expand)throws Exception;
	
	
	/**
     * Get by URL    
     * @param url
     * @return url Response
     * @throws Exception
     */	
	String getByURL(String url) throws Exception;
	 
}
