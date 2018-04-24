package com.zd.crmbatch.business.entity;

import java.io.Serializable;

public class TClientFundPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fDate;
	private String FClientNo;
	private String FCurrencyNo;
	public TClientFundPK() {
	}
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	public String getFClientNo() {
		return FClientNo;
	}
	public void setFClientNo(String fClientNo) {
		FClientNo = fClientNo;
	}
	public String getFCurrencyNo() {
		return FCurrencyNo;
	}
	public void setFCurrencyNo(String fCurrencyNo) {
		FCurrencyNo = fCurrencyNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FClientNo == null) ? 0 : FClientNo.hashCode());
		result = prime * result + ((FCurrencyNo == null) ? 0 : FCurrencyNo.hashCode());
		result = prime * result + ((fDate == null) ? 0 : fDate.hashCode());
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
		TClientFundPK other = (TClientFundPK) obj;
		if (FClientNo == null) {
			if (other.FClientNo != null)
				return false;
		} else if (!FClientNo.equals(other.FClientNo))
			return false;
		if (FCurrencyNo == null) {
			if (other.FCurrencyNo != null)
				return false;
		} else if (!FCurrencyNo.equals(other.FCurrencyNo))
			return false;
		if (fDate == null) {
			if (other.fDate != null)
				return false;
		} else if (!fDate.equals(other.fDate))
			return false;
		return true;
	}
	
}
