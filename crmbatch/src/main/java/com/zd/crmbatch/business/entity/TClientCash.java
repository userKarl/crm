package com.zd.crmbatch.business.entity;
// default package
// Generated 2018-4-20 9:30:53 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TClientCash")
@Entity
public class TClientCash{

	private int FSerialId;
	private String fDate;
	private String FClientNo;
	private String FType;
	private String FMode;
	private String FCurrencyNo;
	private BigDecimal FMoney;
	private String FRemark;
	private String FIsSystem;
	private String FSubmitName;
	private String FSubmitTime;
	private String FAuditName;
	private String FAuditTime;
	private String P1MerId;
	private String R1Code;
	private String R2TrxId;
	private String R6Order;
	private String R7Uid;
	private String R8Mp;
	private String FSwapId;
	private BigDecimal FExchangeRate;
	private String FFinancingType;
	private String FFromBankDate;
	private Integer FBankInfo;
	private BigDecimal FDebitAmt;
	private String FPaymentCur;
	private String FValueDate;
	private Integer FDebitCard;
	private String FTransMode;
	private String GLCode;
	
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
	@Column(name="FType")
	public String getFType() {
		return FType;
	}
	public void setFType(String fType) {
		FType = fType;
	}
	@Column(name="FMode")
	public String getFMode() {
		return FMode;
	}
	public void setFMode(String fMode) {
		FMode = fMode;
	}
	@Column(name="FCurrencyNo")
	public String getFCurrencyNo() {
		return FCurrencyNo;
	}
	public void setFCurrencyNo(String fCurrencyNo) {
		FCurrencyNo = fCurrencyNo;
	}
	@Column(name="FMoney")
	public BigDecimal getFMoney() {
		return FMoney;
	}
	public void setFMoney(BigDecimal fMoney) {
		FMoney = fMoney;
	}
	@Column(name="FRemark")
	public String getFRemark() {
		return FRemark;
	}
	public void setFRemark(String fRemark) {
		FRemark = fRemark;
	}
	@Column(name="FIsSystem")
	public String getFIsSystem() {
		return FIsSystem;
	}
	public void setFIsSystem(String fIsSystem) {
		FIsSystem = fIsSystem;
	}
	@Column(name="FSubmitName")
	public String getFSubmitName() {
		return FSubmitName;
	}
	public void setFSubmitName(String fSubmitName) {
		FSubmitName = fSubmitName;
	}
	@Column(name="FSubmitTime")
	public String getFSubmitTime() {
		return FSubmitTime;
	}
	public void setFSubmitTime(String fSubmitTime) {
		FSubmitTime = fSubmitTime;
	}
	@Column(name="FAuditName")
	public String getFAuditName() {
		return FAuditName;
	}
	public void setFAuditName(String fAuditName) {
		FAuditName = fAuditName;
	}
	@Column(name="FAuditTime")
	public String getFAuditTime() {
		return FAuditTime;
	}
	public void setFAuditTime(String fAuditTime) {
		FAuditTime = fAuditTime;
	}
	@Column(name="p1_MerId")
	public String getP1MerId() {
		return P1MerId;
	}
	public void setP1MerId(String p1MerId) {
		P1MerId = p1MerId;
	}
	@Column(name="r1_Code")
	public String getR1Code() {
		return R1Code;
	}
	public void setR1Code(String r1Code) {
		R1Code = r1Code;
	}
	@Column(name="r2_TrxId")
	public String getR2TrxId() {
		return R2TrxId;
	}
	public void setR2TrxId(String r2TrxId) {
		R2TrxId = r2TrxId;
	}
	@Column(name="r6_Order")
	public String getR6Order() {
		return R6Order;
	}
	public void setR6Order(String r6Order) {
		R6Order = r6Order;
	}
	@Column(name="r7_Uid")
	public String getR7Uid() {
		return R7Uid;
	}
	public void setR7Uid(String r7Uid) {
		R7Uid = r7Uid;
	}
	@Column(name="r8_MP")
	public String getR8Mp() {
		return R8Mp;
	}
	public void setR8Mp(String r8Mp) {
		R8Mp = r8Mp;
	}
	@Column(name="FSwapId")
	public String getFSwapId() {
		return FSwapId;
	}
	public void setFSwapId(String fSwapId) {
		FSwapId = fSwapId;
	}
	@Column(name="FExchangeRate")
	public BigDecimal getFExchangeRate() {
		return FExchangeRate;
	}
	public void setFExchangeRate(BigDecimal fExchangeRate) {
		FExchangeRate = fExchangeRate;
	}
	@Column(name="FFinancingType")
	public String getFFinancingType() {
		return FFinancingType;
	}
	public void setFFinancingType(String fFinancingType) {
		FFinancingType = fFinancingType;
	}
	@Column(name="FFromBankDate")
	public String getFFromBankDate() {
		return FFromBankDate;
	}
	public void setFFromBankDate(String fFromBankDate) {
		FFromBankDate = fFromBankDate;
	}
	@Column(name="FBankInfo")
	public Integer getFBankInfo() {
		return FBankInfo;
	}
	public void setFBankInfo(Integer fBankInfo) {
		FBankInfo = fBankInfo;
	}
	@Column(name="FDebitAmt")
	public BigDecimal getFDebitAmt() {
		return FDebitAmt;
	}
	public void setFDebitAmt(BigDecimal fDebitAmt) {
		FDebitAmt = fDebitAmt;
	}
	@Column(name="FPaymentCur")
	public String getFPaymentCur() {
		return FPaymentCur;
	}
	public void setFPaymentCur(String fPaymentCur) {
		FPaymentCur = fPaymentCur;
	}
	@Column(name="FValueDate")
	public String getFValueDate() {
		return FValueDate;
	}
	public void setFValueDate(String fValueDate) {
		FValueDate = fValueDate;
	}
	@Column(name="FDebitCard")
	public Integer getFDebitCard() {
		return FDebitCard;
	}
	public void setFDebitCard(Integer fDebitCard) {
		FDebitCard = fDebitCard;
	}
	@Column(name="FTransMode")
	public String getFTransMode() {
		return FTransMode;
	}
	public void setFTransMode(String fTransMode) {
		FTransMode = fTransMode;
	}
	@Column(name="GLCode")
	public String getGLCode() {
		return GLCode;
	}
	public void setGLCode(String gLCode) {
		GLCode = gLCode;
	}

}
