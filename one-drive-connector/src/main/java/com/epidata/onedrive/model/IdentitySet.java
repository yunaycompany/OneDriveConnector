package com.epidata.onedrive.model;

public class IdentitySet {
	private Identity user;
	private Identity application;
	private Identity device;
	private Identity organization;


	public Identity getUser() {
		return user;
	}

	public void setUser(Identity user) {
		this.user = user;
	}

	public Identity getApplication() {
		return application;
	}

	public void setApplication(Identity application) {
		this.application = application;
	}

	public Identity getDevice() {
		return device;
	}

	public void setDevice(Identity device) {
		this.device = device;
	}

	public Identity getOrganization() {
		return organization;
	}

	public void setOrganization(Identity organization) {
		this.organization = organization;
	}

}
