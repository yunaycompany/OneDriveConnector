package com.epidata.onedrive.model;

import org.mule.el.datetime.DateTime;

public class FileSystemInfoFacet {
	private DateTime createdDateTime;
	private DateTime lastModifiedDateTime;

	

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public DateTime getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(DateTime lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

}
