package com.zd.crmbatch.business.entity;
// default package
// Generated 2018-4-20 9:30:53 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name="TClientFund")
@Entity
@IdClass(TClientFundPK.class)
public class TClientFund{

	private String fDate;
	private String FClientNo;
	private String FCurrencyNo;
	private Integer FMatchVol;
	private Integer FHoldVol;
	private Integer FDelivVol;
	private BigDecimal FTurnover;
	private BigDecimal FPremium;
	private BigDecimal FIn;
	private BigDecimal FOut;
	private BigDecimal FAdjust;
	private BigDecimal FPledged;
	private BigDecimal FClientFee;
	private BigDecimal FsClientFee;
	private BigDecimal FUpperFee;
	private BigDecimal FsUpperFee;
	private BigDecimal FNetFee;
	private BigDecimal FClientDeposit;
	private BigDecimal FKeepClientDeposit;
	private BigDecimal FUpperDeposit;
	private BigDecimal FKeepUpperDeposit;
	private BigDecimal FFrozenClientDeposit;
	private BigDecimal FFrozenKeepClientDeposit;
	private BigDecimal FFrozenUpperDeposit;
	private BigDecimal FFrozenKeepUpperDeposit;
	private BigDecimal FCoverProfit;
	private BigDecimal FUnExpiredProfit;
	private BigDecimal FHoldProfit;
	private BigDecimal FDelivProfit;
	private BigDecimal FyMoney;
	private BigDecimal FyBalance;
	private BigDecimal FMoney;
	private BigDecimal FBalance;
	private BigDecimal FAvailable;
	private BigDecimal FAvailable2;
	private BigDecimal FExtractable;
	private String FGroupNo;
	private BigDecimal FExchangeRate;
	
