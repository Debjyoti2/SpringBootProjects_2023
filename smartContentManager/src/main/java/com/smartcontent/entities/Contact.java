package com.smartcontent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_contactinfo")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactid;
	
	private String name;
	
	private String nickname;
	
	private String work;
	
	private String email;
	
	private String image;
	
	@Column(length = 500)
	private String desciption;
	
	private String phoneno;

	
	@ManyToOne
	private User user;
	
	

	public Contact() {
		super();
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDesc() {
		return desciption;
	}

	public void setDesc(String desciption) {
		this.desciption = desciption;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
