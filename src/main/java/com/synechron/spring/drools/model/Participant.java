package com.synechron.spring.drools.model;

import java.util.ArrayList;
import java.util.List;

public class Participant {
   
	private Integer caseNumber;
	private Integer ssn;
	private String name;
	private String address;
	private String dob;
	private String deathDate;
	private String enhancedSecurityInfo;
	private Integer loanAmt;
	private String status;
	private String frozenPlan;
	private boolean unprocessedRemit;
	private boolean balInOutsideFund;
	private Double terminatedAmt;
	private Long teminatedWaitPeriod; 
	private Double vestedBal;
	private boolean legalHold;
	private boolean fromP3;
	private List<String> validations;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public boolean getUnprocessedRemit() {
		return unprocessedRemit;
	}
	public void setUnprocessedRemit(boolean unprocessedRemit) {
		this.unprocessedRemit = unprocessedRemit;
	}
	public boolean getBalInOutsideFund() {
		return balInOutsideFund;
	}
	public void setBalInOutsideFund(boolean balInOutsideFund) {
		this.balInOutsideFund = balInOutsideFund;
	}
	public Double getTerminatedAmt() {
		return terminatedAmt;
	}
	public void setTerminatedAmt(Double terminatedAmt) {
		this.terminatedAmt = terminatedAmt;
	}
	public Long getTeminatedWaitPeriod() {
		return teminatedWaitPeriod;
	}
	public void setTeminatedWaitPeriod(Long teminatedWaitPeriod) {
		this.teminatedWaitPeriod = teminatedWaitPeriod;
	}
	public Double getVestedBal() {
		return vestedBal;
	}
	public void setVestedBal(Double vestedBal) {
		this.vestedBal = vestedBal;
	}
	public boolean getLegalHold() {
		return legalHold;
	}
	public void setLegalHold(boolean legalHold) {
		this.legalHold = legalHold;
	}
	public Integer getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeathDate() {
		return deathDate;
	}
	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}
	public String getEnhancedSecurityInfo() {
		return enhancedSecurityInfo;
	}
	public void setEnhancedSecurityInfo(String enhancedSecurityInfo) {
		this.enhancedSecurityInfo = enhancedSecurityInfo;
	}
	public Integer getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(Integer loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFrozenPlan() {
		return frozenPlan;
	}
	public void setFrozenPlan(String frozenPlan) {
		this.frozenPlan = frozenPlan;
	}
	public List<String> getValidations() {
		if(validations == null) {
			validations = new ArrayList<>();
		}
		return validations;
	}
	public void addValidations(String validation) {
		getValidations().add(validation);
	}
	public boolean getFromP3() {
		return fromP3;
	}
	public void setFromP3(boolean fromP3) {
		this.fromP3 = fromP3;
	}

}
