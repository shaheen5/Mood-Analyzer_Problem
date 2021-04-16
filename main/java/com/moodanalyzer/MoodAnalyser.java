package com.moodanalyzer;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try{
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper message");
            if(message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper mood");
        }
    }
}
