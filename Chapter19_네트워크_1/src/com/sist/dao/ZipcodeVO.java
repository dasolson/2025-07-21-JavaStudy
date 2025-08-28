package com.sist.dao;

import lombok.Data;


public class ZipcodeVO {
    private String zipcoode,sido,gugun,dong,bunji,address;

	public String getZipcoode() {
		return zipcoode;
	}

	public void setZipcoode(String zipcoode) {
		this.zipcoode = zipcoode;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGugun() {
		return gugun;
	}

	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getBunji() {
		return bunji;
	}

	public void setBunji(String bunji) {
		this.bunji = bunji;
	}

	public String getAddress() {
		return sido+" "+gugun+" "+dong+" "+bunji;
	}
    
}
