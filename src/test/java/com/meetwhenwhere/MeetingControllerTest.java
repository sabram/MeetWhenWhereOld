package com.meetwhenwhere;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static com.meetwhenwhere.MeetingFixtures.*;

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
		List<Meeting> expectedMeetings = Lists.newArrayList(MEETING);
		when(meetingService.getAllMeetings()).thenReturn(expectedMeetings);

		//call method under test
		List<Meeting> meetings = meetingController.meetings();

		//verify results
		verify(meetingService).getAllMeetings();
		assertThat(meetings).containsExactly(MEETING);
	}

}
