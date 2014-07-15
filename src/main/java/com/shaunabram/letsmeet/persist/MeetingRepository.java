package com.shaunabram.letsmeet.persist;

import com.shaunabram.letsmeet.persist.domain.Meeting;
import com.shaunabram.letsmeet.persist.domain.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {

}
