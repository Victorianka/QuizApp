package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    int quizScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(submitButtonOnClickListener);
    }

    /**
     * This method checks answer for Q1
     */

    private String getQuestionOneUserInput() {
        EditText userInputQuesOne = (EditText) findViewById(R.id.ques1_text);
        String answerOne = userInputQuesOne.getText().toString();
        return answerOne;
    }

    private void checkQuestionOneAnswer() {
        String answerOne = getQuestionOneUserInput();
        if (answerOne.trim().equalsIgnoreCase("though fools rarely differ")) {
            quizScore = quizScore + 1;
        }
    }

    //This is to check answer for Q2

    private void checkQuestionTwoAnswer() {
        RadioButton quesTwoAnswer = (RadioButton) findViewById(R.id.ques2_but2);
        boolean isQuestionTwoChecked = quesTwoAnswer.isChecked();
        if (isQuestionTwoChecked) {
            quizScore = quizScore + 1;
        }
    }

    //This is to check answer for Q3

    private void checkQuestionThreeAnswer() {
        CheckBox questionThreeAnsOne = (CheckBox) findViewById(R.id.ques3_box1);
        CheckBox questionThreeAnsTwo = (CheckBox) findViewById(R.id.ques3_box2);
        CheckBox questionThreeAnsThree = (CheckBox) findViewById(R.id.ques3_box3);
        CheckBox questionThreeAnsFour = (CheckBox) findViewById(R.id.ques3_box4);
        boolean isQuestionThreeAnsOneChecked = questionThreeAnsOne.isChecked();
        boolean isQuestionThreeAnsTwoChecked = questionThreeAnsTwo.isChecked();
        boolean isQuestionThreeAnsThreeChecked = questionThreeAnsThree.isChecked();
        boolean isQuestionThreeAnsFourChecked = questionThreeAnsFour.isChecked();

        if (isQuestionThreeAnsOneChecked && isQuestionThreeAnsTwoChecked && !isQuestionThreeAnsThreeChecked && isQuestionThreeAnsFourChecked) {
            quizScore = quizScore + 1;
        }
    }

    /**
     * This method checks answer for Q4
     */

    private String getQuestionFourUserInput() {
        EditText userInputQuesFour = (EditText) findViewById(R.id.ques4_text);
        String answerFour = userInputQuesFour.getText().toString();
        return answerFour;
    }

    private void checkQuestionFourAnswer() {
        String answerFour = getQuestionFourUserInput();
        if (answerFour.trim().equalsIgnoreCase("make them my friends")) {
            quizScore = quizScore + 1;
        }
    }
    //This is to check answer for Q5

    private void checkQuestionFiveAnswer() {
        RadioButton quesFiveAnswer = (RadioButton) findViewById(R.id.ques2_but2);
        boolean isQuestionTwoChecked = quesFiveAnswer.isChecked();
        if (isQuestionTwoChecked) {
            quizScore = quizScore + 1;
        }
    }

    //This is to check answer for Q6

    private void checkQuestionSixAnswer() {
        CheckBox questionSixAnsOne = (CheckBox) findViewById(R.id.ques6_box1);
        CheckBox questionSixAnsTwo = (CheckBox) findViewById(R.id.ques6_box2);
        CheckBox questionSixAnsThree = (CheckBox) findViewById(R.id.ques6_box3);
        CheckBox questionSixAnsFour = (CheckBox) findViewById(R.id.ques6_box4);
        boolean isQuestionSixAnsOneChecked = questionSixAnsOne.isChecked();
        boolean isQuestionSixAnsTwoChecked = questionSixAnsTwo.isChecked();
        boolean isQuestionSixAnsThreeChecked = questionSixAnsThree.isChecked();
        boolean isQuestionSixAnsFourChecked = questionSixAnsFour.isChecked();

        if (isQuestionSixAnsOneChecked && isQuestionSixAnsTwoChecked && isQuestionSixAnsThreeChecked && isQuestionSixAnsFourChecked) {
            quizScore = quizScore + 1;
        }
    }

    private void checkAllQuestions() {
        checkQuestionOneAnswer();
        checkQuestionTwoAnswer();
        checkQuestionThreeAnswer();
        checkQuestionFourAnswer();
        checkQuestionFiveAnswer();
        checkQuestionSixAnswer();
    }

    //This is to reset the count to 0
    private void resetCounterCorrectAnswers() {
        quizScore = 0;
    }

    //This is to display total score in toast
    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            checkAllQuestions();
            if (quizScore == 6) {
                Toast.makeText(MainActivity.this, "Correct Answers: " + quizScore + "/6! You rock!!",
                        Toast.LENGTH_LONG).show();
                resetCounterCorrectAnswers();
            } else if (quizScore == 0){
                Toast.makeText(MainActivity.this, "Corrent Answers: " + quizScore + "/6. You can do better!",
                        Toast.LENGTH_LONG).show();
                resetCounterCorrectAnswers();
            } else {
                Toast.makeText(MainActivity.this, "Corrent Answers: " + quizScore + "/6. You can do better!",
                        Toast.LENGTH_LONG).show();
                resetCounterCorrectAnswers();
            }
        }
    };
}

