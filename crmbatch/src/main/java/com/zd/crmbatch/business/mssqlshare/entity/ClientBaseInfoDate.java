package com.zd.crmbatch.business.mssqlshare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TClientBaseInfo")
@Entity
public class ClientBaseInfoDate {

	private String modifyDate;
	@Id
	@Column(name="ModifyDate")
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
}
