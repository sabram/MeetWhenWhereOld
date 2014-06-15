package com.shaunabram.letsmeet;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class DaoTest {

    @Test
    public void getStuff() {
        Dao dao = new DaoImpl();
        String result = dao.getStuff();
        assertThat(result).isEqualTo("stuff");
    }
}
