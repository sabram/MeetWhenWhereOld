package com.meetwhenwhere.model;

import javax.persistence.*;

@Entity(name = "MEETINGS")
public class Meeting {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "MEETING_ID")
	private Integer id;

	private String name;

	protected Meeting() {}

	public Meeting(String name) {
		this.name = name;
	}

	//for tests?
	public Meeting(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Meeting meeting = (Meeting) o;

		if (!id.equals(meeting.id)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Meeting{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
