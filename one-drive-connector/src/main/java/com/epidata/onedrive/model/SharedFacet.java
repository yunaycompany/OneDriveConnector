package com.epidata.onedrive.model;

import com.epidata.onedrive.enums.ScopeValues;

public class SharedFacet {
	private IdentitySet owner;
	private ScopeValues scope;

	
	public IdentitySet getOwner() {
		return owner;
	}

	public void setOwner(IdentitySet owner) {
		this.owner = owner;
	}

	public ScopeValues getScope() {
		return scope;
	}

	public void setScope(ScopeValues scope) {
		this.scope = scope;
	}

}
