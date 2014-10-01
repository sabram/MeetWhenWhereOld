package com.meetwhenwhere;

import com.google.common.collect.Lists;
import com.meetwhenwhere.model.Meeting;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class DaoImpl implements Dao {

	private final Logger logger = LoggerFactory.getLogger(DaoImpl.class);
	private final List<Meeting> meetings;
	private final AtomicInteger counter = new AtomicInteger();

	public DaoImpl() {
		logger.debug("In DaoImpl constructor");
		meetings = Lists.newArrayList();//poor mans persistence!!
		Meeting tstMeeting = new Meeting(0, "tstMeetingFromDao");
		meetings.add(tstMeeting);
	}

	@Override
    public String getStuff() {
        return "stuff";
    }

	@Override
	public List<Meeting> getAllMeetings() {
		return meetings;
	}

	@Override
	public Meeting addMeeting(Meeting meeting) {
		Meeting newMeeting = new Meeting(counter.incrementAndGet(), meeting.getName());
		meetings.add(newMeeting);
		return newMeeting;
	}
}
