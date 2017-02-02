package com.epidata.onedrive.model;

import java.util.HashMap;

public class File {
	private String mimetype;
	protected HashMap<String, String> hashes;
	private boolean processingMetadata;

	

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public HashMap<String, String> getHashes() {
		return hashes;
	}

	public void setHashes(HashMap<String, String> hashes) {
		this.hashes = hashes;
	}

	public boolean isProcessingMetadata() {
		return processingMetadata;
	}

	public void setProcessingMetadata(boolean processingMetadata) {
		this.processingMetadata = processingMetadata;
	}

}
