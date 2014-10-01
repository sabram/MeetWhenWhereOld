package com.meetwhenwhere;

import com.meetwhenwhere.model.Meeting;

import java.util.List;

public interface Dao {

    String getStuff();

	List<Meeting> getAllMeetings();

	Meeting addMeeting(Meeting meeting);
}
