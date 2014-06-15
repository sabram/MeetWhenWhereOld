package com.shaunabram.letsmeet;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MeetingServiceTest {

    @Test
    public void doStuff() {
        MeetingService meetingService = new MeetingServiceImpl();
        String result = meetingService.doStuff();
        assertThat(result).isEqualTo("stuff");
    }
}
