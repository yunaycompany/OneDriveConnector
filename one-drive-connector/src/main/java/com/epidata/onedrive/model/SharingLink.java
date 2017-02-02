package com.epidata.onedrive.model;

import com.epidata.onedrive.enums.ScopeValues;
import com.epidata.onedrive.enums.TypeLink;

public class SharingLink {
	private Identity application;
	private TypeLink type;
	private ScopeValues scope;
	private String webHtml;
	private String webUrl;

	

	public Identity getApplication() {
		return application;
	}

	public void setApplication(Identity application) {
		this.application = application;
	}

	public TypeLink getType() {
		return type;
	}

	public void setType(TypeLink type) {
		this.type = type;
	}

	public ScopeValues getScope() {
		return scope;
	}

	public void setScope(ScopeValues scope) {
		this.scope = scope;
	}

	public String getWebHtml() {
		return webHtml;
	}

	public void setWebHtml(String webHtml) {
		this.webHtml = webHtml;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

}
