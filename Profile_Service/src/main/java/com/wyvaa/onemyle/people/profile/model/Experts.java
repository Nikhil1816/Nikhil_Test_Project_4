package com.wyvaa.onemyle.people.profile.model;

public class Experts {
	
	private String nodeid;
	private String nodetype;
	private int version;
	private String createdAt;
	private String updatedAt;
	private String areaExpertId;
	private String userid;
	private boolean verified;
	private int level;
	private boolean deleted;
	public String getNodeid() {
		return nodeid;
	}
	public void setNodeid(String nodeid) {
		this.nodeid = nodeid;
	}
	public String getNodetype() {
		return nodetype;
	}
	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getAreaExpertId() {
		return areaExpertId;
	}
	public void setAreaExpertId(String areaExpertId) {
		this.areaExpertId = areaExpertId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	

}
