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
public class OrderMappingIntegrationTests {

	@Autowired
	@Qualifier(value = "entityManager")
	EntityManager manager;

	@Test
	public void thatItemCustomMappingWorks() throws Exception {
		assertTableExists(manager, "NOODLE_ORDERS");
		assertTableExists(manager, "ORDER_ORDER_ITEMS");

		assertTableHasColumn(manager, "NOODLE_ORDERS", "ORDER_ID");
		assertTableHasColumn(manager, "NOODLE_ORDERS", "SUBMISSION_DATETIME");
	}

}
