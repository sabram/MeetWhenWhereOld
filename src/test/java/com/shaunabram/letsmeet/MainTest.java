package com.shaunabram.letsmeet;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void test() {
        Main main = new Main();
        assertThat(main.getMsg()).isEqualTo("HelloWorld!");
    }
}
