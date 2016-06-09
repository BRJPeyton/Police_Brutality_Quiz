package com.brjpapps.android.policebrutalityquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    TextView final_result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final_result = (TextView) findViewById(R.id.result_text);
        final_result.setEnabled(false);

        btn = (Button)findViewById(R.id.next_page);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent in = new Intent(getApplicationContext(), QuizActivity2.class);
                startActivity(in);
            }
        });
    }

    public void selectForce(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question1_o1:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q1o1ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
            case R.id.question1_o2:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q1o2ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
            case R.id.question1_o3:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q1o3ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
            case R.id.question1_o4:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q1o4ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
        }
    }
}