package com.zd.crmbatch.business.mssqlshare.entity;
// default package
// Generated 2018-4-24 9:41:14 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name="TClientDefaultFee")
@Entity
@IdClass(TClientDefaultFeePk.class)
public class TClientDefaultFee{

	private int FCommodityID;
	private BigDecimal FbFee;
	private BigDecimal FdFee;
	private String fModifyDate;
	private String FCurrencyNo;
	private String FMatchWay;
	
	@Id
	@Column(name="FCommodityID")
	public int getFCommodityID() {
		return FCommodityID;
	}
	public void setFCommodityID(int fCommodityID) {
		FCommodityID = fCommodityID;
	}
	@Column(name="FbFee")
	public BigDecimal getFbFee() {
		return FbFee;
	}
	public void setFbFee(BigDecimal fbFee) {
		FbFee = fbFee;
	}
	@Column(name="FdFee")
	public BigDecimal getFdFee() {
		return FdFee;
	}
	public void setFdFee(BigDecimal fdFee) {
		FdFee = fdFee;
	}
	@Column(name="FModifyDate")
	public String getfModifyDate() {
		return fModifyDate;
	}
	public void setfModifyDate(String fModifyDate) {
		this.fModifyDate = fModifyDate;
	}
	@Column(name="FCurrencyNo")
	public String getFCurrencyNo() {
		return FCurrencyNo;
	}
	public void setFCurrencyNo(String fCurrencyNo) {
		FCurrencyNo = fCurrencyNo;
	}
	@Id
	@Column(name="FMatchWay")
	public String getFMatchWay() {
		return FMatchWay;
	}
	public void setFMatchWay(String fMatchWay) {
		FMatchWay = fMatchWay;
	}


}
