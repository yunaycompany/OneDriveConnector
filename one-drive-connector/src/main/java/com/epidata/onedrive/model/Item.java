package com.epidata.onedrive.model;

import java.util.LinkedList;

import org.mule.el.datetime.DateTime;

import com.epidata.onedrive.enums.DeletedFacet;


public class Item {
	private String id;
	private AudioFacet audio;
	private IdentitySet createdBy;
	private DateTime createdDateTime;
	private String cTag;
	private DeletedFacet deleted;
	private String description;
	private String eTag;
	private FileFacet file;
	private FileSystemInfoFacet fileSystemInfo;
	private Folder folder;
	private ImageFacet image;
	private IdentitySet lastModifiedBy;
	private DateTime lastModifiedDateTime;
	private LocationFace location;
	private String name;
	private PackageFacet packagee;
	private ItemReference parentReference;
	private PhotoFacet photo;
	private RemoteItemFacet remoteItem;
	private SearchResultFacet searchResult;
	private SharedFacet shared;
	private SharepointIDFacet sharepointIds;
	private long size;
	private SpecialFolderFacet specialFolder;
	private String webDavUrl;
	private String webUrl;
	private LinkedList<Item> items;
	private LinkedList<ThumbnailSet> thumbnails;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AudioFacet getAudio() {
		return audio;
	}

	public void setAudio(AudioFacet audio) {
		this.audio = audio;
	}

	public IdentitySet getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(IdentitySet createdBy) {
		this.createdBy = createdBy;
	}

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getcTag() {
		return cTag;
	}

	public void setcTag(String cTag) {
		this.cTag = cTag;
	}

	public DeletedFacet getDeleted() {
		return deleted;
	}

	public void setDeleted(DeletedFacet deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String geteTag() {
		return eTag;
	}

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	public FileFacet getFile() {
		return file;
	}

	public void setFile(FileFacet file) {
		this.file = file;
	}

	public FileSystemInfoFacet getFileSystemInfo() {
		return fileSystemInfo;
	}

	public void setFileSystemInfo(FileSystemInfoFacet fileSystemInfo) {
		this.fileSystemInfo = fileSystemInfo;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public ImageFacet getImage() {
		return image;
	}

	public void setImage(ImageFacet image) {
		this.image = image;
	}

	public IdentitySet getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(IdentitySet lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public DateTime getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(DateTime lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public LocationFace getLocation() {
		return location;
	}

	public void setLocation(LocationFace location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PackageFacet getPackagee() {
		return packagee;
	}

	public void setPackagee(PackageFacet packagee) {
		this.packagee = packagee;
	}

	public ItemReference getParentReference() {
		return parentReference;
	}

	public void setParentReference(ItemReference parentReference) {
		this.parentReference = parentReference;
	}

	public PhotoFacet getPhoto() {
		return photo;
	}

	public void setPhoto(PhotoFacet photo) {
		this.photo = photo;
	}

	public RemoteItemFacet getRemoteItem() {
		return remoteItem;
	}

	public void setRemoteItem(RemoteItemFacet remoteItem) {
		this.remoteItem = remoteItem;
	}

	public SearchResultFacet getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(SearchResultFacet searchResult) {
		this.searchResult = searchResult;
	}

	public SharedFacet getShared() {
		return shared;
	}

	public void setShared(SharedFacet shared) {
		this.shared = shared;
	}

	public SharepointIDFacet getSharepointIds() {
		return sharepointIds;
	}

	public void setSharepointIds(SharepointIDFacet sharepointIds) {
		this.sharepointIds = sharepointIds;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public SpecialFolderFacet getSpecialFolder() {
		return specialFolder;
	}

	public void setSpecialFolder(SpecialFolderFacet specialFolder) {
		this.specialFolder = specialFolder;
	}

	public String getWebDavUrl() {
		return webDavUrl;
	}

	public void setWebDavUrl(String webDavUrl) {
		this.webDavUrl = webDavUrl;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public LinkedList<Item> getItems() {
		return items;
	}

	public void setItems(LinkedList<Item> items) {
		this.items = items;
	}

	public LinkedList<ThumbnailSet> getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(LinkedList<ThumbnailSet> thumbnails) {
		this.thumbnails = thumbnails;
	}

}
