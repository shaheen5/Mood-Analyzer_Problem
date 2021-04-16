package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad()throws Exception{
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String mood=moodanalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
}

