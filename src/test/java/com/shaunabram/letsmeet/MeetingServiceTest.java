package com.shaunabram.letsmeet;

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

@RunWith(MockitoJUnitRunner.class)
public class MeetingServiceTest {

	@Mock
	private Dao dao;

	@InjectMocks
	MeetingServiceImpl meetingService;

    @Test
    public void doStuff() {
        String result = meetingService.doStuff();
        assertThat(result).isEqualTo("stuff");
    }

	@Test
	public void getAllMeetings_returns_meeting_from_Dao() {
		//setup
		Meeting tstMeeting = new Meeting(1L, "tstMeeting");
		List<Meeting> expectMeetings = Lists.newArrayList(tstMeeting);
		when(dao.getAllMeetings()).thenReturn(expectMeetings);

		//call method under test
		List<Meeting> allMeetings = meetingService.getAllMeetings();

		//verify results
		verify(dao).getAllMeetings();
		assertThat(allMeetings).containsExactly(tstMeeting);
	}
}
