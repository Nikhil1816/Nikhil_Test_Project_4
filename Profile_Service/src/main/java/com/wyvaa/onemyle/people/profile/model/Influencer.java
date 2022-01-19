package com.wyvaa.onemyle.people.profile.model;

public class Influencer {

	private String nodeid;
	private String nodetype;
	private int version;
	private String createdAt;
	private String updatedAt;
	private String influencerId;
	private String userid;
	private String verified;
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
	public String getInfluencerId() {
		return influencerId;
	}
	public void setInfluencerId(String influencerId) {
		this.influencerId = influencerId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
