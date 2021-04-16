package com.moodanalyzer;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() {
        if(message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
