package com.epidata.onedrive.model;

import java.util.LinkedList;

public class Permission {
	private String id;
	private LinkedList<String> role;
	private SharingLink link;
	private IdentitySet grantedTo;
	private SharingInvitation invitation;
	private ItemReference inheritedFrom;
	private String shareId;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LinkedList<String> getRole() {
		return role;
	}

	public void setRole(LinkedList<String> role) {
		this.role = role;
	}

	public SharingLink getLink() {
		return link;
	}

	public void setLink(SharingLink link) {
		this.link = link;
	}

	public IdentitySet getGrantedTo() {
		return grantedTo;
	}

	public void setGrantedTo(IdentitySet grantedTo) {
		this.grantedTo = grantedTo;
	}

	public SharingInvitation getInvitation() {
		return invitation;
	}

	public void setInvitation(SharingInvitation invitation) {
		this.invitation = invitation;
	}

	public ItemReference getInheritedFrom() {
		return inheritedFrom;
	}

	public void setInheritedFrom(ItemReference inheritedFrom) {
		this.inheritedFrom = inheritedFrom;
	}

	public String getShareId() {
		return shareId;
	}

	public void setShareId(String shareId) {
		this.shareId = shareId;
	}

}
