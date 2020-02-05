package com.payday.history.entities;

import java.util.Date;

import javax.persistence.*;

//List of transactions must be sorted by date of
//occurrence.
//• You can assume that there is already a list of
//transactions in the database with the fields: Date
//of transaction, Amount and Short Description.

@Entity
@Table(name = "history")
public class History {
	@Id
	@GeneratedValue
	private long id;
	private String customerCode;
	private int accountNumber;
	private Date processDate;
	private Double amount;
	private String desciption;
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
