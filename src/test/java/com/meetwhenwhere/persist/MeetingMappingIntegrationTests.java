package com.meetwhenwhere.persist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static com.meetwhenwhere.persist.JPAAssertions.assertTableExists;
import static com.meetwhenwhere.persist.JPAAssertions.assertTableHasColumn;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfiguration.class})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class MeetingMappingIntegrationTests {

	@Autowired
	@Qualifier(value = "entityManager")
	EntityManager manager;

	@Test
	public void thatItemCustomMappingWorks() throws Exception {
		assertTableExists(manager, "MEETING");

		assertTableHasColumn(manager, "MEETING", "MEETING_ID");
		assertTableHasColumn(manager, "MEETING", "NAME");
	}

}
