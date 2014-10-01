package com.meetwhenwhere;

import com.meetwhenwhere.model.Meeting;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class MeetingServiceITest {

	@Inject
	@SuppressWarnings("SpringJavaAutowiringInspection") //IntelliJ doesn't seem to parse out annotations too well. All runs OK.
	MeetingService meetingService;

	@Test
	public void testAutowiringWorks_and_service_returns_data_from_dao() {
		List<Meeting> meetings = meetingService.getAllMeetings();
		assertThat(meetings.get(0).getName()).isEqualTo("tstMeetingFromDao");
	}

}
