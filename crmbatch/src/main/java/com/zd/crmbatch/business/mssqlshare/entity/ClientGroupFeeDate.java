package com.zd.crmbatch.business.mssqlshare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TClientGroupFee")
@Entity
public class ClientGroupFeeDate {

	private String fModifyDate;
	
	@Id
	@Column(name="FModifyDate")
	public String getfModifyDate() {
		return fModifyDate;
	}
	public void setfModifyDate(String fModifyDate) {
		this.fModifyDate = fModifyDate;
	}
}
