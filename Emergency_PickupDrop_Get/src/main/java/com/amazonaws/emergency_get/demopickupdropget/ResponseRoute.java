package com.amazonaws.emergency_get.demopickupdropget;

import java.sql.Date;
import java.sql.Time;

public class ResponseRoute {

	
	private String companyName;
	private String contactNumber;
	private String vehicleType;
	private String pickupLocation;
	private String dropLocation;
	private Time timings;
	private String status;
	private Date emergency_uppdate;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getEmergency_uppdate() {
		return emergency_uppdate;
	}
	public void setEmergency_uppdate(Date emergency_uppdate) {
		this.emergency_uppdate = emergency_uppdate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public Time getTimings() {
		return timings;
	}
	public void setTimings(Time timings) {
		this.timings = timings;
	}
//	
	
	
	
}
