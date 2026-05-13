package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_TRANSPORT")
public class TransportDTO extends BaseDTO {

	@Column(name = "VEHICLE_TYPE", length = 50)
	private String vehicleType;
	
	@Column(name = "DRIVER_NAME", length = 50)
	private String driverName;
	
	@Column(name = "CHARGES")
	private Double charges;

	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Double getCharges() {
		return charges;
	}
	public void setCharges(Double charges) {
		this.charges = charges;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return vehicleType;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "vehicleType";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return vehicleType;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Vehicle Type";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Transport";
	}
}