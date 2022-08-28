package com.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
	@Id
private Long cid;
private String cname;
private String cmail;

public Model() {
	super();
}
public Model(Long cid, String cname, String cmail) {
	super();
	this.cid = cid;
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



}
