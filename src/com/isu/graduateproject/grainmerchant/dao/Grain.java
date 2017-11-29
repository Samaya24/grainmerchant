package com.isu.graduateproject.grainmerchant.dao;

public class Grain {
	
	private int grainid;
	private String username;
	private String itemname;
	private int rate;
	private int quality;
	private int quantity;
	private int isavailable;
	private String timeleft;
	
	public Grain(){
		
	}
	
	public Grain(int grainid, String username, String itemname, int rate, int quality, int quantity, int isavailable, String timeleft) {
		this.grainid = grainid;
		this.username = username;
		this.itemname = itemname;
		this.rate = rate;
		this.quality = quality;
		this.quantity = quantity;
		this.isavailable = isavailable;
		this.timeleft = timeleft;
	}
	public int getGrainid() {
		return grainid;
	}
	public void setGrainid(int grainid) {
		this.grainid = grainid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getIsavailable() {
		return isavailable;
	}
	public void setIsavailable(int isavailable) {
		this.isavailable = isavailable;
	}
	public String getTimeleft() {
		return timeleft;
	}
	public void setTimeleft(String timeleft) {
		this.timeleft = timeleft;
	}
}
