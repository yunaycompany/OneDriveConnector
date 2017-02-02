package com.epidata.onedrive.model;

import com.epidata.onedrive.enums.StateEnumeration;

public class Quota {
	private long total;
	private long used;
	private long remaining;	
	private long deleted;
	private StateEnumeration state;
	private StoragePlans storagePlans;
	
	public StoragePlans getStoragePlans() {
		return storagePlans;
	}
	public void setStoragePlans(StoragePlans storagePlans) {
		this.storagePlans = storagePlans;
	}

	

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getUsed() {
		return used;
	}

	public void setUsed(long used) {
		this.used = used;
	}

	public long getRemaining() {
		return remaining;
	}

	public void setRemaining(long remaining) {
		this.remaining = remaining;
	}

	public long getDeleted() {
		return deleted;
	}

	public void setDeleted(long deleted) {
		this.deleted = deleted;
	}

	public StateEnumeration getState() {
		return state;
	}

	public void setState(StateEnumeration state) {
		this.state = state;
	}
}
