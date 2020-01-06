package com.liuyongsheng.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Complu {
	private String id;
	private String guan;
	private String maio;
	private String name;
	private String zhu;
	private String address;
	private String ben;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date cheng;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date nain;
	private String checks;
	private String bei;
	
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
	public String getBen() {
		return ben;
	}
	public void setBen(String ben) {
		this.ben = ben;
	}
	public Date getCheng() {
		return cheng;
	}
	public void setCheng(Date cheng) {
		this.cheng = cheng;
	}
	public Date getNain() {
		return nain;
	}
	public void setNain(Date nain) {
		this.nain = nain;
	}
	
	public String getChecks() {
		return checks;
	}
	public void setChecks(String checks) {
		this.checks = checks;
	}
	public String getBei() {
		return bei;
	}
	public void setBei(String bei) {
		this.bei = bei;
	}
	public Complu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complu(String id, String guan, String maio, String name, String zhu, String address, String ben, Date cheng,
			Date nain, String checks, String bei) {
		super();
		this.id = id;
		this.guan = guan;
		this.maio = maio;
		this.name = name;
		this.zhu = zhu;
		this.address = address;
		this.ben = ben;
		this.cheng = cheng;
		this.nain = nain;
		this.checks = checks;
		this.bei = bei;
	}
	public Complu(String id, String guan, String maio, String name, String zhu, String address, String ben, Date cheng,
			String checks) {
		super();
		this.id = id;
		this.guan = guan;
		this.maio = maio;
		this.name = name;
		this.zhu = zhu;
		this.address = address;
		this.ben = ben;
		this.cheng = cheng;
		this.checks = checks;
	}
	
	
	
	
}
