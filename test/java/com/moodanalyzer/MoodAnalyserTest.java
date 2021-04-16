package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad(){
        MoodAnalyser moodanalyser=new MoodAnalyser("I am in sad mood");
        String mood=moodanalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodanalyser=new MoodAnalyser("I am in happy mood");
        String mood=moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}

