package org.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeviceCustomer {
	
	@Id
	private int id_device;
	private int id_customer;
	private String device_token;
	private String device_id;
	private Date created_at;
	private Date updated_at;
	
	public DeviceCustomer(int id_device, int id_customer, String device_token, String device_id, Date created_at,
			Date updated_at) {
		super();
		this.id_device = id_device;
		this.id_customer = id_customer;
		this.device_token = device_token;
		this.device_id = device_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	public int getId_device() {
		return id_device;
	}
	public void setId_device(int id_device) {
		this.id_device = id_device;
	}
	public int getId_customer() {
		return id_customer;
	}
	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}
	public String getDevice_token() {
		return device_token;
	}
	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
