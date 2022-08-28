package com.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemandModel {
	@Id
private Long did;
private Long cid;
private String item;



public DemandModel() {
	super();
}



public DemandModel(Long did, Long cid, String item) {
	super();
	this.did = did;
	this.cid = cid;
	this.item = item;
}



public Long getDid() {
	return did;
}



public void setDid(Long did) {
	this.did = did;
}



public Long getCid() {
	return cid;
}



public void setCid(Long cid) {
	this.cid = cid;
}



public String getItem() {
	return item;
}



public void setItem(String item) {
	this.item = item;
}


}
