package com.shaunabram.letsmeet;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Repository
public class DaoImpl implements Dao {

	private final Logger logger = LoggerFactory.getLogger(DaoImpl.class);

	public DaoImpl() {
		logger.debug("In DaoImpl constructor");
	}

	@Override
    public String getStuff() {
        return "stuff";
    }

	@Override
	public List<Meeting> getAllMeetings() {
		Meeting tstMeeting = new Meeting(1, "tstMeetingFromDao");
		return Lists.newArrayList(tstMeeting);
	}
}
