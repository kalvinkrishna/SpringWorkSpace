package org.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	
	@Id
	private int id_product;
	private String product_name;
	private int id_category;
	private String product_deskription;
	private String product_video;
	
	public Product(int id_product, String product_name, int id_category, String product_deskription,
			String product_video) {
		super();
		this.id_product = id_product;
		this.product_name = product_name;
		this.id_category = id_category;
		this.product_deskription = product_deskription;
		this.product_video = product_video;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getProduct_deskription() {
		return product_deskription;
	}

	public void setProduct_deskription(String product_deskription) {
		this.product_deskription = product_deskription;
	}

	public String getProduct_video() {
		return product_video;
	}

	public void setProduct_video(String product_video) {
		this.product_video = product_video;
	}
	
	
}
