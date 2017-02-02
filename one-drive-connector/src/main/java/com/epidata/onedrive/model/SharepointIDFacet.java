package com.epidata.onedrive.model;

public class SharepointIDFacet {
	private String siteId;
	private String webId;
	private String listId;
	private long listItemId;
	private String listItemUniqueId;


	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getWebId() {
		return webId;
	}

	public void setWebId(String webId) {
		this.webId = webId;
	}

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public long getListItemId() {
		return listItemId;
	}

	public void setListItemId(long listItemId) {
		this.listItemId = listItemId;
	}

	public String getListItemUniqueId() {
		return listItemUniqueId;
	}

	public void setListItemUniqueId(String listItemUniqueId) {
		this.listItemUniqueId = listItemUniqueId;
	}

}
