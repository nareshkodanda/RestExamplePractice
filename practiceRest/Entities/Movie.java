package com.SpringRest.practiceRest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private int mid;
	private String mname;
	private String mdirector;
	
	
	public Movie(int mid, String mname, String mdirector) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mdirector = mdirector;
	}


	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMdirector() {
		return mdirector;
	}


	public void setMdirector(String mdirector) {
		this.mdirector = mdirector;
	}


	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mdirector=" + mdirector + "]";
	}


	
	
	
	
	

}
