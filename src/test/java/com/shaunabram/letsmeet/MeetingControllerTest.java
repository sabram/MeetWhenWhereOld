package com.shaunabram.letsmeet;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class MeetingControllerTest {

    @Test
    public void testDIWorks() {
        MeetingService serviceMock = mock(MeetingService.class);
        MeetingController controller = new MeetingController(serviceMock);
        assertThat(controller.getMeetingService()).isNotNull();

    }
}
