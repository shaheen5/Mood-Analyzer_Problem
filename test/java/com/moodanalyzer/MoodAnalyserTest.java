package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodanalyser=new MoodAnalyser("I am in sad mood");
        String mood=moodanalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser=new MoodAnalyser("I am in happy mood");
        String mood=moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_ShouldReturnHappy(){
        MoodAnalyser moodanalyser=new MoodAnalyser(null);
        String mood=null;
        try{
            ExpectedException exceptionRule= ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood= moodanalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullMood_ShouldThrowException(){
        MoodAnalyser moodanalyser=new MoodAnalyser(null);
        try{
            moodanalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter proper mood",e.getMessage());
        }
    }
}