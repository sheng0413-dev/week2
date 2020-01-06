package com.liuyongsheng.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Querymodel {
	private int pageNum;
	private int pageSize=4;
	private int pages;
	private String id;
	private String guan;
	private String maio;
	private String name;
	private String zhu;
	private String address;
	private String maxben;
	private String minben;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxcheng;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mincheng;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxnain;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date minnain;
	private String checks;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGuan() {
		return guan;
	}
	public void setGuan(String guan) {
		this.guan = guan;
	}
	public String getMaio() {
		return maio;
	}
	public void setMaio(String maio) {
		this.maio = maio;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZhu() {
		return zhu;
	}
	public void setZhu(String zhu) {
		this.zhu = zhu;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMaxben() {
		return maxben;
	}
	public void setMaxben(String maxben) {
		this.maxben = maxben;
	}
	public String getMinben() {
		return minben;
	}
	public void setMinben(String minben) {
		this.minben = minben;
	}
	public Date getMaxcheng() {
		return maxcheng;
	}
	public void setMaxcheng(Date maxcheng) {
		this.maxcheng = maxcheng;
	}
	public Date getMincheng() {
		return mincheng;
	}
	public void setMincheng(Date mincheng) {
		this.mincheng = mincheng;
	}
	public Date getMaxnain() {
		return maxnain;
	}
	public void setMaxnain(Date maxnain) {
		this.maxnain = maxnain;
	}
	public Date getMinnain() {
		return minnain;
	}
	public void setMinnain(Date minnain) {
		this.minnain = minnain;
	}
	public String getChecks() {
		return checks;
	}
	public void setChecks(String checks) {
		this.checks = checks;
	}
	public Querymodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
