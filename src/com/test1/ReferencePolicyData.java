package com.test1;

public class ReferencePolicyData {
	private String refCode;
	private String refName;
	private String localPolicy;
	private String tradePolicy;
	private String shortDescription;
	private String dataIndicator;
	private String consumedBy;
	private Integer dataArc;
	private String params;
	private String filter;
	private String status;

	public ReferencePolicyData() {

	}

	public ReferencePolicyData(String refCode, String refName, String localPolicy, String tradePolicy,
			String shortDescription, String dataIndicator, String consumedBy, Integer dataArc, String params,
			String filter, String status) {
		super();
		this.refCode = refCode;
		this.refName = refName;
		this.localPolicy = localPolicy;
		this.tradePolicy = tradePolicy;
		this.shortDescription = shortDescription;
		this.dataIndicator = dataIndicator;
		this.consumedBy = consumedBy;
		this.dataArc = dataArc;
		this.params = params;
		this.filter = filter;
		this.status = status;
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getLocalPolicy() {
		return localPolicy;
	}

	public void setLocalPolicy(String localPolicy) {
		this.localPolicy = localPolicy;
	}

	public String getTradePolicy() {
		return tradePolicy;
	}

	public void setTradePolicy(String tradePolicy) {
		this.tradePolicy = tradePolicy;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDataIndicator() {
		return dataIndicator;
	}

	public void setDataIndicator(String dataIndicator) {
		this.dataIndicator = dataIndicator;
	}

	public String getConsumedBy() {
		return consumedBy;
	}

	public void setConsumedBy(String consumedBy) {
		this.consumedBy = consumedBy;
	}

	public Integer getDataArc() {
		return dataArc;
	}

	public void setDataArc(Integer dataArc) {
		this.dataArc = dataArc;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
