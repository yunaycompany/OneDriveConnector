package com.epidata.onedrive.model;

import java.util.LinkedList;

public class ShareResource {

	private LinkedList<Item> items;
	private Item root;
	
	
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
	
	
	
}
