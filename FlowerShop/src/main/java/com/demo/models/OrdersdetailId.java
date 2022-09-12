package com.demo.models;
// Generated Apr 1, 2022, 12:33:46 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrdersdetailId generated by hbm2java
 */
@Embeddable
public class OrdersdetailId implements java.io.Serializable {

	private int ordersid;
	private int productid;

	public OrdersdetailId() {
	}

	public OrdersdetailId(int ordersid, int productid) {
		this.ordersid = ordersid;
		this.productid = productid;
	}

	@Column(name = "ordersid", nullable = false)
	public int getOrdersid() {
		return this.ordersid;
	}

	public void setOrdersid(int ordersid) {
		this.ordersid = ordersid;
	}

	@Column(name = "productid", nullable = false)
	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrdersdetailId))
			return false;
		OrdersdetailId castOther = (OrdersdetailId) other;

		return (this.getOrdersid() == castOther.getOrdersid()) && (this.getProductid() == castOther.getProductid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrdersid();
		result = 37 * result + this.getProductid();
		return result;
	}

}