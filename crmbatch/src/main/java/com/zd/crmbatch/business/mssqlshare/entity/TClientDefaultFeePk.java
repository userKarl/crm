package com.zd.crmbatch.business.mssqlshare.entity;

import java.io.Serializable;

public class TClientDefaultFeePk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int FCommodityID;
	private String FMatchWay;
	
	public TClientDefaultFeePk() {
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
		TClientDefaultFeePk other = (TClientDefaultFeePk) obj;
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
