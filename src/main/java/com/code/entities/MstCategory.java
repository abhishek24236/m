package com.code.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MSTCATEGORY")
public class MstCategory implements Serializable{
	@Id
	@Column(name="CODEID")
	private Long codeid;
	
	@Column(name="CODENAME")
	private String codename;

	public MstCategory(Long codeid, String codename) {
		super();
		this.codeid = codeid;
		this.codename = codename;
	}

	public MstCategory() {
		super();
	}

	public Long getCodeid() {
		return codeid;
	}

	public void setCodeid(Long codeid) {
		this.codeid = codeid;
	}

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	@Override
	public String toString() {
		return "MstCategory [codeid=" + codeid + ", codename=" + codename + "]";
	}
	
}
