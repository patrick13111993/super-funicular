package com.example.user.wordcounter;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class CounterTest {

    Counter counter;

    @Before
    public void before() {
        counter = new Counter();
    }

    @Test
    public void testWordCounter() {
        int result = counter.getWordCount("Bob Saget");
        assertEquals(2, result);
    }
}
