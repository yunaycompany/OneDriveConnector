package com.epidata.onedrive.model;

import java.util.HashMap;

public class FileFacet {
	private String mimeType;
	protected HashMap<String, String> hashes;

	

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public HashMap<String, String> getHashes() {
		return hashes;
	}

	public void setHashes(HashMap<String, String> hashes) {
		this.hashes = hashes;
	}

}
