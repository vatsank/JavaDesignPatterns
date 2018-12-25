package com.training.builder;

/* PRODUCT */

public class PolicyQuote {

	
	private  String policyName;
	private long tenure;
	private double premium;
	private String  paymentMode;
	private String riders;
	
	public String getRiders() {
		return riders;
	}
	public void setRiders(String riders) {
		this.riders = riders;
	}
	public PolicyQuote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyQuote(String policyName, long tenure, double premium,
			String paymentMode) {
		super();
		this.policyName = policyName;
		this.tenure = tenure;
		this.premium = premium;
		this.paymentMode = paymentMode;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public long getTenure() {
		return tenure;
	}
	public void setTenure(long tenure) {
		this.tenure = tenure;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "PolicyQuote [policyName=" + policyName + ", tenure=" + tenure
				+ ", premium=" + premium + ", paymentMode=" + paymentMode + "]";
	}
	
	
}
