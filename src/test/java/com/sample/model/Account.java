package com.sample.model;

 public class Account
 {
	 private String message;
	 public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	private Integer balance;

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	 public Account() {}
	 public Account(Integer balance) {
	        super();
	        this.balance = balance;
	    }
	    public void withdraw(int money) {
	        balance -= money;
	    }
 }
