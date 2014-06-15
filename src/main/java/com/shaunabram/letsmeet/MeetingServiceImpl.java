package com.shaunabram.letsmeet;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Override
    public String doStuff() {
        return "stuff";
    }

	@Override
	public List<Meeting> getAllMeetings() {
		Meeting tstMeeting = new Meeting(1L, "tstMeeting");
		return Lists.newArrayList(tstMeeting);
	}

}
