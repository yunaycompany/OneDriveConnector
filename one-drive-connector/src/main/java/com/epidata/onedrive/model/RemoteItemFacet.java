package com.epidata.onedrive.model;



public class RemoteItemFacet {
	private String id;
	private ItemReference parentReference;
	private FaceFolder folder;
	private File file;
	private FileSystemInfoFacet fileSystemInfo;
	private long size;
	private String name;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ItemReference getParentReference() {
		return parentReference;
	}

	public void setParentReference(ItemReference parentReference) {
		this.parentReference = parentReference;
	}

	public FaceFolder getFolder() {
		return folder;
	}

	public void setFolder(FaceFolder folder) {
		this.folder = folder;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public FileSystemInfoFacet getFileSystemInfo() {
		return fileSystemInfo;
	}

	public void setFileSystemInfo(FileSystemInfoFacet fileSystemInfo) {
		this.fileSystemInfo = fileSystemInfo;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
