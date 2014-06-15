package com.shaunabram.letsmeet;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class MeetingServiceTest {

    @Test
    public void doStuff() {
        MeetingService meetingService = new MeetingServiceImpl();
        String result = meetingService.doStuff();
        assertThat(result).isEqualTo("stuff");
    }

	@Test
	public void getAllMeetings() {
		MeetingService meetingService = new MeetingServiceImpl();
		List<Meeting> allMeetings = meetingService.getAllMeetings();
		Meeting tstMeeting = new Meeting(1L, "tstMeeting");
		assertThat(allMeetings).containsExactly(tstMeeting);
	}
}
