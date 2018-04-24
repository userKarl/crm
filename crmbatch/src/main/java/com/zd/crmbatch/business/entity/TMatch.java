package com.zd.crmbatch.business.entity;
// default package
// Generated 2018-4-20 9:30:53 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TMatch")
@Entity
public class TMatch{

	private int FSerialId;
	private String fDate;
	private String FClientNo;
	private String FMatchNo;
	private String FExchangeNo;
	private String FCommodityNo;
	private String FContractNo;
	private String FMatchWay;
	private String FDirect;
	private String FMatchVol;
	private BigDecimal FMatchPrice;
	private BigDecimal FTurnover;
	private BigDecimal FClientFee;
	private BigDecimal FUpperFee;
	private BigDecimal FNetFee;
	private String FTime;
	private String FUpperNo;
	private String FGroupNo;
	private String FCurrencyNo;
	private String FInputNo;
	private String FSystemNo;
	private String FUpperMatchNo;
	private String FIsRiskOrder;
	private String FMatchDate;
	private String FExpiryDate;
	private String FIsCarryTrade;
	private String FOldMatchNo;
	private String FOldExpiryDate;
	private String FUpperMatchDate;
	private String FUpperMatchTime;
	private String FIsStartegy;
	private String FStartegyCommodityNo;
	private String FStartegyContractDate;
	private String FOffset;
	private String FSubClientNo;
	private BigDecimal FClientFee1;
	private BigDecimal FClientFee2;
	private BigDecimal FClientFee3;
	
