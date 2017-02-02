package com.epidata.onedrive.model;

import org.mule.el.datetime.DateTime;

public class Subscription {
	private String clientState;
	private IdentitySet createdBy;
	private DateTime expirationDateTime;
	private String id;
	private String notificationUrl;
	private String resource;

	

	public String getClientState() {
		return clientState;
	}

	public void setClientState(String clientState) {
		this.clientState = clientState;
	}

	public IdentitySet getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(IdentitySet createdBy) {
		this.createdBy = createdBy;
	}

	public DateTime getExpirationDateTime() {
		return expirationDateTime;
	}

	public void setExpirationDateTime(DateTime expirationDateTime) {
		this.expirationDateTime = expirationDateTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNotificationUrl() {
		return notificationUrl;
	}

	public void setNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

}
