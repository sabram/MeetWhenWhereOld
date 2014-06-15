package com.shaunabram.letsmeet;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ServiceTest {

    @Test
    public void doStuff() {
        Service service = new ServiceImpl();
        String result = service.doStuff();
        assertThat(result).isEqualTo("stuff");
    }
}
