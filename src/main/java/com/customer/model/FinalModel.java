package com.customer.model;

public class FinalModel {
private Model cus;
private DemandModel dem;

public FinalModel() {
	super();
}

public FinalModel(Model cus, DemandModel dem) {
	super();
	this.cus = cus;
	this.dem = dem;
}

public Model getCus() {
	return cus;
}

public void setCus(Model cus) {
	this.cus = cus;
}

public DemandModel getDem() {
	return dem;
}

public void setDem(DemandModel dem) {
	this.dem = dem;
}


}
