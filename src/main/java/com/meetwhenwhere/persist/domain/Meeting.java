package com.meetwhenwhere.persist.domain;

import javax.persistence.*;

@Entity(name = "MEETINGS")
public class Meeting {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "MEETING_ID")
	private Long id;

	private String name;

	protected Meeting() {}

	public Meeting(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