	@Id
	@Column(name="FDate")
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	@Id
	@Column(name="FClientNo")
	public String getFClientNo() {
		return FClientNo;
	}
	public void setFClientNo(String fClientNo) {
		FClientNo = fClientNo;
	}
	@Id
	@Column(name="FCurrencyNo")
	public String getFCurrencyNo() {
		return FCurrencyNo;
	}
	public void setFCurrencyNo(String fCurrencyNo) {
		FCurrencyNo = fCurrencyNo;
	}
	@Column(name="FMatchVol")
	public Integer getFMatchVol() {
		return FMatchVol;
	}
	public void setFMatchVol(Integer fMatchVol) {
		FMatchVol = fMatchVol;
	}
	@Column(name="FHoldVol")
	public Integer getFHoldVol() {
		return FHoldVol;
	}
	public void setFHoldVol(Integer fHoldVol) {
		FHoldVol = fHoldVol;
	}
	@Column(name="FDelivVol")
	public Integer getFDelivVol() {
		return FDelivVol;
	}
	public void setFDelivVol(Integer fDelivVol) {
		FDelivVol = fDelivVol;
	}
	@Column(name="FTurnover")
	public BigDecimal getFTurnover() {
		return FTurnover;
	}
	public void setFTurnover(BigDecimal fTurnover) {
		FTurnover = fTurnover;
	}
	@Column(name="FPremium")
	public BigDecimal getFPremium() {
		return FPremium;
	}
	public void setFPremium(BigDecimal fPremium) {
		FPremium = fPremium;
	}
	@Column(name="FIn")
	public BigDecimal getFIn() {
		return FIn;
	}
	public void setFIn(BigDecimal fIn) {
		FIn = fIn;
	}
	@Column(name="FOut")
	public BigDecimal getFOut() {
		return FOut;
	}
	public void setFOut(BigDecimal fOut) {
		FOut = fOut;
	}
	@Column(name="FAdjust")
	public BigDecimal getFAdjust() {
		return FAdjust;
	}
	public void setFAdjust(BigDecimal fAdjust) {
		FAdjust = fAdjust;
	}
	@Column(name="FPledged")
	public BigDecimal getFPledged() {
		return FPledged;
	}
	public void setFPledged(BigDecimal fPledged) {
		FPledged = fPledged;
	}
	@Column(name="FClientFee")
	public BigDecimal getFClientFee() {
		return FClientFee;
	}
	public void setFClientFee(BigDecimal fClientFee) {
		FClientFee = fClientFee;
	}
	@Column(name="FsClientFee")
	public BigDecimal getFsClientFee() {
		return FsClientFee;
	}
	public void setFsClientFee(BigDecimal fsClientFee) {
		FsClientFee = fsClientFee;
	}
	@Column(name="FUpperFee")
	public BigDecimal getFUpperFee() {
		return FUpperFee;
	}
	public void setFUpperFee(BigDecimal fUpperFee) {
		FUpperFee = fUpperFee;
	}
	@Column(name="FsUpperFee")
	public BigDecimal getFsUpperFee() {
		return FsUpperFee;
	}
	public void setFsUpperFee(BigDecimal fsUpperFee) {
		FsUpperFee = fsUpperFee;
	}
	@Column(name="FNetFee")
	public BigDecimal getFNetFee() {
		return FNetFee;
	}
	public void setFNetFee(BigDecimal fNetFee) {
		FNetFee = fNetFee;
	}
	@Column(name="FClientDeposit")
	public BigDecimal getFClientDeposit() {
		return FClientDeposit;
	}
	public void setFClientDeposit(BigDecimal fClientDeposit) {
		FClientDeposit = fClientDeposit;
	}
	@Column(name="FKeepClientDeposit")
	public BigDecimal getFKeepClientDeposit() {
		return FKeepClientDeposit;
	}
	public void setFKeepClientDeposit(BigDecimal fKeepClientDeposit) {
		FKeepClientDeposit = fKeepClientDeposit;
	}
	@Column(name="FUpperDeposit")
	public BigDecimal getFUpperDeposit() {
		return FUpperDeposit;
	}
	public void setFUpperDeposit(BigDecimal fUpperDeposit) {
		FUpperDeposit = fUpperDeposit;
	}
	@Column(name="FKeepUpperDeposit")
	public BigDecimal getFKeepUpperDeposit() {
		return FKeepUpperDeposit;
	}
	public void setFKeepUpperDeposit(BigDecimal fKeepUpperDeposit) {
		FKeepUpperDeposit = fKeepUpperDeposit;
	}
	@Column(name="FFrozenClientDeposit")
	public BigDecimal getFFrozenClientDeposit() {
		return FFrozenClientDeposit;
	}
	public void setFFrozenClientDeposit(BigDecimal fFrozenClientDeposit) {
		FFrozenClientDeposit = fFrozenClientDeposit;
	}
	@Column(name="FFrozenKeepClientDeposit")
	public BigDecimal getFFrozenKeepClientDeposit() {
		return FFrozenKeepClientDeposit;
	}
	public void setFFrozenKeepClientDeposit(BigDecimal fFrozenKeepClientDeposit) {
		FFrozenKeepClientDeposit = fFrozenKeepClientDeposit;
	}
	@Column(name="FFrozenUpperDeposit")
	public BigDecimal getFFrozenUpperDeposit() {
		return FFrozenUpperDeposit;
	}
	public void setFFrozenUpperDeposit(BigDecimal fFrozenUpperDeposit) {
		FFrozenUpperDeposit = fFrozenUpperDeposit;
	}
	@Column(name="FFrozenKeepUpperDeposit")
	public BigDecimal getFFrozenKeepUpperDeposit() {
		return FFrozenKeepUpperDeposit;
	}
	public void setFFrozenKeepUpperDeposit(BigDecimal fFrozenKeepUpperDeposit) {
		FFrozenKeepUpperDeposit = fFrozenKeepUpperDeposit;
	}
	@Column(name="FCoverProfit")
	public BigDecimal getFCoverProfit() {
		return FCoverProfit;
	}
	public void setFCoverProfit(BigDecimal fCoverProfit) {
		FCoverProfit = fCoverProfit;
	}
	@Column(name="FUnExpiredProfit")
	public BigDecimal getFUnExpiredProfit() {
		return FUnExpiredProfit;
	}
	public void setFUnExpiredProfit(BigDecimal fUnExpiredProfit) {
		FUnExpiredProfit = fUnExpiredProfit;
	}
	@Column(name="FHoldProfit")
	public BigDecimal getFHoldProfit() {
		return FHoldProfit;
	}
	public void setFHoldProfit(BigDecimal fHoldProfit) {
		FHoldProfit = fHoldProfit;
	}
	@Column(name="FDelivProfit")
	public BigDecimal getFDelivProfit() {
		return FDelivProfit;
	}
	public void setFDelivProfit(BigDecimal fDelivProfit) {
		FDelivProfit = fDelivProfit;
	}
	@Column(name="FyMoney")
	public BigDecimal getFyMoney() {
		return FyMoney;
	}
	public void setFyMoney(BigDecimal fyMoney) {
		FyMoney = fyMoney;
	}
	@Column(name="FyBalance")
	public BigDecimal getFyBalance() {
		return FyBalance;
	}
	public void setFyBalance(BigDecimal fyBalance) {
		FyBalance = fyBalance;
	}
	@Column(name="FMoney")
	public BigDecimal getFMoney() {
		return FMoney;
	}
	public void setFMoney(BigDecimal fMoney) {
		FMoney = fMoney;
	}
	@Column(name="FBalance")
	public BigDecimal getFBalance() {
		return FBalance;
	}
	public void setFBalance(BigDecimal fBalance) {
		FBalance = fBalance;
	}
	@Column(name="FAvailable")
	public BigDecimal getFAvailable() {
		return FAvailable;
	}
	public void setFAvailable(BigDecimal fAvailable) {
		FAvailable = fAvailable;
	}
	@Column(name="FAvailable2")
	public BigDecimal getFAvailable2() {
		return FAvailable2;
	}
	public void setFAvailable2(BigDecimal fAvailable2) {
		FAvailable2 = fAvailable2;
	}
	@Column(name="FExtractable")
	public BigDecimal getFExtractable() {
		return FExtractable;
	}
	public void setFExtractable(BigDecimal fExtractable) {
		FExtractable = fExtractable;
	}
	@Column(name="FGroupNo")
	public String getFGroupNo() {
		return FGroupNo;
	}
	public void setFGroupNo(String fGroupNo) {
		FGroupNo = fGroupNo;
	}
	@Column(name="FExchangeRate")
	public BigDecimal getFExchangeRate() {
		return FExchangeRate;
	}
	public void setFExchangeRate(BigDecimal fExchangeRate) {
		FExchangeRate = fExchangeRate;
	}


}
