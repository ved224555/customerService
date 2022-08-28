package com.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
	@Id
private Long cid;
private Long did;
private String cname;
private String cmail;

public Model() {
	super();
}
public Model(Long cid, Long did, String cname, String cmail) {
	super();
	this.cid = cid;
	this.did = did;
	this.cname = cname;
	this.cmail = cmail;
}
public Long getCid() {
	return cid;
}
public void setCid(Long cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCmail() {
	return cmail;
}
public void setCmail(String cmail) {
	this.cmail = cmail;
}
public Long getDid() {
	return did;
}
public void setDid(Long did) {
	this.did = did;
}



}
