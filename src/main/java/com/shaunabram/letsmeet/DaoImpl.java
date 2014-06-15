package com.shaunabram.letsmeet;

import com.google.common.collect.Lists;

import java.util.List;

public class DaoImpl implements Dao {

    @Override
    public String getStuff() {
        return "stuff";
    }

	@Override
	public List<Meeting> getAllMeetings() {
		Meeting tstMeeting = new Meeting(1L, "tstMeeting");
		return Lists.newArrayList(tstMeeting);
	}
}
