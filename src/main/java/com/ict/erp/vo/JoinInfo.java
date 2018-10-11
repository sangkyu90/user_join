package com.ict.erp.vo;

import org.apache.ibatis.type.Alias;

@Alias("ji")
public class JoinInfo {
	private Integer ujNum;
	private String ujId;
	private String ujPwd;
	private String ujLocal;
	private String ujName;
	private String ujEmali;
	private String ujGender;
	private String ujBirth;
	private String ujMobile;
	private String ujAddress;
	
	
	public JoinInfo() {}
	public JoinInfo(Integer ujNum, String ujId, String ujPwd, String ujLocal, String ujName, String ujEmali,
			String ujGender, String ujBirth, String ujMobile, String ujAddress) {
		super();
		this.ujNum = ujNum;
		this.ujId = ujId;
		this.ujPwd = ujPwd;
		this.ujLocal = ujLocal;
		this.ujName = ujName;
		this.ujEmali = ujEmali;
		this.ujGender = ujGender;
		this.ujBirth = ujBirth;
		this.ujMobile = ujMobile;
		this.ujAddress = ujAddress;
	}
	
	public Integer getUjNum() {
		return ujNum;
	}
	public void setUjNum(Integer ujNum) {
		this.ujNum = ujNum;
	}
	public String getUjId() {
		return ujId;
	}
	public void setUjId(String ujId) {
		this.ujId = ujId;
	}
	public String getUjPwd() {
		return ujPwd;
	}
	public void setUjPwd(String ujPwd) {
		this.ujPwd = ujPwd;
	}
	public String getUjLocal() {
		return ujLocal;
	}
	public void setUjLocal(String ujLocal) {
		this.ujLocal = ujLocal;
	}
	public String getUjName() {
		return ujName;
	}
	public void setUjName(String ujName) {
		this.ujName = ujName;
	}
	public String getUjEmali() {
		return ujEmali;
	}
	public void setUjEmali(String ujEmali) {
		this.ujEmali = ujEmali;
	}
	public String getUjGender() {
		return ujGender;
	}
	public void setUjGender(String ujGender) {
		this.ujGender = ujGender;
	}
	public String getUjBirth() {
		return ujBirth;
	}
	public void setUjBirth(String ujBirth) {
		this.ujBirth = ujBirth;
	}
	public String getUjMobile() {
		return ujMobile;
	}
	public void setUjMobile(String ujMobile) {
		this.ujMobile = ujMobile;
	}
	public String getUjAddress() {
		return ujAddress;
	}
	public void setUjAddress(String ujAddress) {
		this.ujAddress = ujAddress;
	}
	
	@Override
	public String toString() {
		return "JoinInfo [ujNum=" + ujNum + ", ujId=" + ujId + ", ujPwd=" + ujPwd + ", ujLocal=" + ujLocal + ", ujName="
				+ ujName + ", ujEmali=" + ujEmali + ", ujGender=" + ujGender + ", ujBirth=" + ujBirth + ", ujMobile="
				+ ujMobile + ", ujAddress=" + ujAddress + "]";
	}
}