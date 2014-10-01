package com.meetwhenwhere;

import com.google.common.collect.Lists;
import com.meetwhenwhere.model.Meeting;
import com.meetwhenwhere.persist.repository.MeetingRepository;
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
	private MeetingRepository dao;

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
		String meetingName = "dummy";
		Meeting meeting = new Meeting(meetingName);
		Iterable<Meeting> expectMeetings = Lists.newArrayList(meeting);
//		List<Meeting> meetings = Lists.newArrayList(dao.findAll());
		when(dao.findAll()).thenReturn(expectMeetings);

		//call method under test
		List<Meeting> allMeetings = meetingService.getAllMeetings();

		//verify results
		verify(dao).findAll();
		assertThat(allMeetings).hasSize(1);
		assertThat(allMeetings.get(0).getName()).isEqualTo(meetingName);
	}
}
