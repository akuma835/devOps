package com.example.devops.beans;

public class Issue {
	private String key;
	private String severity;
	private String type;
	private String status;
	private String fromHotspot;
	
	public Issue() {}
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFromHotspot() {
		return fromHotspot;
	}
	public void setFromHotspot(String fromHotspot) {
		this.fromHotspot = fromHotspot;
	}
	
	

}
