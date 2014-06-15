package com.shaunabram.letsmeet;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MeetingControllerTest {

	@Mock
	private MeetingService meetingService;

	@InjectMocks
	private MeetingController meetingController;

	@Test
	public void testMeetingControllerConstructorUsingDI() {
		MeetingService returnedService = meetingController.getMeetingService();
		assertThat(returnedService).isNotNull();
	}

	@Test
	public void meetings_returns_meetings_from_service() {
		Meeting tstMeeting = new Meeting(1L, "tstMeeting");
		List<Meeting> expectedMeetings = Lists.newArrayList(tstMeeting);
		when(meetingService.getAllMeetings()).thenReturn(expectedMeetings);

		//call method under test
		List<Meeting> meetings = meetingController.meetings();

		//verify results
		assertThat(meetings).containsExactly(tstMeeting);
	}

}
