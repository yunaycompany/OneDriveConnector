package com.epidata.onedrive.model;

import java.net.URL;

import org.mule.el.datetime.DateTime;

public class Webhook {
	private String context;
	private DateTime expirationDateTime;
	private URL resource;
	private String subscriptionId;
	private String tenantId;
	private String userId;

	

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public DateTime getExpirationDateTime() {
		return expirationDateTime;
	}

	public void setExpirationDateTime(DateTime expirationDateTime) {
		this.expirationDateTime = expirationDateTime;
	}

	public URL getResource() {
		return resource;
	}

	public void setResource(URL resource) {
		this.resource = resource;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
