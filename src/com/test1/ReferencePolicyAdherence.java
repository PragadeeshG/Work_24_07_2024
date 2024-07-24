package com.test1;

public class ReferencePolicyAdherence {
	private Integer systemId;
	private String systemOwner;
	private boolean activeAccount;
	private Integer systemTypeId;
	private String systemType;
	private String systemStatus;
	private Integer systemDescription;
	private Integer applicationsCount;
	private String launchCountries;
	private Integer launchCountriesCount;
	private String applicationNameList;
	private String status;
	private String remarks;

	public ReferencePolicyAdherence() {

	}

	public ReferencePolicyAdherence(Integer systemId, String systemOwner, boolean activeAccount, Integer systemTypeId,
			String systemType, String systemStatus, Integer systemDescription, Integer applicationsCount,
			String launchCountries, Integer launchCountriesCount, String applicationNameList, String status,
			String remarks) {
		super();
		this.systemId = systemId;
		this.systemOwner = systemOwner;
		this.activeAccount = activeAccount;
		this.systemTypeId = systemTypeId;
		this.systemType = systemType;
		this.systemStatus = systemStatus;
		this.systemDescription = systemDescription;
		this.applicationsCount = applicationsCount;
		this.launchCountries = launchCountries;
		this.launchCountriesCount = launchCountriesCount;
		this.applicationNameList = applicationNameList;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getSystemOwner() {
		return systemOwner;
	}

	public void setSystemOwner(String systemOwner) {
		this.systemOwner = systemOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getSystemTypeId() {
		return systemTypeId;
	}

	public void setSystemTypeId(Integer systemTypeId) {
		this.systemTypeId = systemTypeId;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(String systemStatus) {
		this.systemStatus = systemStatus;
	}

	public Integer getSystemDescription() {
		return systemDescription;
	}

	public void setSystemDescription(Integer systemDescription) {
		this.systemDescription = systemDescription;
	}

	public Integer getApplicationsCount() {
		return applicationsCount;
	}

	public void setApplicationsCount(Integer applicationsCount) {
		this.applicationsCount = applicationsCount;
	}

	public String getLaunchCountries() {
		return launchCountries;
	}

	public void setLaunchCountries(String launchCountries) {
		this.launchCountries = launchCountries;
	}

	public Integer getLaunchCountriesCount() {
		return launchCountriesCount;
	}

	public void setLaunchCountriesCount(Integer launchCountriesCount) {
		this.launchCountriesCount = launchCountriesCount;
	}

	public String getApplicationNameList() {
		return applicationNameList;
	}

	public void setApplicationNameList(String applicationNameList) {
		this.applicationNameList = applicationNameList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
