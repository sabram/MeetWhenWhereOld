package com.meetwhenwhere;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MeetingServiceImpl implements MeetingService {

	private final Dao dao;
	private final Logger logger = LoggerFactory.getLogger(MeetingServiceImpl.class);

	@Inject
	public MeetingServiceImpl(Dao dao) {
		logger.debug("In MeetingServiceImpl constructor");
		this.dao = dao;
	}

	@Override
    public String doStuff() {
        return "stuff";
    }

	@Override
	public List<Meeting> getAllMeetings() {
		return dao.getAllMeetings();
	}

	@Override
	public Meeting addMeeting(Meeting meeting) {
		return dao.addMeeting(meeting);
	}
}
