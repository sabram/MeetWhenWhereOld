package com.shaunabram.letsmeet.persist;

import com.shaunabram.letsmeet.persist.domain.Meeting;
import com.shaunabram.letsmeet.persist.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfiguration.class})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class MeetingRepositoryIntegrationTests {

	@Autowired
	MeetingRepository meetingRepository;

	@Test
	public void thatItemIsInsertedIntoRepoWorks() throws Exception {
		long key = 1234L;

		Meeting meeting = new Meeting();
		meeting.setId(key);
		meeting.setName("meetingName");

		meetingRepository.save(meeting);

		Meeting retrievedMeeting = meetingRepository.findOne(key);

		assertNotNull(retrievedMeeting);
		assertEquals(key, retrievedMeeting.getId());
	}

}