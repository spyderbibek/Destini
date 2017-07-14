package com.bksapps.destini;

/**
 * Created by spyde on 7/14/2017.
 */

public class StoryModel {
    int mStoryID;
    int mAnswerOne;
    int mAnswerTwo;
    public StoryModel(int storyResourceID, int answerOneResourceID, int answerTwoResourceID){
        this.mStoryID=storyResourceID;
        this.mAnswerOne=answerOneResourceID;
        this.mAnswerTwo=answerTwoResourceID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswerOne() {
        return mAnswerOne;
    }

    public void setAnswerOne(int answerOne) {
        mAnswerOne = answerOne;
    }

    public int getAnswerTwo() {
        return mAnswerTwo;
    }

    public void setAnswerTwo(int answerTwo) {
        mAnswerTwo = answerTwo;
    }
}
