package com.zd.crmbatch.business.mssqlshare.entity;
// default package
// Generated 2018-4-24 9:41:14 by Hibernate Tools 4.3.1

/**
 * TclienttradefeeId generated by hbm2java
 */
public class TClientTradefeePk implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String FClientNo;
	private int FCommodityID;
	private String FMatchWay;
	public TClientTradefeePk() {
	}
	public String getFClientNo() {
		return FClientNo;
	}
	public void setFClientNo(String fClientNo) {
		FClientNo = fClientNo;
	}
	public int getFCommodityID() {
		return FCommodityID;
	}
	public void setFCommodityID(int fCommodityID) {
		FCommodityID = fCommodityID;
	}
	public String getFMatchWay() {
		return FMatchWay;
	}
	public void setFMatchWay(String fMatchWay) {
		FMatchWay = fMatchWay;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FClientNo == null) ? 0 : FClientNo.hashCode());
		result = prime * result + FCommodityID;
		result = prime * result + ((FMatchWay == null) ? 0 : FMatchWay.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TClientTradefeePk other = (TClientTradefeePk) obj;
		if (FClientNo == null) {
			if (other.FClientNo != null)
				return false;
		} else if (!FClientNo.equals(other.FClientNo))
			return false;
		if (FCommodityID != other.FCommodityID)
			return false;
		if (FMatchWay == null) {
			if (other.FMatchWay != null)
				return false;
		} else if (!FMatchWay.equals(other.FMatchWay))
			return false;
		return true;
	}
}
