package com.bksapps.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare member variable
    TextView story_text;
    Button answer_one_button;
    Button answer_two_button;
    int mIndex;
    StoryModel[] mStoryModel=new StoryModel[]{
            new StoryModel(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryModel(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryModel(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryModel(R.string.T4_End,0,0),
            new StoryModel(R.string.T5_End,0,0),
            new StoryModel(R.string.T6_End,0,0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Wire up the 3 views from the layout to the member variables:

        story_text=(TextView)findViewById(R.id.story_text);
        answer_one_button=(Button)findViewById(R.id.answer_one_button);
        answer_two_button=(Button)findViewById(R.id.answer_two_button);

        story_text.setText(mStoryModel[mIndex].getStoryID());
        if(mStoryModel[mIndex].getAnswerOne()!=0){
            answer_one_button.setText(mStoryModel[mIndex].getAnswerOne());
        }else {
            answer_one_button.setVisibility(View.INVISIBLE);
        }

        if(mStoryModel[mIndex].getAnswerTwo()!=0){
            answer_two_button.setText(mStoryModel[mIndex].getAnswerTwo());
        }else {
            answer_two_button.setVisibility(View.INVISIBLE);
        }


        //Set a listener on the top button:
        answer_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer("one");
            }
        });


        //Set a listener on the bottom button:
        answer_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer("two");
            }
        });
    }

    private void checkAnswer(String userSelection){
        //First Story Conditions
        if(mIndex==0 && userSelection=="one"){
            changeStory(2);
        }else if (mIndex==0 && userSelection=="two"){
            changeStory(1);
        }
        // Second Story Conditions
        else if(mIndex==1 && userSelection=="one"){
            changeStory(2);
        }else if(mIndex==1 && userSelection=="two"){
            changeStory(3);
        }
        //Third Story Conditions
        else if(mIndex==2 && userSelection=="one"){
            changeStory(5);
        }else if(mIndex==2 && userSelection=="two"){
            changeStory(4);
        }

    }

    private void changeStory(int index){
            mIndex=index;
            story_text.setText(mStoryModel[mIndex].getStoryID());
            if(mStoryModel[mIndex].getAnswerOne()!=0){
                answer_one_button.setText(mStoryModel[mIndex].getAnswerOne());
            }else {
                answer_one_button.setVisibility(View.INVISIBLE);
            }

            if(mStoryModel[mIndex].getAnswerTwo()!=0){
                answer_two_button.setText(mStoryModel[mIndex].getAnswerTwo());
            }else {
                answer_two_button.setVisibility(View.INVISIBLE);
            }
    }
}
