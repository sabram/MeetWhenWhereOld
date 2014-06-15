package com.shaunabram.letsmeet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;

@Controller
@RequestMapping("/meetings")
public class MeetingController {

    private final AtomicLong counter = new AtomicLong();

	private static final Logger logger = LoggerFactory.getLogger(MeetingController.class);

    private MeetingService meetingService;

    @Inject
	public MeetingController(MeetingService meetingService) {
		System.out.println("In MeetingController constructor");
        this.meetingService = meetingService;
	}

//	@RequestMapping("/meeting")
//    public @ResponseBody
//	Meeting meeting(
//            @RequestParam(value="name", required=false, defaultValue="MyMeeting") String name) {
//        return new Meeting(counter.incrementAndGet(),
//                            String.format(template, name));
//    }

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	List<Meeting> meetings() {
		System.out.println("Returning all meetings");
		List<Meeting> meetings = new ArrayList<>();
		Meeting m1 = new Meeting(1L, "m1");
		Meeting m2 = new Meeting(2L, "m2");
		meetings.add(m1);
		meetings.add(m2);
		return meetings;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Meeting newMeeting(@RequestBody Meeting meeting) {
		System.out.println("I am in the controller and got meeting: " + meeting);
		Meeting returnMeeting = new Meeting(counter.incrementAndGet(), meeting.getName() + "newMeeting");
		System.out.println("returning meeting: " + returnMeeting);
		return returnMeeting;
	}


    public MeetingService getMeetingService() {
        return meetingService;
    }
}
