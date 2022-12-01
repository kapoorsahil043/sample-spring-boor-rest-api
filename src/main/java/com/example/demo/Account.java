package com.example.demo;

public class Account {

	private long accNo;
	private String accType;

	public Account() {
		super();
	}

	public Account(long accNo, String accType) {
		this.accNo = accNo;
		this.accType = accType;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
}