	@Id
	@Column(name="FSerialId")
	public int getFSerialId() {
		return FSerialId;
	}
	public void setFSerialId(int fSerialId) {
		FSerialId = fSerialId;
	}
	@Column(name="FDate")
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	@Column(name="FClientNo")
	public String getFClientNo() {
		return FClientNo;
	}
	public void setFClientNo(String fClientNo) {
		FClientNo = fClientNo;
	}
	@Column(name="FMatchNo")
	public String getFMatchNo() {
		return FMatchNo;
	}
	public void setFMatchNo(String fMatchNo) {
		FMatchNo = fMatchNo;
	}
	@Column(name="FExchangeNo")
	public String getFExchangeNo() {
		return FExchangeNo;
	}
	public void setFExchangeNo(String fExchangeNo) {
		FExchangeNo = fExchangeNo;
	}
	@Column(name="FCommodityNo")
	public String getFCommodityNo() {
		return FCommodityNo;
	}
	public void setFCommodityNo(String fCommodityNo) {
		FCommodityNo = fCommodityNo;
	}
	@Column(name="FContractNo")
	public String getFContractNo() {
		return FContractNo;
	}
	public void setFContractNo(String fContractNo) {
		FContractNo = fContractNo;
	}
	@Column(name="FMatchWay")
	public String getFMatchWay() {
		return FMatchWay;
	}
	public void setFMatchWay(String fMatchWay) {
		FMatchWay = fMatchWay;
	}
	@Column(name="FDirect")
	public String getFDirect() {
		return FDirect;
	}
	public void setFDirect(String fDirect) {
		FDirect = fDirect;
	}
	@Column(name="FMatchVol")
	public String getFMatchVol() {
		return FMatchVol;
	}
	public void setFMatchVol(String fMatchVol) {
		FMatchVol = fMatchVol;
	}
	@Column(name="FMatchPrice")
	public BigDecimal getFMatchPrice() {
		return FMatchPrice;
	}
	public void setFMatchPrice(BigDecimal fMatchPrice) {
		FMatchPrice = fMatchPrice;
	}
	@Column(name="FTurnover")
	public BigDecimal getFTurnover() {
		return FTurnover;
	}
	public void setFTurnover(BigDecimal fTurnover) {
		FTurnover = fTurnover;
	}
	@Column(name="FClientFee")
	public BigDecimal getFClientFee() {
		return FClientFee;
	}
	public void setFClientFee(BigDecimal fClientFee) {
		FClientFee = fClientFee;
	}
	@Column(name="FUpperFee")
	public BigDecimal getFUpperFee() {
		return FUpperFee;
	}
	public void setFUpperFee(BigDecimal fUpperFee) {
		FUpperFee = fUpperFee;
	}
	@Column(name="FNetFee")
	public BigDecimal getFNetFee() {
		return FNetFee;
	}
	public void setFNetFee(BigDecimal fNetFee) {
		FNetFee = fNetFee;
	}
	@Column(name="FTime")
	public String getFTime() {
		return FTime;
	}
	public void setFTime(String fTime) {
		FTime = fTime;
	}
	@Column(name="FUpperNo")
	public String getFUpperNo() {
		return FUpperNo;
	}
	public void setFUpperNo(String fUpperNo) {
		FUpperNo = fUpperNo;
	}
	@Column(name="FGroupNo")
	public String getFGroupNo() {
		return FGroupNo;
	}
	public void setFGroupNo(String fGroupNo) {
		FGroupNo = fGroupNo;
	}
	@Column(name="FCurrencyNo")
	public String getFCurrencyNo() {
		return FCurrencyNo;
	}
	public void setFCurrencyNo(String fCurrencyNo) {
		FCurrencyNo = fCurrencyNo;
	}
	@Column(name="FInputNo")
	public String getFInputNo() {
		return FInputNo;
	}
	public void setFInputNo(String fInputNo) {
		FInputNo = fInputNo;
	}
	@Column(name="FSystemNo")
	public String getFSystemNo() {
		return FSystemNo;
	}
	public void setFSystemNo(String fSystemNo) {
		FSystemNo = fSystemNo;
	}
	@Column(name="FUpperMatchNo")
	public String getFUpperMatchNo() {
		return FUpperMatchNo;
	}
	public void setFUpperMatchNo(String fUpperMatchNo) {
		FUpperMatchNo = fUpperMatchNo;
	}
	@Column(name="FIsRiskOrder")
	public String getFIsRiskOrder() {
		return FIsRiskOrder;
	}
	public void setFIsRiskOrder(String fIsRiskOrder) {
		FIsRiskOrder = fIsRiskOrder;
	}
	@Column(name="FMatchDate")
	public String getFMatchDate() {
		return FMatchDate;
	}
	public void setFMatchDate(String fMatchDate) {
		FMatchDate = fMatchDate;
	}
	@Column(name="FExpiryDate")
	public String getFExpiryDate() {
		return FExpiryDate;
	}
	public void setFExpiryDate(String fExpiryDate) {
		FExpiryDate = fExpiryDate;
	}
	@Column(name="FIsCarryTrade")
	public String getFIsCarryTrade() {
		return FIsCarryTrade;
	}
	public void setFIsCarryTrade(String fIsCarryTrade) {
		FIsCarryTrade = fIsCarryTrade;
	}
	@Column(name="FOldMatchNo")
	public String getFOldMatchNo() {
		return FOldMatchNo;
	}
	public void setFOldMatchNo(String fOldMatchNo) {
		FOldMatchNo = fOldMatchNo;
	}
	@Column(name="FOldExpiryDate")
	public String getFOldExpiryDate() {
		return FOldExpiryDate;
	}
	public void setFOldExpiryDate(String fOldExpiryDate) {
		FOldExpiryDate = fOldExpiryDate;
	}
	@Column(name="FUpperMatchDate")
	public String getFUpperMatchDate() {
		return FUpperMatchDate;
	}
	public void setFUpperMatchDate(String fUpperMatchDate) {
		FUpperMatchDate = fUpperMatchDate;
	}
	@Column(name="FUpperMatchTime")
	public String getFUpperMatchTime() {
		return FUpperMatchTime;
	}
	public void setFUpperMatchTime(String fUpperMatchTime) {
		FUpperMatchTime = fUpperMatchTime;
	}
	@Column(name="FIsStartegy")
	public String getFIsStartegy() {
		return FIsStartegy;
	}
	public void setFIsStartegy(String fIsStartegy) {
		FIsStartegy = fIsStartegy;
	}
	@Column(name="FStartegyCommodityNo")
	public String getFStartegyCommodityNo() {
		return FStartegyCommodityNo;
	}
	public void setFStartegyCommodityNo(String fStartegyCommodityNo) {
		FStartegyCommodityNo = fStartegyCommodityNo;
	}
	@Column(name="FStartegyContractDate")
	public String getFStartegyContractDate() {
		return FStartegyContractDate;
	}
	public void setFStartegyContractDate(String fStartegyContractDate) {
		FStartegyContractDate = fStartegyContractDate;
	}
	@Column(name="FOffset")
	public String getFOffset() {
		return FOffset;
	}
	public void setFOffset(String fOffset) {
		FOffset = fOffset;
	}
	@Column(name="FSubClientNo")
	public String getFSubClientNo() {
		return FSubClientNo;
	}
	public void setFSubClientNo(String fSubClientNo) {
		FSubClientNo = fSubClientNo;
	}
	@Column(name="FClientFee1")
	public BigDecimal getFClientFee1() {
		return FClientFee1;
	}
	public void setFClientFee1(BigDecimal fClientFee1) {
		FClientFee1 = fClientFee1;
	}
	@Column(name="FClientFee2")
	public BigDecimal getFClientFee2() {
		return FClientFee2;
	}
	public void setFClientFee2(BigDecimal fClientFee2) {
		FClientFee2 = fClientFee2;
	}
	@Column(name="FClientFee3")
	public BigDecimal getFClientFee3() {
		return FClientFee3;
	}
	public void setFClientFee3(BigDecimal fClientFee3) {
		FClientFee3 = fClientFee3;
	}


}
