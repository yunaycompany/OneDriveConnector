package com.epidata.onedrive.model;

public class SharingInvitation {
	private String email;
	private boolean signInRequired;
	private Identity invitedBy;

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSignInRequired() {
		return signInRequired;
	}

	public void setSignInRequired(boolean signInRequired) {
		this.signInRequired = signInRequired;
	}

	public Identity getInvitedBy() {
		return invitedBy;
	}

	public void setInvitedBy(Identity invitedBy) {
		this.invitedBy = invitedBy;
	}

}
