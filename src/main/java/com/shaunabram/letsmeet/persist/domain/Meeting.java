package com.shaunabram.letsmeet.persist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "MEETING")
public class Meeting {

	@Id
	@Column(name = "MEETING_ID")
	long id;

	String name;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
