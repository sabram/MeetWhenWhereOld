package com.shaunabram.letsmeet;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

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
		Meeting tstMeeting = new Meeting(1L, "tstMeeting");
		assertThat(allMeetings).containsExactly(tstMeeting);
	}
}
