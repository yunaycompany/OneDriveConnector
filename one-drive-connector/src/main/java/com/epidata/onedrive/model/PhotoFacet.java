package com.epidata.onedrive.model;

import org.mule.el.datetime.DateTime;

public class PhotoFacet {
	private DateTime takenDateTime;
	private String cameraMake;
	private String cameraModel;
	private double fNumber;
	private double exposureDenominator;
	private double exposureNumerator;
	private double focalLength;
	private long iso;

	

	public DateTime getTakenDateTime() {
		return takenDateTime;
	}

	public void setTakenDateTime(DateTime takenDateTime) {
		this.takenDateTime = takenDateTime;
	}

	public String getCameraMake() {
		return cameraMake;
	}

	public void setCameraMake(String cameraMake) {
		this.cameraMake = cameraMake;
	}

	public String getCameraModel() {
		return cameraModel;
	}

	public void setCameraModel(String cameraModel) {
		this.cameraModel = cameraModel;
	}

	public double getfNumber() {
		return fNumber;
	}

	public void setfNumber(double fNumber) {
		this.fNumber = fNumber;
	}

	public double getExposureDenominator() {
		return exposureDenominator;
	}

	public void setExposureDenominator(double exposureDenominator) {
		this.exposureDenominator = exposureDenominator;
	}

	public double getExposureNumerator() {
		return exposureNumerator;
	}

	public void setExposureNumerator(double exposureNumerator) {
		this.exposureNumerator = exposureNumerator;
	}

	public double getFocalLength() {
		return focalLength;
	}

	public void setFocalLength(double focalLength) {
		this.focalLength = focalLength;
	}

	public long getIso() {
		return iso;
	}

	public void setIso(long iso) {
		this.iso = iso;
	}

}
