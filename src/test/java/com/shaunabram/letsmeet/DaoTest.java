package com.shaunabram.letsmeet;


import org.junit.Test;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static com.shaunabram.letsmeet.MeetingFixtures.*;

public class DaoTest {

    @Test
    public void getStuff() {
        Dao dao = new DaoImpl();
        String result = dao.getStuff();
        assertThat(result).isEqualTo("stuff");
    }

	@Test
	public void getAllMeetings() {
		Dao dao = new DaoImpl();
		List<Meeting> allMeetings = dao.getAllMeetings();
		assertThat(allMeetings).containsExactly(MEETING);
	}
}
