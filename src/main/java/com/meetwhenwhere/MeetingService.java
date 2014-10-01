package com.meetwhenwhere;

import com.meetwhenwhere.model.Meeting;

import java.util.List;

public interface MeetingService {

    public String doStuff();

	public List<Meeting> getAllMeetings();

	public Meeting addMeeting(Meeting meeting);

}
