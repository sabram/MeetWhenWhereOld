package com.shaunabram.letsmeet;

public class Meeting {

    private long id;
    private String name;

	public Meeting() {}//needed for json posts

    public Meeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
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
}
