package com.meetwhenwhere.persist.domain;

import javax.persistence.*;

@Entity(name = "MEETINGS")
public class Meeting {

	@Id
	@Column(name = "MEETING_ID")
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
