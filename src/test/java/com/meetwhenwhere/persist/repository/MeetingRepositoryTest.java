package com.meetwhenwhere.persist.repository;

import com.google.common.collect.Lists;
import com.meetwhenwhere.Application;
import com.meetwhenwhere.persist.domain.Meeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ActiveProfiles(profiles = "test")
public class MeetingRepositoryTest {
	@Autowired
	private MeetingRepository repository;

	@Test
	public void test() {
		String meetingName = "meetingName";
		Meeting meeting = new Meeting(meetingName);
		repository.save(meeting);
		List<Meeting> meetings = Lists.newArrayList(repository.findAll());
		assertThat(meetings).hasSize(1);
		Meeting returnedMeeting = meetings.get(0);
		assertThat(returnedMeeting.getName()).isEqualTo(meetingName);
	}
}