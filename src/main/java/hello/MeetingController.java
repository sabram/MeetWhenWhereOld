package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	public MeetingController() {
		System.out.println("In MeetingController constructor");
	}

	@RequestMapping("/meeting")
    public @ResponseBody
	Meeting greeting(
            @RequestParam(value="name", required=false, defaultValue="MyMeeting") String name) {
        return new Meeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}