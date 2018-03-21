package org.work.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Iphone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer   id;
	 private String   iname;
	 private String   isize;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIsize() {
		return isize;
	}
	public void setIsize(String isize) {
		this.isize = isize;
	}
	@Override
	public String toString() {
		
		return "Iphone [id=" + id + ", iname=" + iname + ", isize=" + isize + "]";
	
	}

	 
	 
	 
	 
	 
	 
	 
	 
}
