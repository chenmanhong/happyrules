package org.work.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Computer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer  cid  ;
	 private String  cname;
	 private String  csize;
	 @OneToOne
	 private Iphone iphone;

	public Iphone getIphone() {
		return iphone;
	}
	public void setIphone(Iphone iphone) {
		this.iphone = iphone;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsize() {
		return csize;
	}
	public void setCsize(String csize) {
		this.csize = csize;
	}

	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", cname=" + cname + ", csize=" + csize + ", iphone=" + iphone + "]";
	}
	 
}
