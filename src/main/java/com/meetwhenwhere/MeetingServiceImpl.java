package com.meetwhenwhere;

import com.google.common.collect.Lists;
import com.meetwhenwhere.model.Meeting;
import com.meetwhenwhere.persist.repository.MeetingRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MeetingServiceImpl implements MeetingService {

	private final MeetingRepository dao;
	private final Logger logger = LoggerFactory.getLogger(MeetingServiceImpl.class);

	@Inject
	public MeetingServiceImpl(MeetingRepository dao) {
		logger.debug("In MeetingServiceImpl constructor");
		this.dao = dao;
	}

	@Override
    public String doStuff() {
        return "stuff";
    }

	@Override
	public List<Meeting> getAllMeetings() {
		return Lists.newArrayList(dao.findAll());
	}

	@Override
	public Meeting addMeeting(Meeting meeting) {
		Meeting m = new Meeting(meeting.getName());
		return dao.save(m);
	}
}
