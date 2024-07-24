package com.test1;

public class ReferencePolicyStructure {
	private Integer recordKey;
	private Integer policyChecksumCode;
	private String policyChecksumCodePosition;
	private String policyChecksumCodeLength;
	private String policyCheckDigitsPosition;
	private String policyCheckDigitsLength;
	private boolean policyIdentifierPosition;
	private String policyIdentifierLength;
	private String treeIdentifierPosition;
	private String treeIdentifierLength;
	private String policyNationalIdLength;
	private String systemNumberPosition;
	private String systemNumberLength;
	private String policyTotalLength;

	public ReferencePolicyStructure() {

	}

	public ReferencePolicyStructure(Integer recordKey, Integer policyChecksumCode, String policyChecksumCodePosition,
			String policyChecksumCodeLength, String policyCheckDigitsPosition, String policyCheckDigitsLength,
			boolean policyIdentifierPosition, String policyIdentifierLength, String treeIdentifierPosition,
			String treeIdentifierLength, String policyNationalIdLength, String systemNumberPosition,
			String systemNumberLength, String policyTotalLength) {
		super();
		this.recordKey = recordKey;
		this.policyChecksumCode = policyChecksumCode;
		this.policyChecksumCodePosition = policyChecksumCodePosition;
		this.policyChecksumCodeLength = policyChecksumCodeLength;
		this.policyCheckDigitsPosition = policyCheckDigitsPosition;
		this.policyCheckDigitsLength = policyCheckDigitsLength;
		this.policyIdentifierPosition = policyIdentifierPosition;
		this.policyIdentifierLength = policyIdentifierLength;
		this.treeIdentifierPosition = treeIdentifierPosition;
		this.treeIdentifierLength = treeIdentifierLength;
		this.policyNationalIdLength = policyNationalIdLength;
		this.systemNumberPosition = systemNumberPosition;
		this.systemNumberLength = systemNumberLength;
		this.policyTotalLength = policyTotalLength;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getPolicyChecksumCode() {
		return policyChecksumCode;
	}

	public void setPolicyChecksumCode(Integer policyChecksumCode) {
		this.policyChecksumCode = policyChecksumCode;
	}

	public String getPolicyChecksumCodePosition() {
		return policyChecksumCodePosition;
	}

	public void setPolicyChecksumCodePosition(String policyChecksumCodePosition) {
		this.policyChecksumCodePosition = policyChecksumCodePosition;
	}

	public String getPolicyChecksumCodeLength() {
		return policyChecksumCodeLength;
	}

	public void setPolicyChecksumCodeLength(String policyChecksumCodeLength) {
		this.policyChecksumCodeLength = policyChecksumCodeLength;
	}

	public String getPolicyCheckDigitsPosition() {
		return policyCheckDigitsPosition;
	}

	public void setPolicyCheckDigitsPosition(String policyCheckDigitsPosition) {
		this.policyCheckDigitsPosition = policyCheckDigitsPosition;
	}

	public String getPolicyCheckDigitsLength() {
		return policyCheckDigitsLength;
	}

	public void setPolicyCheckDigitsLength(String policyCheckDigitsLength) {
		this.policyCheckDigitsLength = policyCheckDigitsLength;
	}

	public boolean isPolicyIdentifierPosition() {
		return policyIdentifierPosition;
	}

	public void setPolicyIdentifierPosition(boolean policyIdentifierPosition) {
		this.policyIdentifierPosition = policyIdentifierPosition;
	}

	public String getPolicyIdentifierLength() {
		return policyIdentifierLength;
	}

	public void setPolicyIdentifierLength(String policyIdentifierLength) {
		this.policyIdentifierLength = policyIdentifierLength;
	}

	public String getTreeIdentifierPosition() {
		return treeIdentifierPosition;
	}

	public void setTreeIdentifierPosition(String treeIdentifierPosition) {
		this.treeIdentifierPosition = treeIdentifierPosition;
	}

	public String getTreeIdentifierLength() {
		return treeIdentifierLength;
	}

	public void setTreeIdentifierLength(String treeIdentifierLength) {
		this.treeIdentifierLength = treeIdentifierLength;
	}

	public String getPolicyNationalIdLength() {
		return policyNationalIdLength;
	}

	public void setPolicyNationalIdLength(String policyNationalIdLength) {
		this.policyNationalIdLength = policyNationalIdLength;
	}

	public String getSystemNumberPosition() {
		return systemNumberPosition;
	}

	public void setSystemNumberPosition(String systemNumberPosition) {
		this.systemNumberPosition = systemNumberPosition;
	}

	public String getSystemNumberLength() {
		return systemNumberLength;
	}

	public void setSystemNumberLength(String systemNumberLength) {
		this.systemNumberLength = systemNumberLength;
	}

	public String getPolicyTotalLength() {
		return policyTotalLength;
	}

	public void setPolicyTotalLength(String policyTotalLength) {
		this.policyTotalLength = policyTotalLength;
	}

}
