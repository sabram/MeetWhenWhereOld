package com.shaunabram.letsmeet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.fest.assertions.api.Assertions.assertThat;

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

}
