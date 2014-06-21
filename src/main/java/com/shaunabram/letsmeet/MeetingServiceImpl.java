package com.shaunabram.letsmeet;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {

	private final Dao dao;

	@Inject
	public MeetingServiceImpl(Dao dao) {
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

}
