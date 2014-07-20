package com.meetwhenwhere.persist;

import com.meetwhenwhere.persist.domain.Meeting;
import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {

}
