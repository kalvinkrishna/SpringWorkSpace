package org.models;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Shop {
	@Id
	private int id_store;
	private String store_name;
	private String store_code;
	private String address;
	private String owner;
	private Map<Shop, StoreWork> store_time;
	
	public int getId_store() {
		return id_store;
	}
	public void setId_store(int id_store) {
		this.id_store = id_store;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Map<Shop, StoreWork> getStore_time() {
		return store_time;
	}
	public void setStore_time(Map<Shop, StoreWork> store_time) {
		this.store_time = store_time;
	}
	
	
	
}
