package com.zd.crmbatch.business.mssqlshare.entity;

import java.io.Serializable;

public class TClientGroupFeePk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FClientNo;
	private int FCommodityGroupID;
	public TClientGroupFeePk() {
	}
	public String getFClientNo() {
		return FClientNo;
	}
	public void setFClientNo(String fClientNo) {
		FClientNo = fClientNo;
	}
	public int getFCommodityGroupID() {
		return FCommodityGroupID;
	}
	public void setFCommodityGroupID(int fCommodityGroupID) {
		FCommodityGroupID = fCommodityGroupID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FClientNo == null) ? 0 : FClientNo.hashCode());
		result = prime * result + FCommodityGroupID;
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
		TClientGroupFeePk other = (TClientGroupFeePk) obj;
		if (FClientNo == null) {
			if (other.FClientNo != null)
				return false;
		} else if (!FClientNo.equals(other.FClientNo))
			return false;
		if (FCommodityGroupID != other.FCommodityGroupID)
			return false;
		return true;
	}
}
