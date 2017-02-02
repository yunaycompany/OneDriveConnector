package com.epidata.onedrive.model;

import java.util.LinkedList;

public class Identity {
	private String id;
	private String displayName;
	private LinkedList<Thumbnail> thumbnails;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public LinkedList<Thumbnail> getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(LinkedList<Thumbnail> thumbnails) {
		this.thumbnails = thumbnails;
	}

}
