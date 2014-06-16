package com.shaunabram.letsmeet;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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
