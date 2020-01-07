package com.example.historyquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    private TextView mScoreView,mQuestion;
    private Button mTrueButton,mFalseButton;
    private Boolean mAnswer;
    private int mscore =0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.points);
        mQuestion = (TextView) findViewById(R.id.question);
        mTrueButton = (Button)findViewById(R.id.trueButton);
        mFalseButton = (Button)findViewById(R.id.falseButton);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer==true){
                    mscore++;
                    updateScore(mscore);

                    if (mQuestionNumber == QuizBook.questions.length){
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore",mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                }else{
                    updateQuestion();
            }

                else{if(mAnswer==true){
                        mscore++;
                       updateScore(mscore);

                        if (mQuestionNumber == QuizBook.questions.length){
                            Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("finalscore",mscore);
                            i.putExtras(bundle);
                            QuizActivity.this.finish();
                            startActivity(i);


    }
    private void updateQuestion(){
        mQuestion.setText(QuizBook.question[mQuestionNumber]);
        mAnswer = QuizBook.answers[mQuestionNumber];
        mQuestionNumber++;


    }
public void updateScore(int point ){
        mScoreView.setText(""+mscore);
}
}
}
                    mFalseButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(mAnswer==false)
                                mscore++;
                                updateScore(mscore);

                                if (mQuestionNumber == QuizBook.questions.length){
                                    Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("finalscore",mscore);
                                    i.putExtras(bundle);
                                    QuizActivity.this.finish();
                                    startActivity(i);
                                }else{
                                    updateQuestion();
                                }

                else{if(mAnswer==true){
                                    mscore++;
                                    updateScore(mscore);

                                    if (mQuestionNumber == QuizBook.questions.length){
                                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("finalscore",mscore);
                                        i.putExtras(bundle);
                                        QuizActivity.this.finish();
                                        startActivity(i);


                                    }
                                    private void updateQuestion(){
                                        mQuestion.setText(QuizBook.question[mQuestionNumber]);
                                        mAnswer = QuizBook.answers[mQuestionNumber];
                                        mQuestionNumber++;


                                    }
                                    public void updateScore(int point ){
                                        mScoreView.setText(""+mscore);
                                    }
                                }
                                }