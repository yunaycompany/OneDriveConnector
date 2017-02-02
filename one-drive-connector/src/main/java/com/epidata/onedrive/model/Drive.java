package com.epidata.onedrive.model;

import java.util.LinkedList;

public class Drive {

	private String id;
	private String driveType;
	private IdentitySet owner;
	private LinkedList<Item> items;
	private Item root;
	private LinkedList<Item> special;
	private Quota quota;
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Quota getQuota() {
		return quota;
	}

	public void setQuota(Quota quota) {
		this.quota = quota;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDriveType() {
		return driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	public IdentitySet getOwner() {
		return owner;
	}

	public void setOwner(IdentitySet owner) {
		this.owner = owner;
	}

	public LinkedList<Item> getItems() {
		return items;
	}

	public void setItems(LinkedList<Item> items) {
		this.items = items;
	}

	public Item getRoot() {
		return root;
	}

	public void setRoot(Item root) {
		this.root = root;
	}

	public LinkedList<Item> getSpecial() {
		return special;
	}

	public void setSpecial(LinkedList<Item> special) {
		this.special = special;
	}

}
