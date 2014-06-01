package com.shaunabram.letsmeet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class MeetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	private static final Logger logger = LoggerFactory.getLogger(MeetingController.class);

	public MeetingController() {
		System.out.println("In MeetingController constructor");
	}

	@RequestMapping("/meeting")
    public @ResponseBody
	Meeting meeting(
            @RequestParam(value="name", required=false, defaultValue="MyMeeting") String name) {
        return new Meeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

	@RequestMapping("/meetings")
	public @ResponseBody
	List<Meeting> meetings() {
		logger.debug("Returning all meetings");
		List<Meeting> meetings = new ArrayList<>();
		Meeting m1 = new Meeting(1, "m1");
		Meeting m2 = new Meeting(2, "m2");
		meetings.add(m1);
		meetings.add(m2);
		return meetings;
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	@ResponseBody
	public Meeting updateCustomer(@RequestBody Meeting meeting) {
		System.out.println("I am in the controller and got user name: " + meeting.getName());
		return new Meeting(counter.incrementAndGet(), meeting.getName());
	}
}