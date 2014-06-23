package com.shaunabram.letsmeet;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MeetingControllerMockMvcTest {

	@Mock
	private MeetingService meetingService;

	@InjectMocks
	private MeetingController meetingController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(meetingController).build();
	}

	@Test
	public void meetings() throws Exception {
		ArrayList<Meeting> meetings = Lists.newArrayList(MeetingFixtures.MEETING);
		when(meetingService.getAllMeetings()).thenReturn(meetings);

		mockMvc.perform(get("/meetings"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$[0].id").value(MeetingFixtures.MEETING.getId()))
				.andExpect(jsonPath("$[0].name").value(MeetingFixtures.MEETING.getName()));

	}
}
