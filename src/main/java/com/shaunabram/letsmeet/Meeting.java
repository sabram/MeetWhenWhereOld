package com.shaunabram.letsmeet;

public class Meeting {

    private Integer id;
    private String name;

	public Meeting() {}//needed for json posts

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
	public String toString() {
		return "Meeting{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Meeting meeting = (Meeting) o;

		if (id != null ? !id.equals(meeting.id) : meeting.id != null) return false;
		if (name != null ? !name.equals(meeting.name) : meeting.name != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}
