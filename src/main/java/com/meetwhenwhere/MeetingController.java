package com.meetwhenwhere;

import java.util.List;

import com.google.common.collect.Lists;
import com.meetwhenwhere.model.Meeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;

@Controller
@RequestMapping("/meetings")
public class MeetingController {

	private final Logger logger = LoggerFactory.getLogger(MeetingController.class);

    private final MeetingService meetingService;

    @Inject
	public MeetingController(MeetingService meetingService) {
		logger.debug("In MeetingController constructor");
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
		logger.debug("Returning all meetings");
		List<Meeting> allMeetings = meetingService.getAllMeetings();
		List<Meeting> retMeetings = Lists.newArrayList();
		for (Meeting meeting : allMeetings) {
			Meeting m = new Meeting(meeting.getId(), meeting.getName());
			retMeetings.add(m);
		}
		return retMeetings;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Meeting newMeeting(@RequestBody Meeting meeting) {
		Meeting meeting1 = meetingService.addMeeting(meeting);
		return new Meeting(meeting1.getId(), meeting1.getName());

//		System.out.println("I am in the controller and got meeting: " + meeting);
//		Meeting returnMeeting = new Meeting(counter.incrementAndGet(), meeting.getName() + "newMeeting");
//		System.out.println("returning meeting: " + returnMeeting);
//		return returnMeeting;
	}


    public MeetingService getMeetingService() {
        return meetingService;
    }
}
