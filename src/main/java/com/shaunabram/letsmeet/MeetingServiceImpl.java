package com.shaunabram.letsmeet;

import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Override
    public String doStuff() {
        return "stuff";
    }

}
