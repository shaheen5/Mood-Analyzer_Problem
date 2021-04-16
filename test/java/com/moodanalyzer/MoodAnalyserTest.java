package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad(){
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String mood=moodanalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String mood=moodanalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
}

