package com.meetwhenwhere;

import com.meetwhenwhere.config.JPAConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfiguration.class})
public class MeetingControllerITest {

	@Autowired
	@Qualifier(value = "entityManager")
	EntityManager manager;

	@Inject
	@SuppressWarnings("SpringJavaAutowiringInspection") //IntelliJ doesn't seem to parse out annotations too well. All runs OK.
	MeetingController meetingController;

	@Test
	public void test() {
		List<Meeting> meetings = meetingController.meetings();
		Meeting meeting = meetings.get(0);
		assertThat(meeting.getName()).isEqualTo("tstMeetingFromDao");
	}
}
