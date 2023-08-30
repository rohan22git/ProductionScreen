package com.bgc.model;

public class FileInfo {

	private String FileName;
	private String contentType;
	private Long  fileLength;
	private boolean isReadble;
	private boolean isFileEmpty;
	private byte[] fileData;
	private String fileUploadStatus;
	
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Long getFileLength() {
		return fileLength;
	}
	public void setFileLength(Long fileLength) {
		this.fileLength = fileLength;
	}
	public boolean isReadble() {
		return isReadble;
	}
	public void setReadble(boolean isReadble) {
		this.isReadble = isReadble;
	}
	public boolean isFileEmpty() {
		return isFileEmpty;
	}
	public void setFileEmpty(boolean isFileEmpty) {
		this.isFileEmpty = isFileEmpty;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	public String getFileUploadStatus() {
		return fileUploadStatus;
	}
	public void setFileUploadStatus(String fileUploadStatus) {
		this.fileUploadStatus = fileUploadStatus;
	}	
	
}
