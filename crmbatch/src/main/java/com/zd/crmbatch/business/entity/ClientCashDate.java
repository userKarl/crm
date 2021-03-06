package com.zd.crmbatch.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

@Table(name="TClientCash")
@Entity
public class ClientCashDate {

	private String fDate;

	@Id	
	@Column(name="FDate")
	public String getfDate() {
		return StringUtils.isNoneBlank(fDate)?fDate.substring(0,fDate.indexOf(".")):fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
}
